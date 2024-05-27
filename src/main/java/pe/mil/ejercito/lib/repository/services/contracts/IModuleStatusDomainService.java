package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.ModuleStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IModuleStatusDomainService
 * <p>
 * IModuleStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IModuleStatusDomainService extends
    IGetAllDomainEntity<Mono<List<ModuleStatusDto>>>,
    IGetByIdDomainEntity<Mono<ModuleStatusDto>, Long>,
    IGetByUuIdDomainEntity<Mono<ModuleStatusDto>, String>,
    ISaveDomainEntity<Mono<ModuleStatusDto>, ModuleStatusDto>,
    IUpdateDomainEntity<Mono<ModuleStatusDto>, ModuleStatusDto>,
    IDeleteDomainEntity<Mono<ModuleStatusDto>, String> {
}
