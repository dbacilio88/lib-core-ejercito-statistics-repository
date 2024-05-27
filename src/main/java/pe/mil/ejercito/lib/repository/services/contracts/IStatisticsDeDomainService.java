package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDeDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDeDomainService
 * <p>
 * IStatisticsDeDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDeDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDeDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDeDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDeDto>, StatisticsDeDto>,
    IUpdateDomainEntity<Mono<StatisticsDeDto>, StatisticsDeDto>,
    IDeleteDomainEntity<Mono<StatisticsDeDto>, String> {
    Mono<List<StatisticsDeDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}