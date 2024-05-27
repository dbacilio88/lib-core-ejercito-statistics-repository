package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.ProfileDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileEntity;

import java.util.List;

/**
 * IProfileMapper
 * <p>
 * IProfileMapper interface.
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
public interface IProfileMapper {

    @Mapping(target = "prProfileStatus.uuId", source = "status")
    @Mapping(target = "prName", source = "name")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "epProfileOptionModules", ignore = true)
    @Mapping(target = "epUsers", ignore = true)
    EpProfileEntity mapperToEntity(ProfileDto source);

    @Mapping(target = "status", source = "prProfileStatus.uuId")
    @Mapping(target = "name", source = "prName")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "id", source = "id")
    ProfileDto mapperToDto(EpProfileEntity source);

    List<ProfileDto> mapperToList(Iterable<EpProfileEntity> entities);
}


