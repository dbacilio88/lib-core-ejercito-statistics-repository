package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.DocumentRegisterDto;
import pe.mil.ejercito.lib.utils.dto.PageableDto;
import pe.mil.ejercito.lib.utils.services.interfaces.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * IDocumentRegisterDomainService
 * <p>
 * IDocumentRegisterDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IDocumentRegisterDomainService extends
    IGetByIdDomainEntity<Mono<DocumentRegisterDto>, Long>,
    IGetByUuIdDomainEntity<Mono<DocumentRegisterDto>, String>,
    ISaveDomainEntity<Mono<DocumentRegisterDto>, DocumentRegisterDto>,
    IUpdateDomainEntity<Mono<DocumentRegisterDto>, DocumentRegisterDto>,
    IDeleteDomainEntity<Mono<DocumentRegisterDto>, String> {
    Mono<List<DocumentRegisterDto>> getAllEntities(String unit, String period, String typeRegister, String status, String limit, String page, PageableDto pageable);
}