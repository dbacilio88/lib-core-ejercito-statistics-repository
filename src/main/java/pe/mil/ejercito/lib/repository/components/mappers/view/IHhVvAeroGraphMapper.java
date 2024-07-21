package pe.mil.ejercito.lib.repository.components.mappers.view;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.graphql.HhVvAeroGraphDto;
import pe.mil.ejercito.lib.repository.repositories.views.EpHhVvAeroGraphView;

import java.util.List;

/**
 * IHhVvAeroGraphMapper
 * <p>
 * IHhVvAeroGraphMapper interface.
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
public interface IHhVvAeroGraphMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "unit", source = "magvUnit")
    @Mapping(target = "typeManto", source = "magvTypeManto")
    @Mapping(target = "division", source = "magvDivision")
    @Mapping(target = "count", source = "magvCount")
    HhVvAeroGraphDto mapperToDto(EpHhVvAeroGraphView source);

    List<HhVvAeroGraphDto> mapperToList(Iterable<EpHhVvAeroGraphView> entities);
}