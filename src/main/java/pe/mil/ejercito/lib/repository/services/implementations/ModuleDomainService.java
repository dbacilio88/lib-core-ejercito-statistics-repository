package pe.mil.ejercito.lib.repository.services.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.helper.PageableHelper;
import pe.mil.ejercito.lib.repository.components.mappers.IModuleMapper;
import pe.mil.ejercito.lib.repository.components.validations.IModuleValidation;
import pe.mil.ejercito.lib.repository.dtos.ModuleDto;
import pe.mil.ejercito.lib.repository.repositories.IEpModuleRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpModuleStatusRepository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpModuleEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpModuleStatusEntity;
import pe.mil.ejercito.lib.repository.services.contracts.IModuleDomainService;
import pe.mil.ejercito.lib.utils.componets.enums.ProcessResult;
import pe.mil.ejercito.lib.utils.componets.enums.ResponseEnum;
import pe.mil.ejercito.lib.utils.componets.exceptions.CommonException;
import pe.mil.ejercito.lib.utils.componets.helpers.CommonRequestHelper;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.base.ReactorServiceBase;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import static pe.mil.ejercito.lib.utils.constants.BaseLoggerServicesConstant.*;

/**
 * ModuleDomainService
 * <p>
 * ModuleDomainService class.
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
public class ModuleDomainService extends ReactorServiceBase implements IModuleDomainService {

    private final IEpModuleRepository moduleRepository;
    private final IEpModuleStatusRepository moduleStatusRepository;
    private final IModuleMapper moduleMapper;

    protected ModuleDomainService(final IEpModuleRepository moduleRepository,
                                  final IEpModuleStatusRepository moduleStatusRepository,
                                  final IModuleMapper moduleMapper) {
        super("ModuleStatusDomainService");
        this.moduleRepository = moduleRepository;
        this.moduleStatusRepository = moduleStatusRepository;
        this.moduleMapper = moduleMapper;
    }

    @Override
    public Mono<ModuleDto> getByIdEntity(Long id) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidId(id))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpModuleEntity> findByIdModuleEntity = this.moduleRepository.findEntityById(id);

        return getModuleDto(
            findByIdModuleEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_NOT_EXIST_FORMAT_ERROR);
    }

    @Override
    public Mono<ModuleDto> getByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpModuleEntity> findByUuIdModuleEntity = this.moduleRepository.findByUuId(uuId);

        return getModuleDto(
            findByUuIdModuleEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
    }

    @Override
    public Mono<ModuleDto> saveEntity(ModuleDto dto) {
        return doOnSave(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<ModuleDto> updateEntity(ModuleDto dto) {
        return doOnUpdate(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    @Override
    public Mono<ModuleDto> deleteByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpModuleEntity> deleteModuleEntity = this.moduleRepository.findByUuId(uuId);

        if (deleteModuleEntity.isEmpty()) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
        }

        this.moduleRepository.delete(deleteModuleEntity.get());
        return Mono.just(this.moduleMapper.mapperToDto(deleteModuleEntity.get()))
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<ModuleDto> getModuleDto(Optional<EpModuleEntity> bsEntity, String successMessage, String messageExist) {
        return bsEntity.map(moduleStatusEntity -> Mono.just(this.moduleMapper.mapperToDto(moduleStatusEntity))
                .doOnSuccess(success -> log.debug(successMessage))
                .doOnError(throwable -> log.error(throwable.getMessage())))
            .orElseGet(() -> Mono.error(() -> {
                log.error(messageExist);
                return new CommonException(messageExist, ResponseEnum.NOT_FOUNT_ENTITY, List.of(messageExist));
            }));
    }

    private Mono<ModuleDto> doOnSave(ModuleDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                final EpModuleEntity saveModuleEntity = this.moduleMapper.mapperToEntity(request);

                final Optional<EpModuleStatusEntity> moduleStatusEntity = this.moduleStatusRepository.findByUuId(request.getStatus());

                if (moduleStatusEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                saveModuleEntity.setUuId(UUID.randomUUID().toString());
                saveModuleEntity.setMoModuleStatus(moduleStatusEntity.get());
                saveModuleEntity.setMoCreateDate(Instant.now());
                final EpModuleEntity entityResult = this.moduleRepository.save(saveModuleEntity);
                return Mono.just(this.moduleMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<ModuleDto> doOnUpdate(ModuleDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(request.getUuId()))) {
                    log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpModuleEntity> updateModuleEntity = this.moduleRepository.findByUuId(request.getUuId());

                if (updateModuleEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final Optional<EpModuleStatusEntity> moduleStatusEntity = this.moduleStatusRepository.findByUuId(request.getStatus());

                if (moduleStatusEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final EpModuleEntity entityUpdate = updateModuleEntity.get();
                entityUpdate.setMoModuleStatus(moduleStatusEntity.get());
                entityUpdate.setMoTitle(request.getTitle());
                entityUpdate.setMoLevel(request.getLevel());
                entityUpdate.setMoIsChild(request.getChild());
                entityUpdate.setMoIcon(request.getIcon());
                entityUpdate.setMoType(request.getType());
                entityUpdate.setMoPath(request.getPath());
                entityUpdate.setMoFather(request.getFather());
                entityUpdate.setMoUpdateDate(Instant.now());
                final EpModuleEntity entityResult = this.moduleRepository.save(entityUpdate);
                entityResult.setMoModuleStatus(moduleStatusEntity.get());
                return Mono.just(this.moduleMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<ModuleDto> doOnValidateResponse(ModuleDto dto) {
        return IModuleValidation.doOnValidationResponse().apply(dto)
            .flatMap(validation -> {
                if (ProcessResult.PROCESS_FAILED.equals(validation.getProcessResult())) {
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_RESPONSE_DATA, validation.getErrors()));
                }
                return Mono.just(dto);
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<List<ModuleDto>> getAllEntities(String status, String limit, String page, PageableDto pageable) {
        Pageable paging = PageRequest.of(Integer.parseInt(page) - 1, Integer.parseInt(limit));
        Page<EpModuleEntity> entityPage = this.moduleRepository.findAll(status, paging);
        List<ModuleDto> result = this.moduleMapper.mapperToList(entityPage.getContent());
        List<ModuleDto> modules = result.stream().filter(m -> m.getFather() == 0)
            .map(m -> ModuleDto.builder()
                .id(m.getId())
                .uuId(m.getUuId())
                .status(m.getStatus())
                .title(m.getTitle())
                .level(m.getLevel())
                .child(m.getChild())
                .icon(m.getIcon())
                .type(m.getType())
                .father(m.getFather())
                .path(m.getPath())
                .createDate(m.getCreateDate())
                .updateDate(m.getUpdateDate())
                .children(result.stream().filter(c -> c.getFather().equals(m.getId()))
                    .collect(Collectors.toList()))
                .build())
            .collect(Collectors.toList());
        PageableHelper.generatePaginationDetails(entityPage, page, limit, pageable);
        return Mono.just(modules)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<List<ModuleDto>> getAllEntities(String status, String profile) {

        List<EpModuleEntity> fatherList = this.moduleRepository.findAll();

        Set<Long> longs = new HashSet<>();

        if (!fatherList.isEmpty()) {
            longs = fatherList.stream()
                .filter(father -> !father.getMoIsChild())
                .map(EpModuleEntity::getId)
                .collect(Collectors.toSet());
        }
        List<EpModuleEntity> childList = this.moduleRepository.findAll(longs, profile);
        List<ModuleDto> fatherMapper = this.moduleMapper.mapperToList(fatherList);
        List<ModuleDto> childMapper = this.moduleMapper.mapperToList(childList);

        List<ModuleDto> modules = fatherMapper.stream()
            .filter(ff -> ff.getFather() == 0)
            .map(m -> ModuleDto.builder()
                .id(m.getId())
                .uuId(m.getUuId())
                .status(m.getStatus())
                .title(m.getTitle())
                .level(m.getLevel())
                .child(m.getChild())
                .icon(m.getIcon())
                .type(m.getType())
                .path(m.getPath())
                .father(m.getFather())

                .children(childMapper.stream().filter(fc -> fc.getFather().equals(m.getId())).collect(Collectors.toList()))
                .build()
            )
            .filter(fr -> !fr.getChildren().isEmpty())
            .collect(Collectors.toList());

        return Mono.just(modules)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


}


