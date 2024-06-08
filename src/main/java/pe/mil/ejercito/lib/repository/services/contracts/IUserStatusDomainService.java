package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.UserStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IUserStatusDomainService
 * <p>
 * IUserStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IUserStatusDomainService extends
    IGetAllDomainEntity<Mono<List<UserStatusDto>>>,
    IGetByIdDomainEntity<Mono<UserStatusDto>, Long>,
    IGetByUuIdDomainEntity<Mono<UserStatusDto>, String>,
    IGetByCodeDomainEntity<Mono<UserStatusDto>, String>,
    ISaveDomainEntity<Mono<UserStatusDto>, UserStatusDto>,
    IUpdateDomainEntity<Mono<UserStatusDto>, UserStatusDto>,
    IDeleteDomainEntity<Mono<UserStatusDto>, String> {
}
