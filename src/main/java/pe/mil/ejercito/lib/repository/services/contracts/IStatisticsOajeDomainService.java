package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsOajeDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsOajeDomainService
 * <p>
 * IStatisticsOajeDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsOajeDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsOajeDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsOajeDto>, String>,
    ISaveDomainEntity<Mono<StatisticsOajeDto>, StatisticsOajeDto>,
    IUpdateDomainEntity<Mono<StatisticsOajeDto>, StatisticsOajeDto>,
    IDeleteDomainEntity<Mono<StatisticsOajeDto>, String> {
    Mono<List<StatisticsOajeDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}