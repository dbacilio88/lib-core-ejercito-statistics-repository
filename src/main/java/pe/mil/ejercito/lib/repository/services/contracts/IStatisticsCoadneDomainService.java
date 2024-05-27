package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsCoadneDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsCoadneDomainService
 * <p>
 * IStatisticsCoadneDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsCoadneDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsCoadneDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsCoadneDto>, String>,
    ISaveDomainEntity<Mono<StatisticsCoadneDto>, StatisticsCoadneDto>,
    IUpdateDomainEntity<Mono<StatisticsCoadneDto>, StatisticsCoadneDto>,
    IDeleteDomainEntity<Mono<StatisticsCoadneDto>, String> {
    Mono<List<StatisticsCoadneDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}