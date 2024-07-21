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
    @Mapping(target = "stcDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stOtherState", source = "otherState")

    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stcAstOo", source = "astOo")
    @Mapping(target = "stcAstTs", source = "astTs")
    @Mapping(target = "stcAstEc", source = "astEc")
    @Mapping(target = "stcAsaOo", source = "asaOo")
    @Mapping(target = "stcAsaTs", source = "asaTs")
    @Mapping(target = "stcAsaEc", source = "asaEc")
    @Mapping(target = "stcDhArea", source = "dhArea")
    @Mapping(target = "stcDhOo", source = "dhOo")
    @Mapping(target = "stcDhTcos", source = "dhTcos")
    @Mapping(target = "stcDhAreaToDemine", source = "dhAreaToDemine")
    @Mapping(target = "stcAcDpto", source = "acDpto")
    @Mapping(target = "stcAcProv", source = "acProv")
    @Mapping(target = "stcAcDist", source = "acDist")
    @Mapping(target = "stcAcTypeActivity", source = "acTypeActivity")
    @Mapping(target = "stcAcDateInit", source = "acDateInit")
    @Mapping(target = "stcAcDateEnd", source = "acDateEnd")
    @Mapping(target = "stcAcBenefitedPopulation", source = "acBenefitedPopulation")
    @Mapping(target = "stcAcMetering", source = "acMetering")
    @Mapping(target = "stcAcTypeOfCivicAction", source = "acTypeOfCivicAction")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")

    EpStatisticsCoadneEntity mapperToEntity(StatisticsCoadneDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stcDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")


    @Mapping(target = "astOo", source = "stcAstOo")
    @Mapping(target = "astTs", source = "stcAstTs")
    @Mapping(target = "astEc", source = "stcAstEc")
    @Mapping(target = "asaOo", source = "stcAsaOo")
    @Mapping(target = "asaTs", source = "stcAsaTs")
    @Mapping(target = "asaEc", source = "stcAsaEc")
    @Mapping(target = "dhArea", source = "stcDhArea")
    @Mapping(target = "dhOo", source = "stcDhOo")
    @Mapping(target = "dhTcos", source = "stcDhTcos")
    @Mapping(target = "dhAreaToDemine", source = "stcDhAreaToDemine")
    @Mapping(target = "acDpto", source = "stcAcDpto")
    @Mapping(target = "acProv", source = "stcAcProv")
    @Mapping(target = "acDist", source = "stcAcDist")
    @Mapping(target = "acTypeActivity", source = "stcAcTypeActivity")
    @Mapping(target = "acDateInit", source = "stcAcDateInit")
    @Mapping(target = "acDateEnd", source = "stcAcDateEnd")
    @Mapping(target = "acBenefitedPopulation", source = "stcAcBenefitedPopulation")
    @Mapping(target = "acMetering", source = "stcAcMetering")
    @Mapping(target = "acTypeOfCivicAction", source = "stcAcTypeOfCivicAction")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsCoadneDto mapperToDto(EpStatisticsCoadneEntity source);

    List<StatisticsCoadneDto> mapperToList(Iterable<EpStatisticsCoadneEntity> entities);
}