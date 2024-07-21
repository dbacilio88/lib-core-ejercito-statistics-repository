package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDilogeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDilogeEntity;

import java.util.List;

/**
 * IStatisticsDilogeMapper
 * <p>
 * IStatisticsDilogeMapper interface.
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
public interface IStatisticsDilogeMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stdDocument.uuId", source = "document")
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

    @Mapping(target = "stdPmbso", source = "pmbso")
    @Mapping(target = "stdRequirements", source = "requirements")
    @Mapping(target = "stdSummary", source = "summary")
    @Mapping(target = "stdCurrent", source = "current")
    @Mapping(target = "stdNew", source = "more")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stdUpdate", source = "update")
    @Mapping(target = "stdProgress", source = "progress")
    @Mapping(target = "stdProducts", source = "products")
    @Mapping(target = "stdCologe", source = "cologe")
    @Mapping(target = "stdCogae", source = "cogae")
    @Mapping(target = "stdCosale", source = "cosale")
    @Mapping(target = "stdCoede", source = "coede")
    @Mapping(target = "stdCopere", source = "copere")
    @Mapping(target = "stdCote", source = "cote")
    @Mapping(target = "stdAe", source = "ae")
    @Mapping(target = "stdIde", source = "ide")
    @Mapping(target = "stdIIDe", source = "iide")
    @Mapping(target = "stdIIIDe", source = "iiide")
    @Mapping(target = "stdIVDe", source = "ivde")
    @Mapping(target = "stdVde", source = "ivde")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDilogeEntity mapperToEntity(StatisticsDilogeDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stdDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
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
    @Mapping(target = "pmbso", source = "stdPmbso")
    @Mapping(target = "requirements", source = "stdRequirements")
    @Mapping(target = "summary", source = "stdSummary")
    @Mapping(target = "current", source = "stdCurrent")
    @Mapping(target = "more", source = "stdNew")
    @Mapping(target = "update", source = "stdUpdate")
    @Mapping(target = "progress", source = "stdProgress")
    @Mapping(target = "products", source = "stdProducts")
    @Mapping(target = "cologe", source = "stdCologe")
    @Mapping(target = "cogae", source = "stdCogae")
    @Mapping(target = "cosale", source = "stdCosale")
    @Mapping(target = "coede", source = "stdCoede")
    @Mapping(target = "copere", source = "stdCopere")
    @Mapping(target = "cote", source = "stdCote")
    @Mapping(target = "ae", source = "stdAe")
    @Mapping(target = "ide", source = "stdIde")
    @Mapping(target = "iide", source = "stdIIDe")
    @Mapping(target = "iiide", source = "stdIIIDe")
    @Mapping(target = "ivde", source = "stdIVDe")
    @Mapping(target = "vde", source = "stdVde")
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDilogeDto mapperToDto(EpStatisticsDilogeEntity source);

    List<StatisticsDilogeDto> mapperToList(Iterable<EpStatisticsDilogeEntity> entities);
}