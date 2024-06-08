package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.UserDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUserEntity;

import java.util.List;

/**
 * IUserMapper
 * <p>
 * IUserMapper interface.
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
public interface IUserMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "usUsername", source = "username")
    @Mapping(target = "usUpdateDate", source = "updateDate")
    @Mapping(target = "usProfile.uuId", source = "profile")
    @Mapping(target = "usPerson.uuId", source = "person")
    @Mapping(target = "usUnit.uuId", source = "unit")
    @Mapping(target = "usUserStatus.uuId", source = "status")
    @Mapping(target = "usPassword", source = "password")
    @Mapping(target = "usLap", source = "ldap")
    @Mapping(target = "usCategory", source = "category")
    @Mapping(target = "usPhone", source = "phone")
    @Mapping(target = "usEmail", source = "email")
    @Mapping(target = "usCreateDate", source = "createDate")
    EpUserEntity mapperToEntity(UserDto source);

    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "username", source = "usUsername")
    @Mapping(target = "status", source = "usUserStatus.uuId")
    @Mapping(target = "updateDate", source = "usUpdateDate")
    @Mapping(target = "profile", source = "usProfile.uuId")
    @Mapping(target = "person", source = "usPerson.uuId")
    @Mapping(target = "unit", source = "usUnit.uuId")
    @Mapping(target = "password", source = "usPassword")
    @Mapping(target = "ldap", source = "usLap")
    @Mapping(target = "category", source = "usCategory")
    @Mapping(target = "email", source = "usEmail")
    @Mapping(target = "phone", source = "usPhone")
    @Mapping(target = "createDate", source = "usCreateDate")
    UserDto mapperToDto(EpUserEntity source);

    List<UserDto> mapperToList(List<EpUserEntity> entities);

}


