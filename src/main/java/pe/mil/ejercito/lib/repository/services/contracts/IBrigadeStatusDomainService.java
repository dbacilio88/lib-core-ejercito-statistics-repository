package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.BrigadeStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IBrigadeStatusDomainService
 * <p>
 * IBrigadeStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IBrigadeStatusDomainService extends
    IGetAllDomainEntity<Mono<List<BrigadeStatusDto>>>,
    IGetByIdDomainEntity<Mono<BrigadeStatusDto>, Long>,
    IGetByUuIdDomainEntity<Mono<BrigadeStatusDto>, String>,
    ISaveDomainEntity<Mono<BrigadeStatusDto>, BrigadeStatusDto>,
    IUpdateDomainEntity<Mono<BrigadeStatusDto>, BrigadeStatusDto>,
    IDeleteDomainEntity<Mono<BrigadeStatusDto>, String> {
}