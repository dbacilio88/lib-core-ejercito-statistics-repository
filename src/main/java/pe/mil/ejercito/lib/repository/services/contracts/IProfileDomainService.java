package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.ProfileDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IProfileDomainService
 * <p>
 * IProfileDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IProfileDomainService extends
    IGetByIdDomainEntity<Mono<ProfileDto>, Long>,
    IGetByUuIdDomainEntity<Mono<ProfileDto>, String>,
    ISaveDomainEntity<Mono<ProfileDto>, ProfileDto>,
    IUpdateDomainEntity<Mono<ProfileDto>, ProfileDto>,
    IDeleteDomainEntity<Mono<ProfileDto>, String> {

    Mono<List<ProfileDto>> getAllEntities(String status, String limit, String page, PageableDto pageable);
}