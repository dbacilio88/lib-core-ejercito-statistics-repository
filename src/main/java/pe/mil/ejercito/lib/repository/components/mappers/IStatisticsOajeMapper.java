package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsOajeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsOajeEntity;

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
public interface IStatisticsOajeMapper {

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
    @Mapping(target = "stoSituation", source = "OSituation")
    @Mapping(target = "stoSituationPersonal", source = "OSituationPersonal")

    @Mapping(target = "stoEneA", source = "OEneA")
    @Mapping(target = "stoEneB", source = "OEneB")
    @Mapping(target = "stoEneC", source = "OEneC")
    @Mapping(target = "stoEneD", source = "OEneD")
    @Mapping(target = "stoEneE", source = "OEneE")

    @Mapping(target = "stoFebA", source = "OFebA")
    @Mapping(target = "stoFebB", source = "OFebB")
    @Mapping(target = "stoFebC", source = "OFebC")
    @Mapping(target = "stoFebD", source = "OFebD")
    @Mapping(target = "stoFebE", source = "OFebE")

    @Mapping(target = "stoMarA", source = "OMarA")
    @Mapping(target = "stoMarB", source = "OMarB")
    @Mapping(target = "stoMarC", source = "OMarC")
    @Mapping(target = "stoMarD", source = "OMarD")
    @Mapping(target = "stoMarE", source = "OMarE")

    @Mapping(target = "stoAbrA", source = "OAbrA")
    @Mapping(target = "stoAbrB", source = "OAbrB")
    @Mapping(target = "stoAbrC", source = "OAbrC")
    @Mapping(target = "stoAbrD", source = "OAbrD")
    @Mapping(target = "stoAbrE", source = "OAbrE")

    @Mapping(target = "stoMayA", source = "OMayA")
    @Mapping(target = "stoMayB", source = "OMayB")
    @Mapping(target = "stoMayC", source = "OMayC")
    @Mapping(target = "stoMayD", source = "OMayD")
    @Mapping(target = "stoMayE", source = "OMayE")

    @Mapping(target = "stoJunA", source = "OJunA")
    @Mapping(target = "stoJunB", source = "OJunB")
    @Mapping(target = "stoJunC", source = "OJunC")
    @Mapping(target = "stoJunD", source = "OJunD")
    @Mapping(target = "stoJunE", source = "OJunE")

    @Mapping(target = "stoJulA", source = "OJulA")
    @Mapping(target = "stoJulB", source = "OJulB")
    @Mapping(target = "stoJulC", source = "OJulC")
    @Mapping(target = "stoJulD", source = "OJulD")
    @Mapping(target = "stoJulE", source = "OJulE")

    @Mapping(target = "stoAgoA", source = "OAgoA")
    @Mapping(target = "stoAgoB", source = "OAgoB")
    @Mapping(target = "stoAgoC", source = "OAgoC")
    @Mapping(target = "stoAgoD", source = "OAgoD")
    @Mapping(target = "stoAgoE", source = "OAgoE")

    @Mapping(target = "stoSetA", source = "OSetA")
    @Mapping(target = "stoSetB", source = "OSetB")
    @Mapping(target = "stoSetC", source = "OSetC")
    @Mapping(target = "stoSetD", source = "OSetD")
    @Mapping(target = "stoSetE", source = "OSetE")

    @Mapping(target = "stoOctA", source = "OOctA")
    @Mapping(target = "stoOctB", source = "OOctB")
    @Mapping(target = "stoOctC", source = "OOctC")
    @Mapping(target = "stoOctD", source = "OOctD")
    @Mapping(target = "stoOctE", source = "OOctE")

    @Mapping(target = "stoNovA", source = "ONovA")
    @Mapping(target = "stoNovB", source = "ONovB")
    @Mapping(target = "stoNovC", source = "ONovC")
    @Mapping(target = "stoNovD", source = "ONovD")
    @Mapping(target = "stoNovE", source = "ONovE")

    @Mapping(target = "stoDicA", source = "ODicA")
    @Mapping(target = "stoDicB", source = "ODicB")
    @Mapping(target = "stoDicC", source = "ODicC")
    @Mapping(target = "stoDicD", source = "ODicD")
    @Mapping(target = "stoDicE", source = "ODicE")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsOajeEntity mapperToEntity(StatisticsOajeDto source);

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
    @Mapping(target = "OSituation", source = "stoSituation")
    @Mapping(target = "OSituationPersonal", source = "stoSituationPersonal")

