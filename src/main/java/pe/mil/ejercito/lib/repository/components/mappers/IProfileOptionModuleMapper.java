package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.ProfileOptionModuleDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileOptionModuleEntity;

import java.util.List;

/**
 * IProfileOptionModuleMapper
 * <p>
 * IProfileOptionModuleMapper interface.
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
public interface IProfileOptionModuleMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "posProfile.uuId", source = "profile")
    @Mapping(target = "posModule.uuId", source = "module")
    @Mapping(target = "posPrivileges", source = "privileges")
    @Mapping(target = "posCreateDate", source = "createDate")
    @Mapping(target = "posUpdateDate", source = "updateDate")
    EpProfileOptionModuleEntity mapperToEntity(ProfileOptionModuleDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "module", source = "posModule.uuId")
    @Mapping(target = "profile", source = "posProfile.uuId")
    @Mapping(target = "privileges", source = "posPrivileges")
    @Mapping(target = "createDate", source = "posCreateDate")
    @Mapping(target = "updateDate", source = "posUpdateDate")
    @Mapping(target = "modules", ignore = true)
    ProfileOptionModuleDto mapperToDto(EpProfileOptionModuleEntity source);

    List<ProfileOptionModuleDto> mapperToList(Iterable<EpProfileOptionModuleEntity> entities);
}


