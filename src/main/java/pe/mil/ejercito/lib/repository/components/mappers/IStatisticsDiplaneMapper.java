package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDiplaneDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDiplaneEntity;

import java.util.List;

/**
 * IStatisticsDiplaneMapper
 * <p>
 * IStatisticsDiplaneMapper interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface IStatisticsDiplaneMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")
    @Mapping(target = "stDiplaneStrategicObjectives", source = "strategicObjectives")
    @Mapping(target = "stDiplaneStrategicActivities", source = "strategicActivities")
    @Mapping(target = "stDiplaneStrategicAdvance", source = "strategicAdvance")
    @Mapping(target = "stDiplaneActivities", source = "activities")
    @Mapping(target = "stDiplaneTask", source = "task")
    @Mapping(target = "stDiplaneProcessName", source = "processName")
    @Mapping(target = "stDiplaneProcessType", source = "processType")
    @Mapping(target = "stDiplaneProcessLevel1", source = "processLevel1")
    @Mapping(target = "stDiplaneProcessLevel2", source = "processLevel2")
    @Mapping(target = "stDiplaneProcessTotal", source = "processTotal")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDiplaneEntity mapperToEntity(StatisticsDiplaneDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")
    @Mapping(target = "strategicObjectives", source = "stDiplaneStrategicObjectives")
    @Mapping(target = "strategicActivities", source = "stDiplaneStrategicActivities")
    @Mapping(target = "strategicAdvance", source = "stDiplaneStrategicAdvance")
    @Mapping(target = "activities", source = "stDiplaneActivities")
    @Mapping(target = "task", source = "stDiplaneTask")
    @Mapping(target = "processName", source = "stDiplaneProcessName")
    @Mapping(target = "processType", source = "stDiplaneProcessType")
    @Mapping(target = "processLevel1", source = "stDiplaneProcessLevel1")
    @Mapping(target = "processLevel2", source = "stDiplaneProcessLevel2")
    @Mapping(target = "processTotal", source = "stDiplaneProcessTotal")
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiplaneDto mapperToDto(EpStatisticsDiplaneEntity source);

    List<StatisticsDiplaneDto> mapperToList(Iterable<EpStatisticsDiplaneEntity> entities);
}