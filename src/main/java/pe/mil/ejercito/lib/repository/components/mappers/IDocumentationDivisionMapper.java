package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.graphql.DocumentationDivisionDto;
import pe.mil.ejercito.lib.repository.repositories.views.EpDocumentationDivisionView;

import java.util.List;

/**
 * IDocumentationDivisionMapper
 * <p>
 * IDocumentationDivisionMapper interface.
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
public interface IDocumentationDivisionMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "division", source = "ddvDivisionName")
    @Mapping(target = "brigade", source = "ddvBrigadeName")
    @Mapping(target = "unit", source = "ddvUnitName")
    @Mapping(target = "periods", source = "ddvPeriods")
    DocumentationDivisionDto mapperToDto(EpDocumentationDivisionView source);

    List<DocumentationDivisionDto> mapperToList(Iterable<EpDocumentationDivisionView> entities);
}