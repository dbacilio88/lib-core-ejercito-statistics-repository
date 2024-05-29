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
    @Mapping(target = "stdDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")
    @Mapping(target = "stdStrategicObjectives", source = "strategicObjectives")
    @Mapping(target = "stdStrategicActivities", source = "strategicActivities")
    @Mapping(target = "stdStrategicAdvance", source = "strategicAdvance")
    @Mapping(target = "stdActivities", source = "activities")
    @Mapping(target = "stdTask", source = "task")
    @Mapping(target = "stdProcessName", source = "processName")
    @Mapping(target = "stdProcessType", source = "processType")
    @Mapping(target = "stdProcessLevel1", source = "processLevel1")
    @Mapping(target = "stdProcessLevel2", source = "processLevel2")
    @Mapping(target = "stdProcessTotal", source = "processTotal")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDiplaneEntity mapperToEntity(StatisticsDiplaneDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stdDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")
    @Mapping(target = "strategicObjectives", source = "stdStrategicObjectives")
    @Mapping(target = "strategicActivities", source = "stdStrategicActivities")
    @Mapping(target = "strategicAdvance", source = "stdStrategicAdvance")
    @Mapping(target = "activities", source = "stdActivities")
    @Mapping(target = "task", source = "stdTask")
    @Mapping(target = "processName", source = "stdProcessName")
    @Mapping(target = "processType", source = "stdProcessType")
    @Mapping(target = "processLevel1", source = "stdProcessLevel1")
    @Mapping(target = "processLevel2", source = "stdProcessLevel2")
    @Mapping(target = "processTotal", source = "stdProcessTotal")
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiplaneDto mapperToDto(EpStatisticsDiplaneEntity source);

    List<StatisticsDiplaneDto> mapperToList(Iterable<EpStatisticsDiplaneEntity> entities);
}