package pe.mil.ejercito.lib.repository.services.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.helper.PageableHelper;
import pe.mil.ejercito.lib.repository.components.mappers.IDocumentRegisterMapper;
import pe.mil.ejercito.lib.repository.components.validations.IDocumentRegisterValidation;
import pe.mil.ejercito.lib.repository.dtos.DocumentRegisterDto;
import pe.mil.ejercito.lib.repository.repositories.*;
import pe.mil.ejercito.lib.repository.repositories.entities.*;
import pe.mil.ejercito.lib.repository.services.contracts.IDocumentRegisterDomainService;
import pe.mil.ejercito.lib.utils.componets.enums.ProcessResult;
import pe.mil.ejercito.lib.utils.componets.enums.ResponseEnum;
import pe.mil.ejercito.lib.utils.componets.exceptions.CommonException;
import pe.mil.ejercito.lib.utils.componets.helpers.CommonRequestHelper;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.base.ReactorServiceBase;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static pe.mil.ejercito.lib.utils.constants.BaseLoggerServicesConstant.*;

/**
 * DocumentRegisterDomainService
 * <p>
 * DocumentRegisterDomainService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Log4j2
@Service
public class DocumentRegisterDomainService extends ReactorServiceBase implements IDocumentRegisterDomainService {

    private final IEpDocumentRegisterRepository documentRegisterRepository;
    private final IEpUnitRepository unitRepository;
    private final IEpPeriodRepository periodRepository;
    private final IEpDocumentStatusRepository documentStatusRepository;
    private final IEpTypeRegisterRepository typeRegisterRepository;
    private final IDocumentRegisterMapper documentRegisterMapper;

    public DocumentRegisterDomainService(final IEpDocumentRegisterRepository documentRegisterRepository,
                                         final IEpUnitRepository unitRepository,
                                         final IEpPeriodRepository periodRepository,
                                         final IEpDocumentStatusRepository documentStatusRepository,
                                         final IEpTypeRegisterRepository typeRegisterRepository,
                                         final IDocumentRegisterMapper documentRegisterMapper) {
        super("DocumentRegisterDomainService");
        this.documentRegisterRepository = documentRegisterRepository;
        this.unitRepository = unitRepository;
        this.periodRepository = periodRepository;
        this.documentStatusRepository = documentStatusRepository;
        this.typeRegisterRepository = typeRegisterRepository;
        this.documentRegisterMapper = documentRegisterMapper;
    }

    @Override
    public Mono<DocumentRegisterDto> getByIdEntity(Long id) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidId(id))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpDocumentRegisterEntity> persistenceEntity = this.documentRegisterRepository.findById(id);

        return getDocumentRegisterDto(
            persistenceEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_NOT_EXIST_FORMAT_ERROR);
    }

    @Override
    public Mono<DocumentRegisterDto> getByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpDocumentRegisterEntity> persistenceEntity = this.documentRegisterRepository.findByUuId(uuId);

        return getDocumentRegisterDto(
            persistenceEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
    }


    @Override
    public Mono<DocumentRegisterDto> saveEntity(DocumentRegisterDto dto) {
        return doOnSave(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<DocumentRegisterDto> updateEntity(DocumentRegisterDto dto) {
        return doOnUpdate(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    private Mono<DocumentRegisterDto> doOnValidateResponse(DocumentRegisterDto dto) {
        return IDocumentRegisterValidation.doOnValidationResponse().apply(dto)
            .flatMap(validation -> {
                if (ProcessResult.PROCESS_FAILED.equals(validation.getProcessResult())) {
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_RESPONSE_DATA, validation.getErrors()));
                }
                return Mono.just(dto);
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<DocumentRegisterDto> doOnSave(DocumentRegisterDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {
                final EpDocumentRegisterEntity persistenceEntity = this.documentRegisterMapper.mapperToEntity(request);

                final Optional<EpUnitEntity> unitEntity = this.unitRepository.findByUuId(request.getUnit());
                if (unitEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpTypeRegisterEntity> typeRegisterEntity = this.typeRegisterRepository.findByUuId(request.getTypeRegister());
                if (typeRegisterEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpPeriodEntity> periodEntity = this.periodRepository.findByUuId(request.getPeriod());
                if (periodEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpDocumentStatusEntity> documentStatusEntity = this.documentStatusRepository.findByDsCode(request.getStatus());
                if (documentStatusEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                persistenceEntity.setUuId(UUID.randomUUID().toString());
                persistenceEntity.setDrUnit(unitEntity.get());
                persistenceEntity.setDrTypeRegister(typeRegisterEntity.get());
                persistenceEntity.setDrStatus(documentStatusEntity.get());
                persistenceEntity.setDrPeriod(periodEntity.get());
                persistenceEntity.setDrCreatedDate(Instant.now());

                final EpDocumentRegisterEntity entityResult = this.documentRegisterRepository.save(persistenceEntity);
                return Mono.just(this.documentRegisterMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<DocumentRegisterDto> doOnUpdate(DocumentRegisterDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(request.getUuId()))) {
                    log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpDocumentRegisterEntity> documentRegisterEntity = this.documentRegisterRepository.findByUuId(request.getUuId());
                if (documentRegisterEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }
                final Optional<EpUnitEntity> unitEntity = this.unitRepository.findByUuId(request.getUnit());
                if (unitEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpTypeRegisterEntity> typeRegisterEntity = this.typeRegisterRepository.findByUuId(request.getTypeRegister());
                if (typeRegisterEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }
                final Optional<EpPeriodEntity> periodEntity = this.periodRepository.findByUuId(request.getPeriod());

                if (periodEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }
                final Optional<EpDocumentStatusEntity> documentStatusEntity = this.documentStatusRepository.findByDsCode(request.getStatus());

                if (documentStatusEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final EpDocumentRegisterEntity entityUpdate = documentRegisterEntity.get();
                entityUpdate.setDrUnit(unitEntity.get());
                entityUpdate.setDrTypeRegister(typeRegisterEntity.get());
                entityUpdate.setDrPeriod(periodEntity.get());
                entityUpdate.setDrStatus(documentStatusEntity.get());
                entityUpdate.setDrName(request.getName());
                entityUpdate.setDrUpdatedDate(Instant.now());
                final EpDocumentRegisterEntity entityResult = this.documentRegisterRepository.save(entityUpdate);
                entityResult.setDrUnit(unitEntity.get());
                entityResult.setDrTypeRegister(typeRegisterEntity.get());
                entityResult.setDrPeriod(periodEntity.get());
                entityResult.setDrStatus(documentStatusEntity.get());
                return Mono.just(this.documentRegisterMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    @Override
    public Mono<DocumentRegisterDto> deleteByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpDocumentRegisterEntity> persistenceEntity = this.documentRegisterRepository.findByUuId(uuId);

        if (persistenceEntity.isEmpty()) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        this.documentRegisterRepository.delete(persistenceEntity.get());
        return Mono.just(this.documentRegisterMapper.mapperToDto(persistenceEntity.get()))
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<DocumentRegisterDto> getDocumentRegisterDto(Optional<EpDocumentRegisterEntity> brEntity, String successMessage, String messageExist) {
        return brEntity.map(brigade -> Mono.just(this.documentRegisterMapper.mapperToDto(brigade))
                .doOnSuccess(success -> log.debug(successMessage))
                .doOnError(throwable -> log.error(throwable.getMessage())))
            .orElseGet(() -> Mono.error(() -> {
                log.error(messageExist);
                return new CommonException(messageExist, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR));
            }));
    }

    @Override
    public Mono<List<DocumentRegisterDto>> getAllEntities(String unit, String period, String typeRegister, String status, String limit, String page, PageableDto pageable) {
        Pageable paging = PageRequest.of(Integer.parseInt(page) - 1, Integer.parseInt(limit));
        Page<EpDocumentRegisterEntity> entityPage = this.documentRegisterRepository.findAll(unit, period, typeRegister, status, paging);
        List<DocumentRegisterDto> brigades = this.documentRegisterMapper.mapperToList(entityPage.getContent());
        PageableHelper.generatePaginationDetails(entityPage, page, limit, pageable);
        return Mono.just(brigades)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}