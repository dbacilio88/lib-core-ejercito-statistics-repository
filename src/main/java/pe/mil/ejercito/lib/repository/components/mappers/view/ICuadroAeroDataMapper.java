package pe.mil.ejercito.lib.repository.components.mappers.view;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.graphql.CuadroAeroDataDto;
import pe.mil.ejercito.lib.repository.repositories.views.EpCuadroAeroDataView;

import java.util.List;

/**
 * ICuadroAeroDataMapper
 * <p>
 * ICuadroAeroDataMapper interface.
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
public interface ICuadroAeroDataMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "total", source = "total")
    @Mapping(target = "type", source = "mhvType")
    @Mapping(target = "lugar", source = "mhvLugar")
    @Mapping(target = "division", source = "mhvDivision")
    @Mapping(target = "typeHelicopter", source = "mhvTypeHelicopter")
    @Mapping(target = "matricula", source = "mhvMatricula")
    @Mapping(target = "hrsMaintenance", source = "mhvHrsMaintenance")
    @Mapping(target = "maintenance", source = "mhvMaintenance")
    @Mapping(target = "hrsAssigned", source = "mhvHrsAssigned")
    @Mapping(target = "hrsFlown", source = "mhvHrsFlown")
    CuadroAeroDataDto mapperToDto(EpCuadroAeroDataView source);

    List<CuadroAeroDataDto> mapperToList(Iterable<EpCuadroAeroDataView> entities);
}