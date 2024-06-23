package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsOeeDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsOeeDomainService
 * <p>
 * IStatisticsOeeDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsOeeDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsOeeDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsOeeDto>, String>,
    ISaveDomainEntity<Mono<StatisticsOeeDto>, StatisticsOeeDto>,
    IUpdateDomainEntity<Mono<StatisticsOeeDto>, StatisticsOeeDto>,
    IDeleteDomainEntity<Mono<StatisticsOeeDto>, String> {
    Mono<List<StatisticsOeeDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}