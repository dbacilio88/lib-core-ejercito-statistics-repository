package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.UnitDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IUnitDomainService
 * <p>
 * IUnitDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IUnitDomainService extends
    IGetByIdDomainEntity<Mono<UnitDto>, Long>,
    IGetByUuIdDomainEntity<Mono<UnitDto>, String>,
    ISaveDomainEntity<Mono<UnitDto>, UnitDto>,
    IUpdateDomainEntity<Mono<UnitDto>, UnitDto>,
    IDeleteDomainEntity<Mono<UnitDto>, String> {
    Mono<List<UnitDto>> getAllEntities(String brigade, String status, String limit, String page, PageableDto pageable);
}