package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.PersonDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpPersonEntity;

import java.util.List;

/**
 * IPersonMapper
 * <p>
 * IPersonMapper interface.
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
public interface IPersonMapper {
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "peName", source = "name")
    @Mapping(target = "peLastname", source = "lastName")
    @Mapping(target = "peChasqui", source = "email")
    @Mapping(target = "peDocument", source = "document")
    @Mapping(target = "peCip", source = "cip")
    @Mapping(target = "epUsers", ignore = true)
    EpPersonEntity mapperToEntity(PersonDto source);

    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "name", source = "peName")
    @Mapping(target = "lastName", source = "peLastname")
    @Mapping(target = "cip", source = "peCip")
    @Mapping(target = "document", source = "peDocument")
    @Mapping(target = "email", source = "peChasqui")
    PersonDto mapperToDto(EpPersonEntity source);

    List<PersonDto> mapperToList(List<EpPersonEntity> entities);
}


