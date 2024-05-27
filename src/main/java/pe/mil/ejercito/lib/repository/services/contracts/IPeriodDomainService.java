package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.PeriodDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IPeriodDomainService
 * <p>
 * IPeriodDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IPeriodDomainService extends
    IGetByIdDomainEntity<Mono<PeriodDto>, Long>,
    IGetByUuIdDomainEntity<Mono<PeriodDto>, String>,
    ISaveDomainEntity<Mono<PeriodDto>, PeriodDto>,
    IUpdateDomainEntity<Mono<PeriodDto>, PeriodDto>,
    IDeleteDomainEntity<Mono<PeriodDto>, String> {

    Mono<List<PeriodDto>> getAllEntities(String status, String limit, String page, PageableDto pageable);
}