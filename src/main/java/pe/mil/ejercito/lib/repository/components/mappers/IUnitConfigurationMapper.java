package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.UnitConfigurationDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUnitConfigurationEntity;

import java.util.List;

/**
 * IUnitConfigurationMapper
 * <p>
 * IUnitConfigurationMapper interface.
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
public interface IUnitConfigurationMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "ucUnit.uuId", source = "unit")
    @Mapping(target = "file", source = "file")
    @Mapping(target = "ucTypeRegister.uuId", source = "typeRegister")
    @Mapping(target = "ucConfigurationValue", source = "template")
    EpUnitConfigurationEntity mapperToEntity(UnitConfigurationDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "file", source = "file")
    @Mapping(target = "unit", source = "ucUnit.uuId")
    @Mapping(target = "typeRegister", source = "ucTypeRegister.uuId")
    @Mapping(target = "template", source = "ucConfigurationValue")
    UnitConfigurationDto mapperToDto(EpUnitConfigurationEntity source);

    List<UnitConfigurationDto> mapperToList(Iterable<EpUnitConfigurationEntity> entities);
}