package pe.mil.ejercito.lib.repository.services.contracts;


import pe.mil.ejercito.lib.repository.dtos.BrigadeDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IBrigadeDomainService
 * <p>
 * IBrigadeDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IBrigadeDomainService extends
    IGetByIdDomainEntity<Mono<BrigadeDto>, Long>,
    IGetByUuIdDomainEntity<Mono<BrigadeDto>, String>,
    ISaveDomainEntity<Mono<BrigadeDto>, BrigadeDto>,
    IUpdateDomainEntity<Mono<BrigadeDto>, BrigadeDto>,
    IDeleteDomainEntity<Mono<BrigadeDto>, String> {

    Mono<List<BrigadeDto>> getAllEntities(String division, String status, String limit, String page, PageableDto pageable);
}