package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDeEntity;

import java.util.List;

/**
 * IStatisticsDeMapper
 * <p>
 * IStatisticsDeMapper interface.
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
public interface IStatisticsDeMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stdDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")


    @Mapping(target = "stdAcasMachinery", source = "acasMachinery")
    @Mapping(target = "stdAcasHealth", source = "acasHealth")
    @Mapping(target = "stdAcasSocial", source = "acasSocial")
    @Mapping(target = "stdAcasSocialConflict", source = "acasSocialConflict")
    @Mapping(target = "stdPciAPnpIlegalMining", source = "pciAPnpIlegalMining")
    @Mapping(target = "stdPciAPnpTdi", source = "pciAPnpTdi")
    @Mapping(target = "stdPciAPnpTim", source = "pciAPnpTim")
    @Mapping(target = "stdPciAPnpForestFire", source = "pciAPnpForestFire")
    @Mapping(target = "stdArEconomicSocial", source = "arEconomicSocial")
    @Mapping(target = "stdArScienceTechnology", source = "arScienceTechnology")
    @Mapping(target = "stdArArchaeologicalHistorical", source = "arArchaeologicalHistorical")
    @Mapping(target = "stdArAntarcticAmazonAffairs", source = "aeArAntarcticAmazonAffairs")
    @Mapping(target = "stdArEnvironmentalProtection", source = "arEnvironmentalProtection")
    @Mapping(target = "stdHitoAmount", source = "hitoAmount")
    @Mapping(target = "stdHitoOrders", source = "hitoOrders")
    @Mapping(target = "stdHitoRecognition", source = "hitoRecognition")
    @Mapping(target = "stdHitoMaintenance", source = "hitoMaintenance")

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

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDeEntity mapperToEntity(StatisticsDeDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stdDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")


    @Mapping(target = "acasMachinery", source = "stdAcasMachinery")
    @Mapping(target = "acasHealth", source = "stdAcasHealth")
    @Mapping(target = "acasSocial", source = "stdAcasSocial")
    @Mapping(target = "acasSocialConflict", source = "stdAcasSocialConflict")
    @Mapping(target = "pciAPnpIlegalMining", source = "stdPciAPnpIlegalMining")
    @Mapping(target = "pciAPnpTdi", source = "stdPciAPnpTdi")
    @Mapping(target = "pciAPnpTim", source = "stdPciAPnpTim")
    @Mapping(target = "pciAPnpForestFire", source = "stdPciAPnpForestFire")
    @Mapping(target = "arEconomicSocial", source = "stdArEconomicSocial")
    @Mapping(target = "arScienceTechnology", source = "stdArScienceTechnology")
    @Mapping(target = "arArchaeologicalHistorical", source = "stdArArchaeologicalHistorical")
    @Mapping(target = "aeArAntarcticAmazonAffairs", source = "stdArAntarcticAmazonAffairs")
    @Mapping(target = "arEnvironmentalProtection", source = "stdArEnvironmentalProtection")
    @Mapping(target = "hitoAmount", source = "stdHitoAmount")
    @Mapping(target = "hitoOrders", source = "stdHitoOrders")
    @Mapping(target = "hitoRecognition", source = "stdHitoRecognition")
    @Mapping(target = "hitoMaintenance", source = "stdHitoMaintenance")

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
    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDeDto mapperToDto(EpStatisticsDeEntity source);

    List<StatisticsDeDto> mapperToList(Iterable<EpStatisticsDeEntity> entities);
}