    @Mapping(target = "OEneA", source = "stoEneA")
    @Mapping(target = "OEneB", source = "stoEneB")
    @Mapping(target = "OEneC", source = "stoEneC")
    @Mapping(target = "OEneD", source = "stoEneD")
    @Mapping(target = "OEneE", source = "stoEneE")

    @Mapping(target = "OFebA", source = "stoFebA")
    @Mapping(target = "OFebB", source = "stoFebB")
    @Mapping(target = "OFebC", source = "stoFebC")
    @Mapping(target = "OFebD", source = "stoFebD")
    @Mapping(target = "OFebE", source = "stoFebE")

    @Mapping(target = "OMarA", source = "stoMarA")
    @Mapping(target = "OMarB", source = "stoMarB")
    @Mapping(target = "OMarC", source = "stoMarC")
    @Mapping(target = "OMarD", source = "stoMarD")
    @Mapping(target = "OMarE", source = "stoMarE")

    @Mapping(target = "OAbrA", source = "stoAbrA")
    @Mapping(target = "OAbrB", source = "stoAbrB")
    @Mapping(target = "OAbrC", source = "stoAbrC")
    @Mapping(target = "OAbrD", source = "stoAbrD")
    @Mapping(target = "OAbrE", source = "stoAbrE")

    @Mapping(target = "OMayA", source = "stoMayA")
    @Mapping(target = "OMayB", source = "stoMayB")
    @Mapping(target = "OMayC", source = "stoMayC")
    @Mapping(target = "OMayD", source = "stoMayD")
    @Mapping(target = "OMayE", source = "stoMayE")

    @Mapping(target = "OJunA", source = "stoJunA")
    @Mapping(target = "OJunB", source = "stoJunB")
    @Mapping(target = "OJunC", source = "stoJunC")
    @Mapping(target = "OJunD", source = "stoJunD")
    @Mapping(target = "OJunE", source = "stoJunE")

    @Mapping(target = "OJulA", source = "stoJulA")
    @Mapping(target = "OJulB", source = "stoJulB")
    @Mapping(target = "OJulC", source = "stoJulC")
    @Mapping(target = "OJulD", source = "stoJulD")
    @Mapping(target = "OJulE", source = "stoJulE")

    @Mapping(target = "OAgoA", source = "stoAgoA")
    @Mapping(target = "OAgoB", source = "stoAgoB")
    @Mapping(target = "OAgoC", source = "stoAgoC")
    @Mapping(target = "OAgoD", source = "stoAgoD")
    @Mapping(target = "OAgoE", source = "stoAgoE")


    @Mapping(target = "OSetA", source = "stoSetA")
    @Mapping(target = "OSetB", source = "stoSetB")
    @Mapping(target = "OSetC", source = "stoSetC")
    @Mapping(target = "OSetD", source = "stoSetD")
    @Mapping(target = "OSetE", source = "stoSetE")

    @Mapping(target = "OOctA", source = "stoOctA")
    @Mapping(target = "OOctB", source = "stoOctB")
    @Mapping(target = "OOctC", source = "stoOctC")
    @Mapping(target = "OOctD", source = "stoOctD")
    @Mapping(target = "OOctE", source = "stoOctE")

    @Mapping(target = "ONovA", source = "stoNovA")
    @Mapping(target = "ONovB", source = "stoNovB")
    @Mapping(target = "ONovC", source = "stoNovC")
    @Mapping(target = "ONovD", source = "stoNovD")
    @Mapping(target = "ONovE", source = "stoNovE")

    @Mapping(target = "ODicA", source = "stoDicA")
    @Mapping(target = "ODicB", source = "stoDicB")
    @Mapping(target = "ODicC", source = "stoDicC")
    @Mapping(target = "ODicD", source = "stoDicD")
    @Mapping(target = "ODicE", source = "stoDicE")

    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsOajeDto mapperToDto(EpStatisticsOajeEntity source);

    List<StatisticsOajeDto> mapperToList(Iterable<EpStatisticsOajeEntity> entities);
}