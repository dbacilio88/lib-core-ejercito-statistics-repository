package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.ProfileStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IProfileStatusDomainService
 * <p>
 * IProfileStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IProfileStatusDomainService extends
        IGetAllDomainEntity<Mono<List<ProfileStatusDto>>>,
        IGetByIdDomainEntity<Mono<ProfileStatusDto>, Long>,
        IGetByUuIdDomainEntity<Mono<ProfileStatusDto>, String>,
        ISaveDomainEntity<Mono<ProfileStatusDto>, ProfileStatusDto>,
        IUpdateDomainEntity<Mono<ProfileStatusDto>, ProfileStatusDto>,
        IDeleteDomainEntity<Mono<ProfileStatusDto>,String> {
}