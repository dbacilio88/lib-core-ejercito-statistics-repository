package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.DocumentStatusDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IDocumentStatusDomainService
 * <p>
 * IDocumentStatusDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IDocumentStatusDomainService extends
    IGetAllDomainEntity<Mono<List<DocumentStatusDto>>>,
    IGetByIdDomainEntity<Mono<DocumentStatusDto>, Long>,
    IGetByUuIdDomainEntity<Mono<DocumentStatusDto>, String>,
    ISaveDomainEntity<Mono<DocumentStatusDto>, DocumentStatusDto>,
    IUpdateDomainEntity<Mono<DocumentStatusDto>, DocumentStatusDto>,
    IDeleteDomainEntity<Mono<DocumentStatusDto>, String> {
}