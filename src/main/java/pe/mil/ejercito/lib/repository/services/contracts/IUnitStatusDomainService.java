package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.UnitStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IUnitStatusDomainService
 * <p>
 * IUnitStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IUnitStatusDomainService extends
    IGetAllDomainEntity<Mono<List<UnitStatusDto>>>,
    IGetByIdDomainEntity<Mono<UnitStatusDto>, Long>,
    IGetByUuIdDomainEntity<Mono<UnitStatusDto>, String>,
    ISaveDomainEntity<Mono<UnitStatusDto>, UnitStatusDto>,
    IUpdateDomainEntity<Mono<UnitStatusDto>, UnitStatusDto>,
    IDeleteDomainEntity<Mono<UnitStatusDto>, String> {
}