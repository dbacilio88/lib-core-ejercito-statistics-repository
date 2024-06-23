package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDisaleDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDisaleDomainService
 * <p>
 * IStatisticsDisaleDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDisaleDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDisaleDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDisaleDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDisaleDto>, StatisticsDisaleDto>,
    IUpdateDomainEntity<Mono<StatisticsDisaleDto>, StatisticsDisaleDto>,
    IDeleteDomainEntity<Mono<StatisticsDisaleDto>, String> {
    Mono<List<StatisticsDisaleDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}