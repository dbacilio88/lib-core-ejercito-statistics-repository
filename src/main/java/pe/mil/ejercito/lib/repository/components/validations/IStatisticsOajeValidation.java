package pe.mil.ejercito.lib.repository.components.validations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pe.mil.ejercito.lib.repository.dtos.StatisticsOajeDto;
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
 * IStatisticsOajeValidation
 * <p>
 * IStatisticsOajeValidation interface.
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
public interface IStatisticsOajeValidation extends Function<StatisticsOajeDto, Mono<ProcessValidationResult>> {
    Logger log = LogManager.getLogger(IStatisticsOajeValidation.class);

    static IStatisticsOajeValidation doOnValidationResponse() {
        return oajeDto -> {
            ProcessValidationResult validationResult = ProcessValidationResult.builder().processResult(ProcessResult.PROCESS_SUCCESS).build();
            List<String> errors = new ArrayList<>();

            if (Boolean.TRUE.equals(inValidStatisticsOajeParameter(oajeDto))) {
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

    static boolean inValidStatisticsOajeParameter(final StatisticsOajeDto valid) {
        return Objects.isNull(valid.getId())
            || Objects.isNull(valid.getUuId())
            || CommonRequestHelper.isInvalidId(valid.getId())
            || CommonRequestHelper.isInvalidUuId(valid.getUuId());
    }
}