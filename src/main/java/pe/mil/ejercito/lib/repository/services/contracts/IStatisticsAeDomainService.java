package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsAeDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsAeDomainService
 * <p>
 * IStatisticsAeDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsAeDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsAeDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsAeDto>, String>,
    ISaveDomainEntity<Mono<StatisticsAeDto>, StatisticsAeDto>,
    IUpdateDomainEntity<Mono<StatisticsAeDto>, StatisticsAeDto>,
    IDeleteDomainEntity<Mono<StatisticsAeDto>, String> {
    Mono<List<StatisticsAeDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}