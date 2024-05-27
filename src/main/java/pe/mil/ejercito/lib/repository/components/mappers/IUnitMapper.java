package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.UnitDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUnitEntity;

import java.util.List;

/**
 * IUnitMapper
 * <p>
 * IUnitMapper interface.
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
public interface IUnitMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "unBrigade.uuId", source = "brigade")
    @Mapping(target = "unCode", source = "code")
    @Mapping(target = "unName", source = "name")
    @Mapping(target = "unDescription", source = "description")
    @Mapping(target = "unCreatedDate", source = "created")
    @Mapping(target = "unUpdatedDate", source = "updated")
    @Mapping(target = "unStatus.uuId", source = "status")
    @Mapping(target = "unUbigeo", source = "ubigeo")
    @Mapping(target = "epDivisions", ignore = true)
    @Mapping(target = "epUnitConfigurations", ignore = true)
    @Mapping(target = "epDocumentRegisters", ignore = true)
    EpUnitEntity mapperToEntity(UnitDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "status", source = "unStatus.uuId")
    @Mapping(target = "code", source = "unCode")
    @Mapping(target = "name", source = "unName")
    @Mapping(target = "description", source = "unDescription")
    @Mapping(target = "created", source = "unCreatedDate")
    @Mapping(target = "updated", source = "unUpdatedDate")
    @Mapping(target = "brigade", source = "unBrigade.uuId")
    @Mapping(target = "ubigeo", source = "unUbigeo")
    UnitDto mapperToDto(EpUnitEntity source);

    List<UnitDto> mapperToList(Iterable<EpUnitEntity> entities);
}