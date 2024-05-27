package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.ModuleDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpModuleEntity;

import java.util.List;

/**
 * IModuleMapper
 * <p>
 * IModuleMapper interface.
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
public interface IModuleMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "moModuleStatus.uuId", source = "status")
    @Mapping(target = "moName", source = "name")
    @Mapping(target = "moIsMenu", source = "isMenu")
    @Mapping(target = "moIsComponent", source = "component")
    @Mapping(target = "moIcon", source = "icon")
    @Mapping(target = "moPath", source = "path")
    @Mapping(target = "moOrder", source = "order")
    @Mapping(target = "moGroup", source = "group")
    @Mapping(target = "moCreateDate", source = "createDate")
    @Mapping(target = "moUpdateDate", source = "updateDate")
    @Mapping(target = "epProfileOptionModules", ignore = true)
    EpModuleEntity mapperToEntity(ModuleDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "status", source = "moModuleStatus.uuId")
    @Mapping(target = "name", source = "moName")
    @Mapping(target = "isMenu", source = "moIsMenu")
    @Mapping(target = "component", source = "moIsComponent")
    @Mapping(target = "icon", source = "moIcon")
    @Mapping(target = "path", source = "moPath")
    @Mapping(target = "order", source = "moOrder")
    @Mapping(target = "group", source = "moGroup")
    @Mapping(target = "createDate", source = "moCreateDate")
    @Mapping(target = "updateDate", source = "moUpdateDate")
    @Mapping(target = "children", ignore = true)
    ModuleDto mapperToDto(EpModuleEntity source);

    List<ModuleDto> mapperToList(Iterable<EpModuleEntity> entities);

}


