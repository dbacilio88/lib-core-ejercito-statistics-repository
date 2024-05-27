package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.UserDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IUserDomainService
 * <p>
 * IUserDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IUserDomainService extends
        IGetByIdDomainEntity<Mono<UserDto>, Long>,
        IGetByUuIdDomainEntity<Mono<UserDto>, String>,
        ISaveDomainEntity<Mono<UserDto>, UserDto>,
        IUpdateDomainEntity<Mono<UserDto>, UserDto>,
        IDeleteDomainEntity<Mono<UserDto>, String> {

    Mono<List<UserDto>> getAllEntities(String status, String profile, String person, String limit, String page, PageableDto pageable);

    Mono<UserDto> getByUsernameEntity(String username);
}