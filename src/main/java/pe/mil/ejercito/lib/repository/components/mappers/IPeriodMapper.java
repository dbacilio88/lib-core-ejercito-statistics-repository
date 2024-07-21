package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.PeriodDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpPeriodEntity;

import java.util.List;

/**
 * IPeriodMapper
 * <p>
 * IPeriodMapper interface.
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
public interface IPeriodMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "peStatus.uuId", source = "status")
    @Mapping(target = "peName", source = "name")
    @Mapping(target = "peDescription", source = "description")
    @Mapping(target = "epDocumentRegisters", ignore = true)
    @Mapping(target = "peDateInit", ignore = true)
    @Mapping(target = "peDateEnd", ignore = true)
    EpPeriodEntity mapperToEntity(PeriodDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "status", source = "peStatus.uuId")
    @Mapping(target = "name", source = "peName")
    @Mapping(target = "description", source = "peDescription")
    PeriodDto mapperToDto(EpPeriodEntity source);

    List<PeriodDto> mapperToList(Iterable<EpPeriodEntity> entities);
}