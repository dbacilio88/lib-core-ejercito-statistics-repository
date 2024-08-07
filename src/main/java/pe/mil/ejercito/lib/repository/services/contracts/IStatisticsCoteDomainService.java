package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsCoteDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsCoteDomainService
 * <p>
 * IStatisticsCoteDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsCoteDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsCoteDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsCoteDto>, String>,
    ISaveDomainEntity<Mono<StatisticsCoteDto>, StatisticsCoteDto>,
    IUpdateDomainEntity<Mono<StatisticsCoteDto>, StatisticsCoteDto>,
    IDeleteDomainEntity<Mono<StatisticsCoteDto>, String> {
    Mono<List<StatisticsCoteDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}