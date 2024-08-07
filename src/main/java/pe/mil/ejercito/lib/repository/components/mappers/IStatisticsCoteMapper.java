package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsCoteDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsCoteEntity;

import java.util.List;

/**
 * IStatisticsOajeMapper
 * <p>
 * IStatisticsOajeMapper interface.
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
public interface IStatisticsCoteMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stcDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stcTestApprovedOo", source = "testApprovedOo")
    @Mapping(target = "stcTestApprovedTcos", source = "testApprovedTcos")
    @Mapping(target = "stcTestDisapprovedOo", source = "testDisapprovedOo")
    @Mapping(target = "stcTestDisapprovedTcos", source = "testDisapprovedTcos")
    @Mapping(target = "stcBorderSurveillance", source = "borderSurveillance")
    @Mapping(target = "stcHumanitarianDemining", source = "humanitarianDemining")
    @Mapping(target = "stcAgainstOtSl", source = "againstOtSl")
    @Mapping(target = "stcDrugTrafficking", source = "drugTrafficking")
    @Mapping(target = "stcIllegalMinery", source = "illegalMinery")
    @Mapping(target = "stcInternalOrder", source = "internalOrder")
    @Mapping(target = "stcBiologicalThreats", source = "biologicalThreats")
    @Mapping(target = "stcNationalDevelopment", source = "nationalDevelopment")
    @Mapping(target = "stcSinagerd", source = "sinagerd")
    @Mapping(target = "stcElectoralElections", source = "electoralElections")
    @Mapping(target = "stcIllegalLogging", source = "illegalLogging")
    @Mapping(target = "stcIoffensive", source = "ioffensive")
    @Mapping(target = "stcIdefensive", source = "idefensive")
    @Mapping(target = "stcImilitaryAction", source = "imilitaryAction")
    @Mapping(target = "stcIatypicalOperation", source = "iatypicalOperation")
    @Mapping(target = "stcEoffensive", source = "eoffensive")
    @Mapping(target = "stcEdefensive", source = "edefensive")
    @Mapping(target = "stcEmilitaryAction", source = "emilitaryAction")
    @Mapping(target = "stcEatypicalOperation", source = "eatypicalOperation")
    @Mapping(target = "stcInstructionOo", source = "instructionOo")
    @Mapping(target = "stcInstructionTcos", source = "instructionTcos")
    @Mapping(target = "stcInstructionPtsvm", source = "instructionPtsvm")
    @Mapping(target = "stcTrainingOo", source = "trainingOo")
    @Mapping(target = "stcTrainingTcos", source = "trainingTcos")
    @Mapping(target = "stcTrainingPtsvm", source = "trainingPtsvm")


    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsCoteEntity mapperToEntity(StatisticsCoteDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stcDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")

    @Mapping(target = "testApprovedOo", source = "stcTestApprovedOo")
    @Mapping(target = "testApprovedTcos", source = "stcTestApprovedTcos")
    @Mapping(target = "testDisapprovedOo", source = "stcTestDisapprovedOo")
    @Mapping(target = "testDisapprovedTcos", source = "stcTestDisapprovedTcos")
    @Mapping(target = "borderSurveillance", source = "stcBorderSurveillance")
    @Mapping(target = "humanitarianDemining", source = "stcHumanitarianDemining")
    @Mapping(target = "againstOtSl", source = "stcAgainstOtSl")
    @Mapping(target = "drugTrafficking", source = "stcDrugTrafficking")
    @Mapping(target = "illegalMinery", source = "stcIllegalMinery")
    @Mapping(target = "internalOrder", source = "stcInternalOrder")
    @Mapping(target = "biologicalThreats", source = "stcBiologicalThreats")
    @Mapping(target = "nationalDevelopment", source = "stcNationalDevelopment")
    @Mapping(target = "sinagerd", source = "stcSinagerd")
    @Mapping(target = "electoralElections", source = "stcElectoralElections")
    @Mapping(target = "illegalLogging", source = "stcIllegalLogging")
    @Mapping(target = "ioffensive", source = "stcIoffensive")
    @Mapping(target = "idefensive", source = "stcIdefensive")
    @Mapping(target = "imilitaryAction", source = "stcImilitaryAction")
    @Mapping(target = "iatypicalOperation", source = "stcIatypicalOperation")
    @Mapping(target = "eoffensive", source = "stcEoffensive")
    @Mapping(target = "edefensive", source = "stcEdefensive")
    @Mapping(target = "emilitaryAction", source = "stcEmilitaryAction")
    @Mapping(target = "eatypicalOperation", source = "stcEatypicalOperation")
    @Mapping(target = "instructionOo", source = "stcInstructionOo")
    @Mapping(target = "instructionTcos", source = "stcInstructionTcos")
    @Mapping(target = "instructionPtsvm", source = "stcInstructionPtsvm")
    @Mapping(target = "trainingOo", source = "stcTrainingOo")
    @Mapping(target = "trainingTcos", source = "stcTrainingTcos")
    @Mapping(target = "trainingPtsvm", source = "stcTrainingPtsvm")

    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsCoteDto mapperToDto(EpStatisticsCoteEntity source);

    List<StatisticsCoteDto> mapperToList(Iterable<EpStatisticsCoteEntity> entities);
}