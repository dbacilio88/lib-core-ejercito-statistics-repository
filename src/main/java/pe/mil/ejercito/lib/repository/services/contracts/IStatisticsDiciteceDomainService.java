package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDiciteceDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IStatisticsDiciteceDomainService
 * <p>
 * IStatisticsDiciteceDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDiciteceDomainService extends
    IGetByIdDomainEntity<Mono<StatisticsDiciteceDto>, Long>,
    IGetByUuIdDomainEntity<Mono<StatisticsDiciteceDto>, String>,
    ISaveDomainEntity<Mono<StatisticsDiciteceDto>, StatisticsDiciteceDto>,
    IUpdateDomainEntity<Mono<StatisticsDiciteceDto>, StatisticsDiciteceDto>,
    IDeleteDomainEntity<Mono<StatisticsDiciteceDto>, String> {
    Mono<List<StatisticsDiciteceDto>> getAllEntities(String document, String limit, String page, PageableDto pageable);
}