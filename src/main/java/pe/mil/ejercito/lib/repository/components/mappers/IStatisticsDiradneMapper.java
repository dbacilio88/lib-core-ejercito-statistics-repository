package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDiradneDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDiradneEntity;

import java.util.List;

/**
 * IStatisticsDiradneMapper
 * <p>
 * IStatisticsDiradneMapper interface.
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
public interface IStatisticsDiradneMapper {

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
    @Mapping(target = "stdAgreementsCmInstPrivate", source = "agreementsCmInstPrivate")
    @Mapping(target = "stdAgreementsCmInstPublic", source = "agreementsCmInstPublic")
    @Mapping(target = "stdAgreementsCmGobLocal", source = "agreementsCmGobLocal")
    @Mapping(target = "stdAgreementsCeInstPrivate", source = "agreementsCeInstPrivate")
    @Mapping(target = "stdAgreementsCeInstPublic", source = "agreementsCeInstPublic")
    @Mapping(target = "stdAgreementsCeGobLocal", source = "agreementsCeGobLocal")
    @Mapping(target = "stdRisksMilitaryActionsReport", source = "risksMilitaryActionsReport")
    @Mapping(target = "stdRisksTsunami", source = "risksTsunami")
    @Mapping(target = "stdRisksCird", source = "risksCird")
    @Mapping(target = "stdRisksTrainingEntities", source = "risksTrainingEntities")
    @Mapping(target = "stdSupportPopulationAc", source = "supportPopulationAc")
    @Mapping(target = "stdSupportPopulationAh", source = "supportPopulationAh")
    @Mapping(target = "stdSupportPopulationPb", source = "supportPopulationPb")
    @Mapping(target = "stdRoadConstruction", source = "roadConstruction")
    @Mapping(target = "stdRoadMaintenance", source = "roadMaintenance")
    @Mapping(target = "stdRoadRehabilitation", source = "roadRehabilitation")
    @Mapping(target = "stdRoadPb", source = "roadPb")
    @Mapping(target = "stdEnvironmentalActivities", source = "environmentalActivities")
    @Mapping(target = "stdEnvironmentalManagement", source = "environmentalManagement")
    @Mapping(target = "stdEnvironmentalCompliance", source = "environmentalCompliance")
    @Mapping(target = "stdEnvironmentalMitigation", source = "environmentalMitigation")
    @Mapping(target = "stdEnvironmentalStrengthening", source = "environmentalStrengthening")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDiradneEntity mapperToEntity(StatisticsDiradneDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stdDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")
    @Mapping(target = "agreementsCmInstPrivate", source = "stdAgreementsCmInstPrivate")
    @Mapping(target = "agreementsCmInstPublic", source = "stdAgreementsCmInstPublic")
    @Mapping(target = "agreementsCmGobLocal", source = "stdAgreementsCmGobLocal")
    @Mapping(target = "agreementsCeInstPrivate", source = "stdAgreementsCeInstPrivate")
    @Mapping(target = "agreementsCeInstPublic", source = "stdAgreementsCeInstPublic")
    @Mapping(target = "agreementsCeGobLocal", source = "stdAgreementsCeGobLocal")
    @Mapping(target = "risksMilitaryActionsReport", source = "stdRisksMilitaryActionsReport")
    @Mapping(target = "risksTsunami", source = "stdRisksTsunami")
    @Mapping(target = "risksCird", source = "stdRisksCird")
    @Mapping(target = "risksTrainingEntities", source = "stdRisksTrainingEntities")
    @Mapping(target = "supportPopulationAc", source = "stdSupportPopulationAc")
    @Mapping(target = "supportPopulationAh", source = "stdSupportPopulationAh")
    @Mapping(target = "supportPopulationPb", source = "stdSupportPopulationPb")
    @Mapping(target = "roadConstruction", source = "stdRoadConstruction")
    @Mapping(target = "roadMaintenance", source = "stdRoadMaintenance")
    @Mapping(target = "roadRehabilitation", source = "stdRoadRehabilitation")
    @Mapping(target = "roadPb", source = "stdRoadPb")
    @Mapping(target = "environmentalActivities", source = "stdEnvironmentalActivities")
    @Mapping(target = "environmentalManagement", source = "stdEnvironmentalManagement")
    @Mapping(target = "environmentalCompliance", source = "stdEnvironmentalCompliance")
    @Mapping(target = "environmentalMitigation", source = "stdEnvironmentalMitigation")
    @Mapping(target = "environmentalStrengthening", source = "stdEnvironmentalStrengthening")
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiradneDto mapperToDto(EpStatisticsDiradneEntity source);

    List<StatisticsDiradneDto> mapperToList(Iterable<EpStatisticsDiradneEntity> entities);
}