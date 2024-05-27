package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDiradneDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDiradneDomainService
 * <p>
 * IStatisticsDiradneDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDiradneDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDiradneDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDiradneDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDiradneDto>, StatisticsDiradneDto>,
    IUpdateDomainEntity<Mono<StatisticsDiradneDto>, StatisticsDiradneDto>,
    IDeleteDomainEntity<Mono<StatisticsDiradneDto>, String> {
    Mono<List<StatisticsDiradneDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}