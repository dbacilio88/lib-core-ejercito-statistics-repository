package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsCoadneDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsCoadneEntity;

import java.util.List;

/**
 * IStatisticsCoadneMapper
 * <p>
 * IStatisticsCoadneMapper interface.
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
public interface IStatisticsCoadneMapper {

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

    @Mapping(target = "stCoadneAstOo", source = "astOo")
    @Mapping(target = "stCoadneAstTs", source = "astTs")
    @Mapping(target = "stCoadneAstEc", source = "astEc")
    @Mapping(target = "stCoadneAsaOo", source = "asaOo")
    @Mapping(target = "stCoadneAsaTs", source = "asaTs")
    @Mapping(target = "stCoadneAsaEc", source = "asaEc")
    @Mapping(target = "stCoadneDhArea", source = "dhArea")
    @Mapping(target = "stCoadneDhOo", source = "dhOo")
    @Mapping(target = "stCoadneDhTcos", source = "dhTcos")
    @Mapping(target = "stCoadneDhAreaToDemine", source = "dhAreaToDemine")
    @Mapping(target = "stCoadneAcDpto", source = "acDpto")
    @Mapping(target = "stCoadneAcProv", source = "acProv")
    @Mapping(target = "stCoadneAcDist", source = "acDist")
    @Mapping(target = "stCoadneAcTypeActivity", source = "acTypeActivity")
    @Mapping(target = "stCoadneAcDateInit", source = "acDateInit")
    @Mapping(target = "stCoadneAcDateEnd", source = "acDateEnd")
    @Mapping(target = "stCoadneAcBenefitedPopulation", source = "acBenefitedPopulation")
    @Mapping(target = "stCoadneAcMetering", source = "acMetering")
    @Mapping(target = "stCoadneAcTypeOfCivicAction", source = "acTypeOfCivicAction")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsCoadneEntity mapperToEntity(StatisticsCoadneDto source);

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


    @Mapping(target = "astOo", source = "stCoadneAstOo")
    @Mapping(target = "astTs", source = "stCoadneAstTs")
    @Mapping(target = "astEc", source = "stCoadneAstEc")
    @Mapping(target = "asaOo", source = "stCoadneAsaOo")
    @Mapping(target = "asaTs", source = "stCoadneAsaTs")
    @Mapping(target = "asaEc", source = "stCoadneAsaEc")
    @Mapping(target = "dhArea", source = "stCoadneDhArea")
    @Mapping(target = "dhOo", source = "stCoadneDhOo")
    @Mapping(target = "dhTcos", source = "stCoadneDhTcos")
    @Mapping(target = "dhAreaToDemine", source = "stCoadneDhAreaToDemine")
    @Mapping(target = "acDpto", source = "stCoadneAcDpto")
    @Mapping(target = "acProv", source = "stCoadneAcProv")
    @Mapping(target = "acDist", source = "stCoadneAcDist")
    @Mapping(target = "acTypeActivity", source = "stCoadneAcTypeActivity")
    @Mapping(target = "acDateInit", source = "stCoadneAcDateInit")
    @Mapping(target = "acDateEnd", source = "stCoadneAcDateEnd")
    @Mapping(target = "acBenefitedPopulation", source = "stCoadneAcBenefitedPopulation")
    @Mapping(target = "acMetering", source = "stCoadneAcMetering")
    @Mapping(target = "acTypeOfCivicAction", source = "stCoadneAcTypeOfCivicAction")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsCoadneDto mapperToDto(EpStatisticsCoadneEntity source);

    List<StatisticsCoadneDto> mapperToList(Iterable<EpStatisticsCoadneEntity> entities);
}