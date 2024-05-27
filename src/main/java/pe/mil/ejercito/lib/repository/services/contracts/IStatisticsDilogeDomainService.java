package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDilogeDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDilogeDomainService
 * <p>
 * IStatisticsDilogeDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDilogeDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDilogeDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDilogeDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDilogeDto>, StatisticsDilogeDto>,
    IUpdateDomainEntity<Mono<StatisticsDilogeDto>, StatisticsDilogeDto>,
    IDeleteDomainEntity<Mono<StatisticsDilogeDto>, String> {
    Mono<List<StatisticsDilogeDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}