package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDiplaneDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDiplaneDomainService
 * <p>
 * IStatisticsDiplaneDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDiplaneDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDiplaneDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDiplaneDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDiplaneDto>, StatisticsDiplaneDto>,
    IUpdateDomainEntity<Mono<StatisticsDiplaneDto>, StatisticsDiplaneDto>,
    IDeleteDomainEntity<Mono<StatisticsDiplaneDto>, String> {
    Mono<List<StatisticsDiplaneDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}