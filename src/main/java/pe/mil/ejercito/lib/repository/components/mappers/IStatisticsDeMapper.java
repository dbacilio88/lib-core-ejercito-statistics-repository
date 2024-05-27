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
    @Mapping(target = "stDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")


    @Mapping(target = "stDeAcasMachinery", source = "acasMachinery")
    @Mapping(target = "stDeAcasHealth", source = "acasHealth")
    @Mapping(target = "stDeAcasSocial", source = "acasSocial")
    @Mapping(target = "stDeAcasSocialConflict", source = "acasSocialConflict")
    @Mapping(target = "stDePciAPnpIlegalMining", source = "pciAPnpIlegalMining")
    @Mapping(target = "stDePciAPnpTdi", source = "pciAPnpTdi")
    @Mapping(target = "stDePciAPnpTim", source = "pciAPnpTim")
    @Mapping(target = "stDePciAPnpForestFire", source = "pciAPnpForestFire")
    @Mapping(target = "stDeArEconomicSocial", source = "arEconomicSocial")
    @Mapping(target = "stDeArScienceTechnology", source = "arScienceTechnology")
    @Mapping(target = "stDeArArchaeologicalHistorical", source = "arArchaeologicalHistorical")
    @Mapping(target = "stDeArAntarcticAmazonAffairs", source = "aeArAntarcticAmazonAffairs")
    @Mapping(target = "stDeArEnvironmentalProtection", source = "arEnvironmentalProtection")
    @Mapping(target = "stDeHitoAmount", source = "hitoAmount")
    @Mapping(target = "stDeHitoOrders", source = "hitoOrders")
    @Mapping(target = "stDeHitoRecognition", source = "hitoRecognition")
    @Mapping(target = "stDeHitoMaintenance", source = "hitoMaintenance")

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
    @Mapping(target = "document", source = "stDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")


    @Mapping(target = "acasMachinery", source = "stDeAcasMachinery")
    @Mapping(target = "acasHealth", source = "stDeAcasHealth")
    @Mapping(target = "acasSocial", source = "stDeAcasSocial")
    @Mapping(target = "acasSocialConflict", source = "stDeAcasSocialConflict")
    @Mapping(target = "pciAPnpIlegalMining", source = "stDePciAPnpIlegalMining")
    @Mapping(target = "pciAPnpTdi", source = "stDePciAPnpTdi")
    @Mapping(target = "pciAPnpTim", source = "stDePciAPnpTim")
    @Mapping(target = "pciAPnpForestFire", source = "stDePciAPnpForestFire")
    @Mapping(target = "arEconomicSocial", source = "stDeArEconomicSocial")
    @Mapping(target = "arScienceTechnology", source = "stDeArScienceTechnology")
    @Mapping(target = "arArchaeologicalHistorical", source = "stDeArArchaeologicalHistorical")
    @Mapping(target = "aeArAntarcticAmazonAffairs", source = "stDeArAntarcticAmazonAffairs")
    @Mapping(target = "arEnvironmentalProtection", source = "stDeArEnvironmentalProtection")
    @Mapping(target = "hitoAmount", source = "stDeHitoAmount")
    @Mapping(target = "hitoOrders", source = "stDeHitoOrders")
    @Mapping(target = "hitoRecognition", source = "stDeHitoRecognition")
    @Mapping(target = "hitoMaintenance", source = "stDeHitoMaintenance")

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