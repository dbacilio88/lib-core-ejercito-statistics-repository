package pe.mil.ejercito.lib.repository.components.mappers.view;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.graphql.DieGraphDto;
import pe.mil.ejercito.lib.repository.repositories.views.EpDieGraphView;

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
public interface IDieGraphMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "unit", source = "amUnit")
    @Mapping(target = "typesMeasurements", source = "amTypesMeasurements")
    @Mapping(target = "type", source = "amType")
    @Mapping(target = "activity", source = "amActivity")
    @Mapping(target = "ene", source = "amEne")
    @Mapping(target = "feb", source = "amFeb")
    @Mapping(target = "mar", source = "amMar")
    @Mapping(target = "abr", source = "amAbr")
    @Mapping(target = "may", source = "amMay")
    @Mapping(target = "jun", source = "amJun")
    @Mapping(target = "jul", source = "amJul")
    @Mapping(target = "ago", source = "amAgo")
    @Mapping(target = "set", source = "amSet")
    @Mapping(target = "oct", source = "amOct")
    @Mapping(target = "nov", source = "amNov")
    @Mapping(target = "dic", source = "amDic")
    DieGraphDto mapperToDto(EpDieGraphView source);

    List<DieGraphDto> mapperToList(Iterable<EpDieGraphView> entities);
}