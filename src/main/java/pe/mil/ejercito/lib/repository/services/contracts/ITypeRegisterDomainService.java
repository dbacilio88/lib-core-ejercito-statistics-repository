package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.TypeRegisterDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * ITypeRegisterDomainService
 * <p>
 * ITypeRegisterDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface ITypeRegisterDomainService extends
        IGetByIdDomainEntity<Mono<TypeRegisterDto>, Long>,
        IGetByUuIdDomainEntity<Mono<TypeRegisterDto>, String>,
        ISaveDomainEntity<Mono<TypeRegisterDto>, TypeRegisterDto>,
        IUpdateDomainEntity<Mono<TypeRegisterDto>, TypeRegisterDto>,
        IDeleteDomainEntity<Mono<TypeRegisterDto>, String> {
    Mono<List<TypeRegisterDto>> getAllEntities(String unit, String limit, String page, PageableDto pageable);
}