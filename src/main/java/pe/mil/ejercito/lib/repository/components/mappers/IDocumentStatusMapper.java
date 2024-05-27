package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.DocumentStatusDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDocumentStatusEntity;

import java.util.List;

/**
 * IDocumentStatusMapper
 * <p>
 * IDocumentStatusMapper interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL
)
public interface IDocumentStatusMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "dsCode", source = "code")
    @Mapping(target = "dsName", source = "name")
    @Mapping(target = "dsClass", source = "style")
    @Mapping(target = "dsIcon", source = "icon")
    @Mapping(target = "dsDescription", source = "description")
    @Mapping(target = "epDocumentRegisters", ignore = true)
    EpDocumentStatusEntity mapperToEntity(DocumentStatusDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "code", source = "dsCode")
    @Mapping(target = "name", source = "dsName")
    @Mapping(target = "style", source = "dsClass")
    @Mapping(target = "icon", source = "dsIcon")
    @Mapping(target = "description", source = "dsDescription")
    DocumentStatusDto mapperToDto(EpDocumentStatusEntity source);

    List<DocumentStatusDto> mapperToList(Iterable<EpDocumentStatusEntity> entities);
}