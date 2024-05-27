package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.DivisionDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IDivisionDomainService
 * <p>
 * IDivisionDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IDivisionDomainService extends
    IGetByIdDomainEntity<Mono<DivisionDto>, Long>,
    IGetByUuIdDomainEntity<Mono<DivisionDto>, String>,
    ISaveDomainEntity<Mono<DivisionDto>, DivisionDto>,
    IUpdateDomainEntity<Mono<DivisionDto>, DivisionDto>,
    IDeleteDomainEntity<Mono<DivisionDto>, String> {

    Mono<List<DivisionDto>> getAllEntities(String status, String limit, String page, PageableDto pageable);
}