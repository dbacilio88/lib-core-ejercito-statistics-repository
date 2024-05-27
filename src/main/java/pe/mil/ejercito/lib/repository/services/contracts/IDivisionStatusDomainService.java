package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.DivisionStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IDivisionStatusDomainService
 * <p>
 * IDivisionStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IDivisionStatusDomainService extends
        IGetAllDomainEntity<Mono<List<DivisionStatusDto>>>,
        IGetByIdDomainEntity<Mono<DivisionStatusDto>, Long>,
        IGetByUuIdDomainEntity<Mono<DivisionStatusDto>, String>,
        ISaveDomainEntity<Mono<DivisionStatusDto>, DivisionStatusDto>,
        IUpdateDomainEntity<Mono<DivisionStatusDto>, DivisionStatusDto>,
        IDeleteDomainEntity<Mono<DivisionStatusDto>,String> {
}