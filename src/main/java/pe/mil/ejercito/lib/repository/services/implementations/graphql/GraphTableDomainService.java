package pe.mil.ejercito.lib.repository.services.implementations.graphql;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.mappers.ICuadroAeroDataMapper;
import pe.mil.ejercito.lib.repository.components.mappers.IDocumentationDivisionMapper;
import pe.mil.ejercito.lib.repository.components.mappers.IHhVvAeroGraphMapper;
import pe.mil.ejercito.lib.repository.components.mappers.IMantoAeroGraphMapper;
import pe.mil.ejercito.lib.repository.dtos.graphql.CuadroAeroDataDto;
import pe.mil.ejercito.lib.repository.dtos.graphql.DocumentationDivisionDto;
import pe.mil.ejercito.lib.repository.dtos.graphql.HhVvAeroGraphDto;
import pe.mil.ejercito.lib.repository.dtos.graphql.MantoAeroGraphDto;
import pe.mil.ejercito.lib.repository.repositories.IEpCuadroAeroDataRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpDocumentationDivisionRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpHhVvAeroGraphRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpMantoAeroGraphRepository;
import pe.mil.ejercito.lib.repository.repositories.views.EpCuadroAeroDataView;
import pe.mil.ejercito.lib.repository.repositories.views.EpDocumentationDivisionView;
import pe.mil.ejercito.lib.repository.repositories.views.EpHhVvAeroGraphView;
import pe.mil.ejercito.lib.repository.repositories.views.EpMantoAeroGraphView;
import pe.mil.ejercito.lib.repository.services.contracts.graphql.IGraphTableDomainService;
import pe.mil.ejercito.lib.utils.services.base.ReactorServiceBase;
import reactor.core.publisher.Mono;

import java.util.List;

import static pe.mil.ejercito.lib.utils.constants.BaseLoggerServicesConstant.MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS;

/**
 * GraphTableDomainService
 * <p>
 * GraphTableDomainService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Log4j2
@Service
public class GraphTableDomainService extends ReactorServiceBase implements IGraphTableDomainService {

    private final IEpDocumentationDivisionRepository documentationDivisionRepository;
    private final IDocumentationDivisionMapper documentationDivisionMapper;
    private final IEpCuadroAeroDataRepository mantoAeroDataRepository;
    private final IEpMantoAeroGraphRepository mantoAeroGraphRepository;
    private final IEpHhVvAeroGraphRepository hhVvAeroGraphRepository;
    private final ICuadroAeroDataMapper mantoAeroDataMapper;
    private final IMantoAeroGraphMapper mantoAeroGraphMapper;
    private final IHhVvAeroGraphMapper hhVvAeroGraphMapper;

    public GraphTableDomainService(final IEpDocumentationDivisionRepository documentationDivisionRepository,
                                   final IDocumentationDivisionMapper documentationDivisionMapper,
                                   final IEpCuadroAeroDataRepository mantoAeroDataRepository,
                                   final IEpMantoAeroGraphRepository mantoAeroGraphRepository,
                                   final IEpHhVvAeroGraphRepository hhVvAeroGraphRepository,
                                   final ICuadroAeroDataMapper mantoAeroDataMapper,
                                   final IMantoAeroGraphMapper mantoAeroGraphMapper,
                                   final IHhVvAeroGraphMapper hhVvAeroGraphMapper) {
        super("DocumentationDivisionDomainService");
        this.documentationDivisionRepository = documentationDivisionRepository;
        this.documentationDivisionMapper = documentationDivisionMapper;
        this.mantoAeroDataRepository = mantoAeroDataRepository;
        this.mantoAeroGraphRepository = mantoAeroGraphRepository;
        this.hhVvAeroGraphRepository = hhVvAeroGraphRepository;
        this.mantoAeroDataMapper = mantoAeroDataMapper;
        this.mantoAeroGraphMapper = mantoAeroGraphMapper;
        this.hhVvAeroGraphMapper = hhVvAeroGraphMapper;
    }

    @Override
    public Mono<List<DocumentationDivisionDto>> getAllDocumentationDivisions() {
        final Iterable<EpDocumentationDivisionView> persistenceEntities = this.documentationDivisionRepository.findAll();
        final List<DocumentationDivisionDto> list = this.documentationDivisionMapper.mapperToList(persistenceEntities);
        return Mono.just(list)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<List<CuadroAeroDataDto>> getAllMantoAeroData(String type) {
        final Iterable<EpCuadroAeroDataView> persistenceEntities = this.mantoAeroDataRepository.findAll(type);
        final List<CuadroAeroDataDto> list = this.mantoAeroDataMapper.mapperToList(persistenceEntities);
        return Mono.just(list)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<List<MantoAeroGraphDto>> getAllMantoAeroGraph(String type) {
        final Iterable<EpMantoAeroGraphView> persistenceEntities = this.mantoAeroGraphRepository.findAll(type);
        final List<MantoAeroGraphDto> list = this.mantoAeroGraphMapper.mapperToList(persistenceEntities);
        log.info("MantoAeroGraphDto {}", list);
        return Mono.just(list)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    public Mono<List<HhVvAeroGraphDto>> getAllHhVvAeroGraph(String type) {
        final Iterable<EpHhVvAeroGraphView> persistenceEntities = this.hhVvAeroGraphRepository.findAll(type);
        final List<HhVvAeroGraphDto> list = this.hhVvAeroGraphMapper.mapperToList(persistenceEntities);
        log.info("HhVvAeroGraphDto {}", list);
        return Mono.just(list)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}