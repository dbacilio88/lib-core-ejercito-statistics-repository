package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.DivisionDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDivisionEntity;

import java.util.List;

/**
 * IDivisionMapper
 * <p>
 * IDivisionMapper interface.
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
public interface IDivisionMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "diStatus.uuId", source = "status")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "diCreatedDate", source = "created")
    @Mapping(target = "diUpdatedDate", source = "updated")
    @Mapping(target = "epBrigades", ignore = true)
    EpDivisionEntity mapperToEntity(DivisionDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "status", source = "diStatus.uuId")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "created", source = "diCreatedDate")
    @Mapping(target = "updated", source = "diUpdatedDate")
    DivisionDto mapperToDto(EpDivisionEntity source);

    List<DivisionDto> mapperToList(Iterable<EpDivisionEntity> entities);
}