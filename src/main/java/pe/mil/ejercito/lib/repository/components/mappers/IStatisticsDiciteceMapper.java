package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDiciteceDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDiciteceEntity;

import java.util.List;

/**
 * IStatisticsDiciteceMapper
 * <p>
 * IStatisticsDiciteceMapper interface.
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
public interface IStatisticsDiciteceMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stdDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stOtherState", source = "otherState")


    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stdInvestigationArea", source = "investigationArea")
    @Mapping(target = "stdProjectName", source = "projectName")
    @Mapping(target = "stdWorkshopName", source = "workshopName")
    @Mapping(target = "stdPersonalOO", source = "personalOO")
    @Mapping(target = "stdPersonalTcos", source = "personalTcos")
    @Mapping(target = "stdPersonalCivil", source = "personalCivil")
    @Mapping(target = "stdPersonalExternal", source = "personalExternal")
    @Mapping(target = "stdPrePersonalTotal", source = "personalTotal")
    @Mapping(target = "stdPisPercentageEne", source = "pisPercentageEne")
    @Mapping(target = "stdPisFinancialEne", source = "pisFinancialEne")
    @Mapping(target = "stdPisPercentageFeb", source = "pisPercentageFeb")
    @Mapping(target = "stdPisFinancialFeb", source = "pisFinancialFeb")
    @Mapping(target = "stdPisPercentageTotal", source = "pisPercentageTotal")
    @Mapping(target = "stdPisFinancialTotal", source = "pisFinancialTotal")
    @Mapping(target = "stdWorkshopDependencyAssistance", source = "workshopDependencyAssistance")
    @Mapping(target = "stdAgreementsTypeTrainingOO", source = "agreementsTypeTrainingOO")
    @Mapping(target = "stdAgreementsTypeTrainingTcos", source = "agreementsTypeTrainingTcos")
    @Mapping(target = "stdAgreementsTypeTrainingCivil", source = "agreementsTypeTrainingCivil")
    @Mapping(target = "stdAgreementsTypeIdOO", source = "agreementsTypeIdOO")
    @Mapping(target = "stdAgreementsTypeIdTcos", source = "agreementsTypeIdTcos")
    @Mapping(target = "stdAgreementsTypeIdCivil", source = "agreementsTypeIdCivil")
    @Mapping(target = "stdAgreementsPersonalTrainingOO", source = "agreementsPersonalTrainingOO")
    @Mapping(target = "stdAgreementsPersonalTrainingTcos", source = "agreementsPersonalTrainingTcos")
    @Mapping(target = "stdAgreementsPersonalTrainingCivil", source = "agreementsPersonalTrainingCivil")
    @Mapping(target = "stdAgreementsPersonalIdOO", source = "agreementsPersonalIdOO")
    @Mapping(target = "stdAgreementsPersonalIdTcos", source = "agreementsPersonalIdTcos")
    @Mapping(target = "stdAgreementsPersonalIdCivil", source = "agreementsPersonalIdCivil")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")

    EpStatisticsDiciteceEntity mapperToEntity(StatisticsDiciteceDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stdDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "obs", source = "stObs")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")

    @Mapping(target = "investigationArea", source = "stdInvestigationArea")
    @Mapping(target = "projectName", source = "stdProjectName")
    @Mapping(target = "workshopName", source = "stdWorkshopName")
    @Mapping(target = "personalOO", source = "stdPersonalOO")
    @Mapping(target = "personalTcos", source = "stdPersonalTcos")
    @Mapping(target = "personalCivil", source = "stdPersonalCivil")
    @Mapping(target = "personalExternal", source = "stdPersonalExternal")
    @Mapping(target = "personalTotal", source = "stdPrePersonalTotal")
    @Mapping(target = "pisPercentageEne", source = "stdPisPercentageEne")
    @Mapping(target = "pisFinancialEne", source = "stdPisFinancialEne")
    @Mapping(target = "pisPercentageFeb", source = "stdPisPercentageFeb")
    @Mapping(target = "pisFinancialFeb", source = "stdPisFinancialFeb")
    @Mapping(target = "pisPercentageTotal", source = "stdPisPercentageTotal")
    @Mapping(target = "pisFinancialTotal", source = "stdPisFinancialTotal")
    @Mapping(target = "workshopDependencyAssistance", source = "stdWorkshopDependencyAssistance")
    @Mapping(target = "agreementsTypeTrainingOO", source = "stdAgreementsTypeTrainingOO")
    @Mapping(target = "agreementsTypeTrainingTcos", source = "stdAgreementsTypeTrainingTcos")
    @Mapping(target = "agreementsTypeTrainingCivil", source = "stdAgreementsTypeTrainingCivil")
    @Mapping(target = "agreementsTypeIdOO", source = "stdAgreementsTypeIdOO")
    @Mapping(target = "agreementsTypeIdTcos", source = "stdAgreementsTypeIdTcos")
    @Mapping(target = "agreementsTypeIdCivil", source = "stdAgreementsTypeIdCivil")
    @Mapping(target = "agreementsPersonalTrainingOO", source = "stdAgreementsPersonalTrainingOO")
    @Mapping(target = "agreementsPersonalTrainingTcos", source = "stdAgreementsPersonalTrainingTcos")
    @Mapping(target = "agreementsPersonalTrainingCivil", source = "stdAgreementsPersonalTrainingCivil")
    @Mapping(target = "agreementsPersonalIdOO", source = "stdAgreementsPersonalIdOO")
    @Mapping(target = "agreementsPersonalIdTcos", source = "stdAgreementsPersonalIdTcos")
    @Mapping(target = "agreementsPersonalIdCivil", source = "stdAgreementsPersonalIdCivil")

    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiciteceDto mapperToDto(EpStatisticsDiciteceEntity source);

    List<StatisticsDiciteceDto> mapperToList(Iterable<EpStatisticsDiciteceEntity> entities);
}