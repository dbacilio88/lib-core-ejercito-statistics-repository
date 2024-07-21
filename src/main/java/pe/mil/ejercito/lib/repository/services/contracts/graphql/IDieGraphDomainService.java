package pe.mil.ejercito.lib.repository.services.contracts.graphql;

import pe.mil.ejercito.lib.repository.dtos.graphql.DieGraphDto;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IDieGraphDomainService
 * <p>
 * IDieGraphDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IDieGraphDomainService {

    Mono<List<DieGraphDto>> getAllDieGraph(String type, Long unit);
}