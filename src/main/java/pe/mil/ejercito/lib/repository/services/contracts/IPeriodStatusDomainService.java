package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.PeriodStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IPeriodStatusDomainService
 * <p>
 * IPeriodStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IPeriodStatusDomainService extends
    IGetAllDomainEntity<Mono<List<PeriodStatusDto>>>,
    IGetByIdDomainEntity<Mono<PeriodStatusDto>, Long>,
    IGetByUuIdDomainEntity<Mono<PeriodStatusDto>, String>,
    ISaveDomainEntity<Mono<PeriodStatusDto>, PeriodStatusDto>,
    IUpdateDomainEntity<Mono<PeriodStatusDto>, PeriodStatusDto>,
    IDeleteDomainEntity<Mono<PeriodStatusDto>, String> {
}