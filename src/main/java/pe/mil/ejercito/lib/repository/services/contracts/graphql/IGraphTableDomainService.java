package pe.mil.ejercito.lib.repository.services.contracts.graphql;

import pe.mil.ejercito.lib.repository.dtos.graphql.CuadroAeroDataDto;
import pe.mil.ejercito.lib.repository.dtos.graphql.DocumentationDivisionDto;
import pe.mil.ejercito.lib.repository.dtos.graphql.HhVvAeroGraphDto;
import pe.mil.ejercito.lib.repository.dtos.graphql.MantoAeroGraphDto;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IGraphTableDomainService
 * <p>
 * IGraphTableDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IGraphTableDomainService {

    Mono<List<DocumentationDivisionDto>> getAllDocumentationDivisions();

    Mono<List<CuadroAeroDataDto>> getAllMantoAeroData(String type);

    Mono<List<MantoAeroGraphDto>> getAllMantoAeroGraph(String type);

    Mono<List<HhVvAeroGraphDto>> getAllHhVvAeroGraph(String type);
}