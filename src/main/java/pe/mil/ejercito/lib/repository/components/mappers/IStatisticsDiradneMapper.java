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
    @Mapping(target = "stDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")

    @Mapping(target = "stEne", source = "ene")
    @Mapping(target = "stFeb", source = "feb")
    @Mapping(target = "stMar", source = "mar")
    @Mapping(target = "stAbr", source = "abr")
    @Mapping(target = "stMay", source = "may")
    @Mapping(target = "stJun", source = "jun")
    @Mapping(target = "stJul", source = "jul")
    @Mapping(target = "stAgo", source = "ago")
    @Mapping(target = "stSet", source = "set")
    @Mapping(target = "stOct", source = "oct")
    @Mapping(target = "stNov", source = "nov")
    @Mapping(target = "stDic", source = "dic")
    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")
    @Mapping(target = "stDiradneAgreementsCmInstPrivate", source = "agreementsCmInstPrivate")
    @Mapping(target = "stDiradneAgreementsCmInstPublic", source = "agreementsCmInstPublic")
    @Mapping(target = "stDiradneAgreementsCmGobLocal", source = "agreementsCmGobLocal")
    @Mapping(target = "stDiradneAgreementsCeInstPrivate", source = "agreementsCeInstPrivate")
    @Mapping(target = "stDiradneAgreementsCeInstPublic", source = "agreementsCeInstPublic")
    @Mapping(target = "stDiradneAgreementsCeGobLocal", source = "agreementsCeGobLocal")
    @Mapping(target = "stDiradneRisksMilitaryActionsReport", source = "risksMilitaryActionsReport")
    @Mapping(target = "stDiradneRisksTsunami", source = "risksTsunami")
    @Mapping(target = "stDiradneRisksCird", source = "risksCird")
    @Mapping(target = "stDiradneRisksTrainingEntities", source = "risksTrainingEntities")
    @Mapping(target = "stDiradneSupportPopulationAc", source = "supportPopulationAc")
    @Mapping(target = "stDiradneSupportPopulationAh", source = "supportPopulationAh")
    @Mapping(target = "stDiradneSupportPopulationPb", source = "supportPopulationPb")
    @Mapping(target = "stDiradneRoadConstruction", source = "roadConstruction")
    @Mapping(target = "stDiradneRoadMaintenance", source = "roadMaintenance")
    @Mapping(target = "stDiradneRoadRehabilitation", source = "roadRehabilitation")
    @Mapping(target = "stDiradneRoadPb", source = "roadPb")
    @Mapping(target = "stDiradneEnvironmentalActivities", source = "environmentalActivities")
    @Mapping(target = "stDiradneEnvironmentalManagement", source = "environmentalManagement")
    @Mapping(target = "stDiradneEnvironmentalCompliance", source = "environmentalCompliance")
    @Mapping(target = "stDiradneEnvironmentalMitigation", source = "environmentalMitigation")
    @Mapping(target = "stDiradneEnvironmentalStrengthening", source = "environmentalStrengthening")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDiradneEntity mapperToEntity(StatisticsDiradneDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "ene", source = "stEne")
    @Mapping(target = "feb", source = "stFeb")
    @Mapping(target = "mar", source = "stMar")
    @Mapping(target = "abr", source = "stAbr")
    @Mapping(target = "may", source = "stMay")
    @Mapping(target = "jun", source = "stJun")
    @Mapping(target = "jul", source = "stJul")
    @Mapping(target = "ago", source = "stAgo")
    @Mapping(target = "set", source = "stSet")
    @Mapping(target = "oct", source = "stOct")
    @Mapping(target = "nov", source = "stNov")
    @Mapping(target = "dic", source = "stDic")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")

    @Mapping(target = "agreementsCmInstPrivate", source = "stDiradneAgreementsCmInstPrivate")
    @Mapping(target = "agreementsCmInstPublic", source = "stDiradneAgreementsCmInstPublic")
    @Mapping(target = "agreementsCmGobLocal", source = "stDiradneAgreementsCmGobLocal")
    @Mapping(target = "agreementsCeInstPrivate", source = "stDiradneAgreementsCeInstPrivate")
    @Mapping(target = "agreementsCeInstPublic", source = "stDiradneAgreementsCeInstPublic")
    @Mapping(target = "agreementsCeGobLocal", source = "stDiradneAgreementsCeGobLocal")
    @Mapping(target = "risksMilitaryActionsReport", source = "stDiradneRisksMilitaryActionsReport")
    @Mapping(target = "risksTsunami", source = "stDiradneRisksTsunami")
    @Mapping(target = "risksCird", source = "stDiradneRisksCird")
    @Mapping(target = "risksTrainingEntities", source = "stDiradneRisksTrainingEntities")
    @Mapping(target = "supportPopulationAc", source = "stDiradneSupportPopulationAc")
    @Mapping(target = "supportPopulationAh", source = "stDiradneSupportPopulationAh")
    @Mapping(target = "supportPopulationPb", source = "stDiradneSupportPopulationPb")
    @Mapping(target = "roadConstruction", source = "stDiradneRoadConstruction")
    @Mapping(target = "roadMaintenance", source = "stDiradneRoadMaintenance")
    @Mapping(target = "roadRehabilitation", source = "stDiradneRoadRehabilitation")
    @Mapping(target = "roadPb", source = "stDiradneRoadPb")
    @Mapping(target = "environmentalActivities", source = "stDiradneEnvironmentalActivities")
    @Mapping(target = "environmentalManagement", source = "stDiradneEnvironmentalManagement")
    @Mapping(target = "environmentalCompliance", source = "stDiradneEnvironmentalCompliance")
    @Mapping(target = "environmentalMitigation", source = "stDiradneEnvironmentalMitigation")
    @Mapping(target = "environmentalStrengthening", source = "stDiradneEnvironmentalStrengthening")
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiradneDto mapperToDto(EpStatisticsDiradneEntity source);

    List<StatisticsDiradneDto> mapperToList(Iterable<EpStatisticsDiradneEntity> entities);
}