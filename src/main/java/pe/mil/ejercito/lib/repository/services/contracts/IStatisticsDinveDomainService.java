package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDinveDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDinveDomainService
 * <p>
 * IStatisticsDinveDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDinveDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDinveDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDinveDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDinveDto>, StatisticsDinveDto>,
    IUpdateDomainEntity<Mono<StatisticsDinveDto>, StatisticsDinveDto>,
    IDeleteDomainEntity<Mono<StatisticsDinveDto>, String> {
    Mono<List<StatisticsDinveDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}