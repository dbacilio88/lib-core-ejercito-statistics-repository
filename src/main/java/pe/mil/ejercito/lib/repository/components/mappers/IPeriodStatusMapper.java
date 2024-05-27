package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.PeriodStatusDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpPeriodStatusEntity;

import java.util.List;

/**
 * IPeriodStatusMapper
 * <p>
 * IPeriodStatusMapper interface.
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
public interface IPeriodStatusMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "psCode", source = "code")
    @Mapping(target = "psName", source = "name")
    @Mapping(target = "psDescription", source = "description")
    @Mapping(target = "epPeriods", ignore = true)
    EpPeriodStatusEntity mapperToEntity(PeriodStatusDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "code", source = "psCode")
    @Mapping(target = "name", source = "psName")
    @Mapping(target = "description", source = "psDescription")
    PeriodStatusDto mapperToDto(EpPeriodStatusEntity source);

    List<PeriodStatusDto> mapperToList(Iterable<EpPeriodStatusEntity> entities);
}