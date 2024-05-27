package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.BrigadeStatusDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpBrigadeStatusEntity;

import java.util.List;

/**
 * IBrigadeStatusMapper
 * <p>
 * IBrigadeStatusMapper interface.
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
public interface IBrigadeStatusMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "bsCode", source = "code")
    @Mapping(target = "bsName", source = "name")
    @Mapping(target = "bsDescription", source = "description")
    @Mapping(target = "epBrigades", ignore = true)
    EpBrigadeStatusEntity mapperToEntity(BrigadeStatusDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "code", source = "bsCode")
    @Mapping(target = "name", source = "bsName")
    @Mapping(target = "description", source = "bsDescription")
    BrigadeStatusDto mapperToDto(EpBrigadeStatusEntity source);

    List<BrigadeStatusDto> mapperToList(Iterable<EpBrigadeStatusEntity> entities);
}