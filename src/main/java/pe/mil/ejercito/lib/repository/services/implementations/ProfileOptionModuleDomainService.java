package pe.mil.ejercito.lib.repository.services.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.mappers.IProfileOptionModuleMapper;
import pe.mil.ejercito.lib.repository.components.validations.IProfileOptionModuleValidation;
import pe.mil.ejercito.lib.repository.dtos.ProfileOptionModuleDto;
import pe.mil.ejercito.lib.repository.repositories.IEpModuleRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpProfileOptionModuleRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpProfileRepository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpModuleEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileOptionModuleEntity;
import pe.mil.ejercito.lib.repository.services.contracts.IProfileOptionModuleDomainService;
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
 * ProfileOptionModuleDomainService
 * <p>
 * ProfileOptionModuleDomainService class.
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
public class ProfileOptionModuleDomainService extends ReactorServiceBase implements IProfileOptionModuleDomainService {

    private final IEpProfileOptionModuleRepository profileOptionModuleRepository;
    private final IEpModuleRepository moduleRepository;
    private final IEpProfileRepository profileRepository;
    private final IProfileOptionModuleMapper profileOptionModuleMapper;

    protected ProfileOptionModuleDomainService(final IEpModuleRepository moduleRepository,
                                               final IEpProfileOptionModuleRepository profileOptionModuleRepository,
                                               final IEpProfileRepository profileRepository,
                                               final IProfileOptionModuleMapper profileOptionModuleMapper) {
        super("ProfileOptionModuleDomainService");
        this.moduleRepository = moduleRepository;
        this.profileOptionModuleRepository = profileOptionModuleRepository;
        this.profileRepository = profileRepository;
        this.profileOptionModuleMapper = profileOptionModuleMapper;
    }

    @Override
    public Mono<ProfileOptionModuleDto> getByIdEntity(Long id) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidId(id))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpProfileOptionModuleEntity> findByIdProfileOptionModuleEntity = this.profileOptionModuleRepository.findById(id);

        return getProfileOptionModuleDto(
            findByIdProfileOptionModuleEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_ID_NOT_EXIST_FORMAT_ERROR);
    }

    @Override
    public Mono<ProfileOptionModuleDto> getByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpProfileOptionModuleEntity> findByUuIdProfileOptionModuleEntity = this.profileOptionModuleRepository.findByUuId(uuId);

        return getProfileOptionModuleDto(
            findByUuIdProfileOptionModuleEntity,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_FORMAT_SUCCESS,
            MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
    }

    @Override
    public Mono<ProfileOptionModuleDto> saveEntity(ProfileOptionModuleDto dto) {
        return doOnSave(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<ProfileOptionModuleDto> updateEntity(ProfileOptionModuleDto dto) {
        return doOnUpdate(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    @Override
    public Mono<ProfileOptionModuleDto> deleteByUuIdEntity(String uuId) {
        if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(uuId))) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_ID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_INVALID_FORMAT_ERROR)));
        }

        final Optional<EpProfileOptionModuleEntity> deleteProfileOptionModuleEntity = this.profileOptionModuleRepository.findByUuId(uuId);

        if (deleteProfileOptionModuleEntity.isEmpty()) {
            log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
            return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
        }

        this.profileOptionModuleRepository.delete(deleteProfileOptionModuleEntity.get());
        return Mono.just(this.profileOptionModuleMapper.mapperToDto(deleteProfileOptionModuleEntity.get()))
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_DELETE_BY_UUID_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<ProfileOptionModuleDto> getProfileOptionModuleDto(Optional<EpProfileOptionModuleEntity> bsEntity, String successMessage, String messageExist) {
        return bsEntity.map(moduleStatusEntity -> Mono.just(this.profileOptionModuleMapper.mapperToDto(moduleStatusEntity))
                .doOnSuccess(success -> log.debug(successMessage))
                .doOnError(throwable -> log.error(throwable.getMessage())))
            .orElseGet(() -> Mono.error(() -> {
                log.error(messageExist);
                return new CommonException(messageExist, ResponseEnum.NOT_FOUNT_ENTITY, List.of(messageExist));
            }));
    }

    private Mono<ProfileOptionModuleDto> doOnSave(ProfileOptionModuleDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                final EpProfileOptionModuleEntity savEpProfileOptionModuleEntity = this.profileOptionModuleMapper.mapperToEntity(request);

                final Optional<EpModuleEntity> moduleEntity = this.moduleRepository.findByUuId(request.getModule());

                if (moduleEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final Optional<EpProfileEntity> profileEntity = this.profileRepository.findByUuId(request.getProfile());

                if (profileEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                savEpProfileOptionModuleEntity.setUuId(UUID.randomUUID().toString());
                savEpProfileOptionModuleEntity.setPosModule(moduleEntity.get());
                savEpProfileOptionModuleEntity.setPosProfile(profileEntity.get());
                savEpProfileOptionModuleEntity.setPosCreateDate(Instant.now());
                final EpProfileOptionModuleEntity entityResult = this.profileOptionModuleRepository.save(savEpProfileOptionModuleEntity);
                return Mono.just(this.profileOptionModuleMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<ProfileOptionModuleDto> doOnUpdate(ProfileOptionModuleDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {

                if (Boolean.TRUE.equals(CommonRequestHelper.isInvalidUuId(request.getUuId()))) {
                    log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_DATA_ENTITY_UUID, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                final Optional<EpProfileOptionModuleEntity> updateProfileOptionModuleEntity = this.profileOptionModuleRepository.findByUuId(request.getUuId());

                if (updateProfileOptionModuleEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final Optional<EpProfileEntity> profileEntity = this.profileRepository.findByUuId(request.getProfile());

                if (profileEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }
                final Optional<EpModuleEntity> moduleEntity = this.moduleRepository.findByUuId(request.getModule());

                if (moduleEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_NOT_EXIST_FORMAT_ERROR)));
                }

                final EpProfileOptionModuleEntity entityUpdate = updateProfileOptionModuleEntity.get();
                entityUpdate.setPosModule(moduleEntity.get());
                entityUpdate.setPosProfile(profileEntity.get());
                entityUpdate.setPosPrivileges(request.getPrivileges());

                entityUpdate.setPosUpdateDate(Instant.now());
                final EpProfileOptionModuleEntity entityResult = this.profileOptionModuleRepository.save(entityUpdate);
                entityResult.setPosModule(moduleEntity.get());
                entityResult.setPosProfile(profileEntity.get());
                return Mono.just(this.profileOptionModuleMapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<ProfileOptionModuleDto> doOnValidateResponse(ProfileOptionModuleDto dto) {
        return IProfileOptionModuleValidation.doOnValidationResponse().apply(dto)
            .flatMap(validation -> {
                if (ProcessResult.PROCESS_FAILED.equals(validation.getProcessResult())) {
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_RESPONSE_DATA, validation.getErrors()));
                }
                return Mono.just(dto);
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }


    @Override
    public Mono<List<ProfileOptionModuleDto>> getAllEntities(String module, String profile, String limit, String page, PageableDto pageable) {

        Pageable paging = PageRequest.of(Integer.parseInt(page) - 1, Integer.parseInt(limit));
        Page<EpProfileOptionModuleEntity> entityPage = this.profileOptionModuleRepository.findAll(module, profile, paging);
        List<ProfileOptionModuleDto> profileOptionModules = this.profileOptionModuleMapper.mapperToList(entityPage.getContent());
        return Mono.just(profileOptionModules)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}


