package pe.mil.ejercito.lib.repository.components.validations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pe.mil.ejercito.lib.repository.dtos.ProfileDto;
import pe.mil.ejercito.lib.utils.componets.enums.ProcessResult;
import pe.mil.ejercito.lib.utils.componets.helpers.CommonRequestHelper;
import pe.mil.ejercito.lib.utils.componets.validations.ProcessValidationResult;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import static pe.mil.ejercito.lib.repository.constants.RepositoryConstant.MICROSERVICE_PROCESS_VALIDATION_PARAMETER_REQUIRED;

/**
 * IProfileValidation
 * <p>
 * IProfileValidation interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@FunctionalInterface
public interface IProfileValidation extends Function<ProfileDto, Mono<ProcessValidationResult>> {
    Logger log = LogManager.getLogger(IProfileValidation.class);

    static IProfileValidation doOnValidationResponse() {
        return profileResponse -> {
            ProcessValidationResult validationResult = ProcessValidationResult.builder().processResult(ProcessResult.PROCESS_SUCCESS).build();
            List<String> errors = new ArrayList<>();

            if (Boolean.TRUE.equals(inValidProfileParameter(profileResponse))) {
                log.error(MICROSERVICE_PROCESS_VALIDATION_PARAMETER_REQUIRED);
                errors.add(MICROSERVICE_PROCESS_VALIDATION_PARAMETER_REQUIRED);
            }

            if (!errors.isEmpty()) {
                validationResult.setProcessResult(ProcessResult.PROCESS_FAILED);
                validationResult.setErrors(errors);
            }

            return Mono.just(validationResult);
        };
    }

    static boolean inValidProfileParameter(final ProfileDto valid) {
        return Objects.isNull(valid.getId())
            || Objects.isNull(valid.getUuId())
            || CommonRequestHelper.isInvalidId(valid.getId())
            || CommonRequestHelper.isInvalidUuId(valid.getUuId())
            || Objects.isNull(valid.getName());
    }
}
