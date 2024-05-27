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
    @Mapping(target = "stDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")


    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stDiciteceInvestigationArea", source = "investigationArea")
    @Mapping(target = "stDiciteceProjectName", source = "projectName")
    @Mapping(target = "stDiciteceWorkshopName", source = "workshopName")
    @Mapping(target = "stDicitecePersonalOO", source = "personalOO")
    @Mapping(target = "stDicitecePersonalTcos", source = "personalTcos")
    @Mapping(target = "stDicitecePersonalCivil", source = "personalCivil")
    @Mapping(target = "stDicitecePersonalExternal", source = "personalExternal")
    @Mapping(target = "stDicitecePrePersonalTotal", source = "personalTotal")
    @Mapping(target = "stDicitecePisPercentageEne", source = "pisPercentageEne")
    @Mapping(target = "stDicitecePisFinancialEne", source = "pisFinancialEne")
    @Mapping(target = "stDicitecePisPercentageFeb", source = "pisPercentageFeb")
    @Mapping(target = "stDicitecePisFinancialFeb", source = "pisFinancialFeb")
    @Mapping(target = "stDicitecePisPercentageTotal", source = "pisPercentageTotal")
    @Mapping(target = "stDicitecePisFinancialTotal", source = "pisFinancialTotal")
    @Mapping(target = "stDiciteceWorkshopDependencyAssistance", source = "workshopDependencyAssistance")
    @Mapping(target = "stDiciteceAgreementsTypeTrainingOO", source = "agreementsTypeTrainingOO")
    @Mapping(target = "stDiciteceAgreementsTypeTrainingTcos", source = "agreementsTypeTrainingTcos")
    @Mapping(target = "stDiciteceAgreementsTypeTrainingCivil", source = "agreementsTypeTrainingCivil")
    @Mapping(target = "stDiciteceAgreementsTypeIdOO", source = "agreementsTypeIdOO")
    @Mapping(target = "stDiciteceAgreementsTypeIdTcos", source = "agreementsTypeIdTcos")
    @Mapping(target = "stDiciteceAgreementsTypeIdCivil", source = "agreementsTypeIdCivil")
    @Mapping(target = "stDiciteceAgreementsPersonalTrainingOO", source = "agreementsPersonalTrainingOO")
    @Mapping(target = "stDiciteceAgreementsPersonalTrainingTcos", source = "agreementsPersonalTrainingTcos")
    @Mapping(target = "stDiciteceAgreementsPersonalTrainingCivil", source = "agreementsPersonalTrainingCivil")
    @Mapping(target = "stDiciteceAgreementsPersonalIdOO", source = "agreementsPersonalIdOO")
    @Mapping(target = "stDiciteceAgreementsPersonalIdTcos", source = "agreementsPersonalIdTcos")
    @Mapping(target = "stDiciteceAgreementsPersonalIdCivil", source = "agreementsPersonalIdCivil")


    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDiciteceEntity mapperToEntity(StatisticsDiciteceDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")


    @Mapping(target = "investigationArea", source = "stDiciteceInvestigationArea")
    @Mapping(target = "projectName", source = "stDiciteceProjectName")
    @Mapping(target = "workshopName", source = "stDiciteceWorkshopName")
    @Mapping(target = "personalOO", source = "stDicitecePersonalOO")
    @Mapping(target = "personalTcos", source = "stDicitecePersonalTcos")
    @Mapping(target = "personalCivil", source = "stDicitecePersonalCivil")
    @Mapping(target = "personalExternal", source = "stDicitecePersonalExternal")
    @Mapping(target = "personalTotal", source = "stDicitecePrePersonalTotal")
    @Mapping(target = "pisPercentageEne", source = "stDicitecePisPercentageEne")
    @Mapping(target = "pisFinancialEne", source = "stDicitecePisFinancialEne")
    @Mapping(target = "pisPercentageFeb", source = "stDicitecePisPercentageFeb")
    @Mapping(target = "pisFinancialFeb", source = "stDicitecePisFinancialFeb")
    @Mapping(target = "pisPercentageTotal", source = "stDicitecePisPercentageTotal")
    @Mapping(target = "pisFinancialTotal", source = "stDicitecePisFinancialTotal")
    @Mapping(target = "workshopDependencyAssistance", source = "stDiciteceWorkshopDependencyAssistance")
    @Mapping(target = "agreementsTypeTrainingOO", source = "stDiciteceAgreementsTypeTrainingOO")
    @Mapping(target = "agreementsTypeTrainingTcos", source = "stDiciteceAgreementsTypeTrainingTcos")
    @Mapping(target = "agreementsTypeTrainingCivil", source = "stDiciteceAgreementsTypeTrainingCivil")
    @Mapping(target = "agreementsTypeIdOO", source = "stDiciteceAgreementsTypeIdOO")
    @Mapping(target = "agreementsTypeIdTcos", source = "stDiciteceAgreementsTypeIdTcos")
    @Mapping(target = "agreementsTypeIdCivil", source = "stDiciteceAgreementsTypeIdCivil")
    @Mapping(target = "agreementsPersonalTrainingOO", source = "stDiciteceAgreementsPersonalTrainingOO")
    @Mapping(target = "agreementsPersonalTrainingTcos", source = "stDiciteceAgreementsPersonalTrainingTcos")
    @Mapping(target = "agreementsPersonalTrainingCivil", source = "stDiciteceAgreementsPersonalTrainingCivil")
    @Mapping(target = "agreementsPersonalIdOO", source = "stDiciteceAgreementsPersonalIdOO")
    @Mapping(target = "agreementsPersonalIdTcos", source = "stDiciteceAgreementsPersonalIdTcos")
    @Mapping(target = "agreementsPersonalIdCivil", source = "stDiciteceAgreementsPersonalIdCivil")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiciteceDto mapperToDto(EpStatisticsDiciteceEntity source);

    List<StatisticsDiciteceDto> mapperToList(Iterable<EpStatisticsDiciteceEntity> entities);
}