package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.UserStatusDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUserStatusEntity;

import java.util.List;

/**
 * IUserStatusMapper
 * <p>
 * IUserStatusMapper interface.
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
public interface IUserStatusMapper {

    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "usName", source = "name")
    @Mapping(target = "usDescription", source = "description")
    @Mapping(target = "usCode", source = "code")
    @Mapping(target = "epUsers", ignore = true)
    EpUserStatusEntity mapperToEntity(UserStatusDto source);

    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "name", source = "usName")
    @Mapping(target = "description", source = "usDescription")
    @Mapping(target = "code", source = "usCode")
    UserStatusDto mapperToDto(EpUserStatusEntity source);

    List<UserStatusDto> mapperToList(Iterable<EpUserStatusEntity> entities);
}


