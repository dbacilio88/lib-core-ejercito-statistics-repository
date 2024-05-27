package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.BrigadeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpBrigadeEntity;

import java.util.List;

/**
 * IBrigadeMapper
 * <p>
 * IBrigadeMapper interface.
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
public interface IBrigadeMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "brStatus.uuId", source = "status")
    @Mapping(target = "brCode", source = "code")
    @Mapping(target = "brName", source = "name")
    @Mapping(target = "brDescription", source = "description")
    @Mapping(target = "brCreatedDate", source = "created")
    @Mapping(target = "brUpdatedDate", source = "updated")
    @Mapping(target = "brDivision.uuId", source = "division")
    @Mapping(target = "epUnits", ignore = true)
    EpBrigadeEntity mapperToEntity(BrigadeDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "status", source = "brStatus.uuId")
    @Mapping(target = "code", source = "brCode")
    @Mapping(target = "name", source = "brName")
    @Mapping(target = "description", source = "brDescription")
    @Mapping(target = "created", source = "brCreatedDate")
    @Mapping(target = "updated", source = "brUpdatedDate")
    @Mapping(target = "division", source = "brDivision.uuId")
    BrigadeDto mapperToDto(EpBrigadeEntity source);

    List<BrigadeDto> mapperToList(Iterable<EpBrigadeEntity> entities);
}