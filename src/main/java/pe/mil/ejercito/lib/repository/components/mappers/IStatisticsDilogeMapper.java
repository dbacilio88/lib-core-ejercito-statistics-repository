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

    @Mapping(target = "stDilogePmbso", source = "pmbso")
    @Mapping(target = "stDilogeRequirements", source = "requirements")
    @Mapping(target = "stDilogeSummary", source = "summary")
    @Mapping(target = "stDilogeCurrent", source = "current")
    @Mapping(target = "stDilogeNew", source = "SNew")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stDilogeUpdate", source = "SUpdate")
    @Mapping(target = "stDilogeProgress", source = "SProgress")
    @Mapping(target = "stDilogeProducts", source = "products")
    @Mapping(target = "stDilogeCologe", source = "cologe")
    @Mapping(target = "stDilogeCogae", source = "cogae")
    @Mapping(target = "stDilogeCosale", source = "cosale")
    @Mapping(target = "stDilogeCoede", source = "coede")
    @Mapping(target = "stDilogeCopere", source = "copere")
    @Mapping(target = "stDilogeCote", source = "cote")
    @Mapping(target = "stDilogeAe", source = "ae")
    @Mapping(target = "stDilogeIde", source = "ide")
    @Mapping(target = "stDilogeIIDe", source = "iide")
    @Mapping(target = "stDilogeIIIDe", source = "iiide")
    @Mapping(target = "stDilogeIVDe", source = "ivde")
    @Mapping(target = "stDilogeVde", source = "ivde")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDilogeEntity mapperToEntity(StatisticsDilogeDto source);

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
    @Mapping(target = "pmbso", source = "stDilogePmbso")
    @Mapping(target = "requirements", source = "stDilogeRequirements")
    @Mapping(target = "summary", source = "stDilogeSummary")
    @Mapping(target = "current", source = "stDilogeCurrent")
    @Mapping(target = "SNew", source = "stDilogeNew")
    @Mapping(target = "SUpdate", source = "stDilogeUpdate")
    @Mapping(target = "SProgress", source = "stDilogeProgress")
    @Mapping(target = "products", source = "stDilogeProducts")
    @Mapping(target = "cologe", source = "stDilogeCologe")
    @Mapping(target = "cogae", source = "stDilogeCogae")
    @Mapping(target = "cosale", source = "stDilogeCosale")
    @Mapping(target = "coede", source = "stDilogeCoede")
    @Mapping(target = "copere", source = "stDilogeCopere")
    @Mapping(target = "cote", source = "stDilogeCote")
    @Mapping(target = "ae", source = "stDilogeAe")
    @Mapping(target = "ide", source = "stDilogeIde")
    @Mapping(target = "iide", source = "stDilogeIIDe")
    @Mapping(target = "iiide", source = "stDilogeIIIDe")
    @Mapping(target = "ivde", source = "stDilogeIVDe")
    @Mapping(target = "vde", source = "stDilogeVde")
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDilogeDto mapperToDto(EpStatisticsDilogeEntity source);

    List<StatisticsDilogeDto> mapperToList(Iterable<EpStatisticsDilogeEntity> entities);
}