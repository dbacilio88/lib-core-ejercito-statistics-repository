package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.ModuleDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IModuleDomainService
 * <p>
 * IModuleDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IModuleDomainService extends
    IGetByIdDomainEntity<Mono<ModuleDto>, Long>,
    IGetByUuIdDomainEntity<Mono<ModuleDto>, String>,
    ISaveDomainEntity<Mono<ModuleDto>, ModuleDto>,
    IUpdateDomainEntity<Mono<ModuleDto>, ModuleDto>,
    IDeleteDomainEntity<Mono<ModuleDto>, String> {

    Mono<List<ModuleDto>> getAllEntities(String status, String limit, String page, PageableDto pageable);
}
