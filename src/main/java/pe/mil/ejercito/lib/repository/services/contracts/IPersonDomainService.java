package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.PersonDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IPersonDomainService
 * <p>
 * IPersonDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IPersonDomainService extends
    IGetByIdDomainEntity<Mono<PersonDto>, Long>,
    IGetByUuIdDomainEntity<Mono<PersonDto>, String>,
    ISaveDomainEntity<Mono<PersonDto>, PersonDto>,
    IUpdateDomainEntity<Mono<PersonDto>, PersonDto>,
    IDeleteDomainEntity<Mono<PersonDto>, String> {

    Mono<List<PersonDto>> getAllEntities(String limit, String page, PageableDto pageable);
}