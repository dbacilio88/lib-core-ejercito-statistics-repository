package pe.mil.ejercito.lib.repository.services.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.helper.PageableHelper;
import pe.mil.ejercito.lib.repository.components.mappers.IBrigadeMapper;
import pe.mil.ejercito.lib.repository.components.validations.IBrigadeValidation;
import pe.mil.ejercito.lib.repository.dtos.BrigadeDto;
import pe.mil.ejercito.lib.repository.repositories.IEpBrigadeRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpBrigadeStatusRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpDivisionRepository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpBrigadeEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpBrigadeStatusEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDivisionEntity;
import pe.mil.ejercito.lib.repository.services.contracts.IBrigadeDomainService;
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
 * BrigadeDomainService
 * <p>
 * BrigadeDomainService class.
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
public class BrigadeDomainService extends ReactorServiceBase implements IBrigadeDomainService {

    private final IEpBrigadeRepository brigadeRepository;
    private final IEpBrigadeStatusRepository statusRepository;
    private final IEpDivisionRepository divisionRepository;
    private final IBrigadeMapper brigadeMapper;

    public BrigadeDomainService(final IEpBrigadeRepository brigadeRepository,
                                final IEpBrigadeStatusRepository statusRepository,
                                final IEpDivisionRepository divisionRepository,
                                final IBrigadeMapper brigadeMapper) {
        super("BrigadeDomainService");
        this.brigadeRepository = brigadeRepository;
        this.statusRepository = statusRepository;
        this.divisionRepository = divisionRepository;
        this.brigadeMapper = brigadeMapper;
    }

    @Override
    public Mono<BrigadeDto> getByIdEntity(Long id) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidId(id))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpBrigadeEntity> persistenceEntity = this.brigadeRepository.findById(id);

        return getBrigadeDto(
            persistenceEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_NOT_EXIST_FORMAT_ERROR);
    }

    @Override
    public Mono<BrigadeDto> getByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpBrigadeEntity> persistenceEntity = this.brigadeRepository.findByUuId(uuId);

        return getBrigadeDto(
            persistenceEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
    }


    @Override
    public Mono<BrigadeDto> saveEntity(BrigadeDto dto) {
        return doOnSave(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<BrigadeDto> updateEntity(BrigadeDto dto) {
        return doOnUpdate(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    private Mono<BrigadeDto> doOnValidateResponse(BrigadeDto dto) {
        return IBrigadeValidation.doOnValidationResponse().apply(dto)
            .flatMap(validation -> {
                if (ProcessResult.PROCESS_FAILED.equals(validation.getProcessResult())) {
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_RESPONSE_DATA, validation.getErrors()));
                }
                return Mono.just(dto);
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<BrigadeDto> doOnSave(BrigadeDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                final EpBrigadeEntity persistenceEntity = this.brigadeMapper.mapperToEntity(request);

                final Optional<EpDivisionEntity> divisionEntity = this.divisionRepository.findByUuId(request.getDivision());

                if (divisionEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final Optional<EpBrigadeStatusEntity> brigadeStatusEntity = this.statusRepository.findByUuId(request.getStatus());

                if (brigadeStatusEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                persistenceEntity.setUuId(UUID.randomUUID().toString());
                persistenceEntity.setBrStatus(brigadeStatusEntity.get());
                persistenceEntity.setBrDivision(divisionEntity.get());
                persistenceEntity.setBrCreatedDate(Instant.now());

                final EpBrigadeEntity entityResult = this.brigadeRepository.save(persistenceEntity);
                return Mono.just(this.brigadeMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<BrigadeDto> doOnUpdate(BrigadeDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(request.getUuId()))) {
                    log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpBrigadeEntity> brigadeEntity = this.brigadeRepository.findByUuId(request.getUuId());

                if (brigadeEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }


                final Optional<EpBrigadeStatusEntity> brigadeStatusEntity = this.statusRepository.findByUuId(request.getStatus());

                if (brigadeStatusEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final Optional<EpDivisionEntity> divisionEntity = this.divisionRepository.findByUuId(request.getDivision());

                if (divisionEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final EpBrigadeEntity entityUpdate = brigadeEntity.get();
                entityUpdate.setBrStatus(brigadeStatusEntity.get());
                entityUpdate.setBrDivision(divisionEntity.get());
                entityUpdate.setBrCode(request.getCode());
                entityUpdate.setBrName(request.getName());
                entityUpdate.setBrDescription(request.getDescription());
                entityUpdate.setBrUpdatedDate(Instant.now());
                final EpBrigadeEntity entityResult = this.brigadeRepository.save(entityUpdate);
                entityResult.setBrStatus(brigadeStatusEntity.get());
                entityResult.setBrDivision(divisionEntity.get());

                return Mono.just(this.brigadeMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    @Override
    public Mono<BrigadeDto> deleteByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpBrigadeEntity> persistenceEntity = this.brigadeRepository.findByUuId(uuId);

        if (persistenceEntity.isEmpty()) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        this.brigadeRepository.delete(persistenceEntity.get());
        return Mono.just(this.brigadeMapper.mapperToDto(persistenceEntity.get()))
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<BrigadeDto> getBrigadeDto(Optional<EpBrigadeEntity> brEntity, String successMessage, String messageExist) {
        return brEntity.map(brigade -> Mono.just(this.brigadeMapper.mapperToDto(brigade))
                .doOnSuccess(success -> log.debug(successMessage))
                .doOnError(throwable -> log.error(throwable.getMessage())))
            .orElseGet(() -> Mono.error(() -> {
                log.error(messageExist);
                return new CommonException(messageExist, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR));
            }));
    }

    @Override
    public Mono<List<BrigadeDto>> getAllEntities(String division, String status, String limit, String page, PageableDto pageable) {
        Pageable paging = PageRequest.of(Integer.parseInt(page) - 1, Integer.parseInt(limit));
        Page<EpBrigadeEntity> entityPage = this.brigadeRepository.findAll(division, status, paging);
        List<BrigadeDto> brigades = this.brigadeMapper.mapperToList(entityPage.getContent());
        PageableHelper.generatePaginationDetails(entityPage, page, limit, pageable);
        return Mono.just(brigades)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}