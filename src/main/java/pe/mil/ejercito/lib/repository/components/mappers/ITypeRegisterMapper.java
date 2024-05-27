package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.TypeRegisterDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpTypeRegisterEntity;

import java.util.List;

/**
 * ITypeRegisterMapper
 * <p>
 * ITypeRegisterMapper interface.
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
public interface ITypeRegisterMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "trUnit.uuId", source = "unit")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "trDescription", source = "description")
    @Mapping(target = "trCreatedDate", source = "created")
    @Mapping(target = "trUpdatedDate", source = "updated")
    @Mapping(target = "epDocumentRegisters", ignore = true)
    @Mapping(target = "epUnitConfigurations", ignore = true)
    EpTypeRegisterEntity mapperToEntity(TypeRegisterDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "unit", source = "trUnit.uuId")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "trDescription")
    @Mapping(target = "created", source = "trCreatedDate")
    @Mapping(target = "updated", source = "trUpdatedDate")
    TypeRegisterDto mapperToDto(EpTypeRegisterEntity source);

    List<TypeRegisterDto> mapperToList(Iterable<EpTypeRegisterEntity> entities);
}