package pe.mil.ejercito.lib.repository.services.implementations.graphql;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.mappers.view.IDieGraphMapper;
import pe.mil.ejercito.lib.repository.dtos.graphql.DieGraphDto;
import pe.mil.ejercito.lib.repository.repositories.IEpDieGraphRepository;
import pe.mil.ejercito.lib.repository.repositories.views.EpDieGraphView;
import pe.mil.ejercito.lib.repository.services.contracts.graphql.IDieGraphDomainService;
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
public class DieGraphDomainService extends ReactorServiceBase implements IDieGraphDomainService {

    private final IEpDieGraphRepository epDieGraphRepository;
    private final IDieGraphMapper dieGraphMapper;


    public DieGraphDomainService(final IEpDieGraphRepository epDieGraphRepository,
                                 final IDieGraphMapper dieGraphMapper) {
        super("DieGraphDomainService");

        this.epDieGraphRepository = epDieGraphRepository;
        this.dieGraphMapper = dieGraphMapper;
    }

    @Override
    public Mono<List<DieGraphDto>> getAllDieGraph(String type, Long unit) {
        final Iterable<EpDieGraphView> persistenceEntities = this.epDieGraphRepository.findAll(type, unit);
        final List<DieGraphDto> list = this.dieGraphMapper.mapperToList(persistenceEntities);
        return Mono.just(list)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}