package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.DocumentRegisterDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDocumentRegisterEntity;

import java.util.List;

/**
 * IDocumentRegisterMapper
 * <p>
 * IDocumentRegisterMapper interface.
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
public interface IDocumentRegisterMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "drUnit.uuId", source = "unit")
    @Mapping(target = "drPeriod.uuId", source = "period")
    @Mapping(target = "drTypeRegister.uuId", source = "typeRegister")
    @Mapping(target = "drStatus.uuId", source = "status")
    @Mapping(target = "drName", source = "name")
    @Mapping(target = "drCreatedDate", source = "created")
    @Mapping(target = "drUpdatedDate", source = "updated")
    @Mapping(target = "epStatisticsAes", ignore = true)
    EpDocumentRegisterEntity mapperToEntity(DocumentRegisterDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "unit", source = "drUnit.uuId")
    @Mapping(target = "period", source = "drPeriod.uuId")
    @Mapping(target = "typeRegister", source = "drTypeRegister.uuId")
    @Mapping(target = "status", source = "drStatus.uuId")
    @Mapping(target = "name", source = "drName")
    @Mapping(target = "created", source = "drCreatedDate")
    @Mapping(target = "updated", source = "drUpdatedDate")
    DocumentRegisterDto mapperToDto(EpDocumentRegisterEntity source);

    List<DocumentRegisterDto> mapperToList(Iterable<EpDocumentRegisterEntity> entities);
}