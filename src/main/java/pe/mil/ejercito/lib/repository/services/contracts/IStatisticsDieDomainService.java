package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDieDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDieDomainService
 * <p>
 * IStatisticsDieDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDieDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDieDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDieDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDieDto>, StatisticsDieDto>,
    IUpdateDomainEntity<Mono<StatisticsDieDto>, StatisticsDieDto>,
    IDeleteDomainEntity<Mono<StatisticsDieDto>, String> {
    Mono<List<StatisticsDieDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}