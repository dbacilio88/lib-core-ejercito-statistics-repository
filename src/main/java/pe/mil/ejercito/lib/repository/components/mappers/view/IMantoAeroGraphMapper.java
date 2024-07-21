package pe.mil.ejercito.lib.repository.components.mappers.view;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.graphql.MantoAeroGraphDto;
import pe.mil.ejercito.lib.repository.repositories.views.EpMantoAeroGraphView;

import java.util.List;

/**
 * IMantoAeroGraphMapper
 * <p>
 * IMantoAeroGraphMapper interface.
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
public interface IMantoAeroGraphMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "unit", source = "magvUnit")
    @Mapping(target = "typeManto", source = "magvTypeManto")
    @Mapping(target = "maintenance", source = "magvMaintenance")
    @Mapping(target = "typeHelicopter", source = "magvTypeHelicopter")
    @Mapping(target = "ene", source = "magvEne")
    @Mapping(target = "feb", source = "magvFeb")
    @Mapping(target = "mar", source = "magvMar")
    @Mapping(target = "abr", source = "magvAbr")
    @Mapping(target = "may", source = "magvMay")
    @Mapping(target = "jun", source = "magvJun")
    @Mapping(target = "jul", source = "magvJul")
    @Mapping(target = "ago", source = "magvAgo")
    @Mapping(target = "set", source = "magvSet")
    @Mapping(target = "oct", source = "magvOct")
    @Mapping(target = "nov", source = "magvNov")
    @Mapping(target = "dic", source = "magvDic")
    MantoAeroGraphDto mapperToDto(EpMantoAeroGraphView source);

    List<MantoAeroGraphDto> mapperToList(Iterable<EpMantoAeroGraphView> entities);
}