package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.UnitConfigurationDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IUnitConfigurationDomainService
 * <p>
 * IUnitConfigurationDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IUnitConfigurationDomainService extends
    IGetByIdDomainEntity<Mono<UnitConfigurationDto>, Long>,
    IGetByUuIdDomainEntity<Mono<UnitConfigurationDto>, String>,
    ISaveDomainEntity<Mono<UnitConfigurationDto>, UnitConfigurationDto>,
    IUpdateDomainEntity<Mono<UnitConfigurationDto>, UnitConfigurationDto>,
    IDeleteDomainEntity<Mono<UnitConfigurationDto>, String> {
    Mono<UnitConfigurationDto> getUnitByIdAndTypeRegisterByUuId(Long unitId, String typeRegister);

    Mono<List<UnitConfigurationDto>> getAllEntities(String unit, String limit, String page, PageableDto pageable);
}