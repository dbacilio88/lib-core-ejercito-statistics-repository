package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.DivisionStatusDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDivisionStatusEntity;

import java.util.List;

/**
 * IDivisionStatusMapper
 * <p>
 * IDivisionStatusMapper interface.
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
public interface IDivisionStatusMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "dsCode", source = "code")
    @Mapping(target = "dsName", source = "name")
    @Mapping(target = "dsDescription", source = "description")
    @Mapping(target = "epDivisions", ignore = true)
    EpDivisionStatusEntity mapperToEntity(DivisionStatusDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "code", source = "dsName")
    @Mapping(target = "name", source = "dsName")
    @Mapping(target = "description", source = "dsDescription")
    DivisionStatusDto mapperToDto(EpDivisionStatusEntity source);

    List<DivisionStatusDto> mapperToList(Iterable<EpDivisionStatusEntity> entities);
}