package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.ProfileOptionModuleDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IProfileOptionModuleDomainService
 * <p>
 * IProfileOptionModuleDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IProfileOptionModuleDomainService extends
    IGetByIdDomainEntity<Mono<ProfileOptionModuleDto>, Long>,
    IGetByUuIdDomainEntity<Mono<ProfileOptionModuleDto>, String>,
    ISaveDomainEntity<Mono<ProfileOptionModuleDto>, ProfileOptionModuleDto>,
    IUpdateDomainEntity<Mono<ProfileOptionModuleDto>, ProfileOptionModuleDto>,
    IDeleteDomainEntity<Mono<ProfileOptionModuleDto>, String> {

    Mono<List<ProfileOptionModuleDto>> getAllEntities(String module, String profile, String limit, String page, PageableDto pageable);
}
