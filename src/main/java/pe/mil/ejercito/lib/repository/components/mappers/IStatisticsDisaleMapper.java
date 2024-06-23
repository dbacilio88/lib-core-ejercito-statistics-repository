package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDisaleDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDisaleEntity;

import java.util.List;

/**
 * IStatisticsDisaleMapper
 * <p>
 * IStatisticsDisaleMapper interface.
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
public interface IStatisticsDisaleMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")
    @Mapping(target = "stActivityDirection", source = "activityDirection")
    @Mapping(target = "stActivityRecommendation", source = "activityRecommendation")
    @Mapping(target = "stPsLevelsCare", source = "psLevelsCare")
    @Mapping(target = "stAsmAttentions", source = "asmAttentions")
    @Mapping(target = "stActivityCommitteesMindef", source = "activityCommitteesMindef")
    @Mapping(target = "stActivityCommitteesMinsa", source = "activityCommitteesMinsa")
    @Mapping(target = "stActivityCommitteesInstitutional", source = "activityCommitteesInstitutional")
    @Mapping(target = "stActivityOptionsMindef", source = "activityOptionsMindef")
    @Mapping(target = "stActivityOptionsMinsa", source = "activityOptionsMinsa")
    @Mapping(target = "stActivityOptionsInstitutional", source = "activityOptionsInstitutional")
    @Mapping(target = "stActivityDirectivesProject", source = "activityDirectivesProject")
    @Mapping(target = "stActivityDirectivesUpdate", source = "activityDirectivesUpdate")
    @Mapping(target = "stActivityDirectivesApproved", source = "activityDirectivesApproved")
    @Mapping(target = "stRrHhLevel1Doctor", source = "rrHhLevel1Doctor")
    @Mapping(target = "stRrHhLevel1Other", source = "rrHhLevel1Other")
    @Mapping(target = "stRrHhLevel1Tcos", source = "rrHhLevel1Tcos")
    @Mapping(target = "stRrHhLevel2Doctor", source = "rrHhLevel2Doctor")
    @Mapping(target = "stRrHhLevel2Other", source = "rrHhLevel2Other")
    @Mapping(target = "stRrHhLevel2Tcos", source = "rrHhLevel2Tcos")
    @Mapping(target = "stRrHhLevel3Doctor", source = "rrHhLevel3Doctor")
    @Mapping(target = "stRrHhLevel3Other", source = "rrHhLevel3Other")
    @Mapping(target = "stRrHhLevel3Tcos", source = "rrHhLevel3Tcos")
    @Mapping(target = "stCoUnHealthy", source = "coUnHealthy")
    @Mapping(target = "stCoImprove", source = "coImprove")
    @Mapping(target = "stCoHealthy", source = "coHealthy")
    @Mapping(target = "stAsmLevel1", source = "asmLevel1")
    @Mapping(target = "stAsmLevel2", source = "asmLevel2")
    @Mapping(target = "stAsmLevel3", source = "asmLevel3")
    @Mapping(target = "stPsEp", source = "psEp")
    @Mapping(target = "stPsInformation", source = "psInformation")
    @Mapping(target = "stPsSendInformation", source = "psSendInformation")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDisaleEntity mapperToEntity(StatisticsDisaleDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")
    @Mapping(target = "activityDirection", source = "stActivityDirection")
    @Mapping(target = "activityRecommendation", source = "stActivityRecommendation")
    @Mapping(target = "psLevelsCare", source = "stPsLevelsCare")
    @Mapping(target = "asmAttentions", source = "stAsmAttentions")
    @Mapping(target = "activityCommitteesMindef", source = "stActivityCommitteesMindef")
    @Mapping(target = "activityCommitteesMinsa", source = "stActivityCommitteesMinsa")
    @Mapping(target = "activityCommitteesInstitutional", source = "stActivityCommitteesInstitutional")
    @Mapping(target = "activityOptionsMindef", source = "stActivityOptionsMindef")
    @Mapping(target = "activityOptionsMinsa", source = "stActivityOptionsMinsa")
    @Mapping(target = "activityOptionsInstitutional", source = "stActivityOptionsInstitutional")
    @Mapping(target = "activityDirectivesProject", source = "stActivityDirectivesProject")
    @Mapping(target = "activityDirectivesUpdate", source = "stActivityDirectivesUpdate")
    @Mapping(target = "activityDirectivesApproved", source = "stActivityDirectivesApproved")
    @Mapping(target = "rrHhLevel1Doctor", source = "stRrHhLevel1Doctor")
    @Mapping(target = "rrHhLevel1Other", source = "stRrHhLevel1Other")
    @Mapping(target = "rrHhLevel1Tcos", source = "stRrHhLevel1Tcos")
    @Mapping(target = "rrHhLevel2Doctor", source = "stRrHhLevel2Doctor")
    @Mapping(target = "rrHhLevel2Other", source = "stRrHhLevel2Other")
    @Mapping(target = "rrHhLevel2Tcos", source = "stRrHhLevel2Tcos")
    @Mapping(target = "rrHhLevel3Doctor", source = "stRrHhLevel3Doctor")
    @Mapping(target = "rrHhLevel3Other", source = "stRrHhLevel3Other")
    @Mapping(target = "rrHhLevel3Tcos", source = "stRrHhLevel3Tcos")
    @Mapping(target = "coUnHealthy", source = "stCoUnHealthy")
    @Mapping(target = "coImprove", source = "stCoImprove")
    @Mapping(target = "coHealthy", source = "stCoHealthy")
    @Mapping(target = "asmLevel1", source = "stAsmLevel1")
    @Mapping(target = "asmLevel2", source = "stAsmLevel2")
    @Mapping(target = "asmLevel3", source = "stAsmLevel3")
    @Mapping(target = "psEp", source = "stPsEp")
    @Mapping(target = "psInformation", source = "stPsInformation")
    @Mapping(target = "psSendInformation", source = "stPsSendInformation")

    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDisaleDto mapperToDto(EpStatisticsDisaleEntity source);

    List<StatisticsDisaleDto> mapperToList(Iterable<EpStatisticsDisaleEntity> entities);
}