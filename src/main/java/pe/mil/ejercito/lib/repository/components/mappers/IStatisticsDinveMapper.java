package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDinveDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDinveEntity;

import java.util.List;

/**
 * IStatisticsDinveMapper
 * <p>
 * IStatisticsDinveMapper interface.
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
public interface IStatisticsDinveMapper {

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
    @Mapping(target = "stTypeInvestment", source = "typeInvestment")
    @Mapping(target = "stIdtIoarrInfrastructure", source = "idtIoarrInfrastructure")
    @Mapping(target = "stIdtIoarrEquipment", source = "idtIoarrEquipment")
    @Mapping(target = "stIdtIoarrInfrastructureEquipment", source = "idtIoarrInfrastructureEquipment")
    @Mapping(target = "stIdtPiInfrastructure", source = "idtPiInfrastructure")
    @Mapping(target = "stIdtPiEquipment", source = "idtPiEquipment")
    @Mapping(target = "stIdtPiInfrastructureEquipment", source = "idtPiInfrastructureEquipment")
    @Mapping(target = "stIbiIoarrInfrastructure", source = "ibiIoarrInfrastructure")
    @Mapping(target = "stIbiIoarrEquipment", source = "ibiIoarrEquipment")
    @Mapping(target = "stIbiIoarrInfrastructureEquipment", source = "ibiIoarrInfrastructureEquipment")
    @Mapping(target = "stIbiPiInfrastructure", source = "ibiPiInfrastructure")
    @Mapping(target = "stIbiPiEquipment", source = "ibiPiEquipment")
    @Mapping(target = "stIbiPiInfrastructureEquipment", source = "ibiPiInfrastructureEquipment")
    @Mapping(target = "stIfeIoarrInfrastructure", source = "ifeIoarrInfrastructure")
    @Mapping(target = "stIfeIoarrEquipment", source = "ifeIoarrEquipment")
    @Mapping(target = "stIfeIoarrInfrastructureEquipment", source = "ifeIoarrInfrastructureEquipment")
    @Mapping(target = "stIfePiInfrastructure", source = "ifePiInfrastructure")
    @Mapping(target = "stIfePiEquipment", source = "ifePiEquipment")
    @Mapping(target = "stIfePiInfrastructureEquipment", source = "ifePiInfrastructureEquipment")
    @Mapping(target = "stEpiIoarr", source = "epiIoarr")
    @Mapping(target = "stEpiPiFts", source = "epiPiFts")
    @Mapping(target = "stEpiPiFte", source = "epiPiFte")
    @Mapping(target = "stEpiPiFmc", source = "epiPiFmc")
    @Mapping(target = "stEpiPiEnp", source = "epiPiEnp")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDinveEntity mapperToEntity(StatisticsDinveDto source);

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
    @Mapping(target = "typeInvestment", source = "stTypeInvestment")
    @Mapping(target = "idtIoarrInfrastructure", source = "stIdtIoarrInfrastructure")
    @Mapping(target = "idtIoarrEquipment", source = "stIdtIoarrEquipment")
    @Mapping(target = "idtIoarrInfrastructureEquipment", source = "stIdtIoarrInfrastructureEquipment")
    @Mapping(target = "idtPiInfrastructure", source = "stIdtPiInfrastructure")
    @Mapping(target = "idtPiEquipment", source = "stIdtPiEquipment")
    @Mapping(target = "idtPiInfrastructureEquipment", source = "stIdtPiInfrastructureEquipment")
    @Mapping(target = "ibiIoarrInfrastructure", source = "stIbiIoarrInfrastructure")
    @Mapping(target = "ibiIoarrEquipment", source = "stIbiIoarrEquipment")
    @Mapping(target = "ibiIoarrInfrastructureEquipment", source = "stIbiIoarrInfrastructureEquipment")
    @Mapping(target = "ibiPiInfrastructure", source = "stIbiPiInfrastructure")
    @Mapping(target = "ibiPiEquipment", source = "stIbiPiEquipment")
    @Mapping(target = "ibiPiInfrastructureEquipment", source = "stIbiPiInfrastructureEquipment")
    @Mapping(target = "ifeIoarrInfrastructure", source = "stIfeIoarrInfrastructure")
    @Mapping(target = "ifeIoarrEquipment", source = "stIfeIoarrEquipment")
    @Mapping(target = "ifeIoarrInfrastructureEquipment", source = "stIfeIoarrInfrastructureEquipment")
    @Mapping(target = "ifePiInfrastructure", source = "stIfePiInfrastructure")
    @Mapping(target = "ifePiEquipment", source = "stIfePiEquipment")
    @Mapping(target = "ifePiInfrastructureEquipment", source = "stIfePiInfrastructureEquipment")
    @Mapping(target = "epiIoarr", source = "stEpiIoarr")
    @Mapping(target = "epiPiFts", source = "stEpiPiFts")
    @Mapping(target = "epiPiFte", source = "stEpiPiFte")
    @Mapping(target = "epiPiFmc", source = "stEpiPiFmc")
    @Mapping(target = "epiPiEnp", source = "stEpiPiEnp")

    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDinveDto mapperToDto(EpStatisticsDinveEntity source);

    List<StatisticsDinveDto> mapperToList(Iterable<EpStatisticsDinveEntity> entities);
}