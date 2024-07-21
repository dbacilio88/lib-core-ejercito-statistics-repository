package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsOajeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsOajeEntity;

import java.util.List;

/**
 * IStatisticsOajeMapper
 * <p>
 * IStatisticsOajeMapper interface.
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
    @Mapping(target = "stoSituation", source = "situation")
    @Mapping(target = "stoSituationPersonal", source = "situationPersonal")

    @Mapping(target = "stoEneA", source = "eneA")
    @Mapping(target = "stoEneB", source = "eneB")
    @Mapping(target = "stoEneC", source = "eneC")
    @Mapping(target = "stoEneD", source = "eneD")
    @Mapping(target = "stoEneE", source = "eneE")

    @Mapping(target = "stoFebA", source = "febA")
    @Mapping(target = "stoFebB", source = "febB")
    @Mapping(target = "stoFebC", source = "febC")
    @Mapping(target = "stoFebD", source = "febD")
    @Mapping(target = "stoFebE", source = "febE")

    @Mapping(target = "stoMarA", source = "marA")
    @Mapping(target = "stoMarB", source = "marB")
    @Mapping(target = "stoMarC", source = "marC")
    @Mapping(target = "stoMarD", source = "marD")
    @Mapping(target = "stoMarE", source = "marE")

    @Mapping(target = "stoAbrA", source = "abrA")
    @Mapping(target = "stoAbrB", source = "abrB")
    @Mapping(target = "stoAbrC", source = "abrC")
    @Mapping(target = "stoAbrD", source = "abrD")
    @Mapping(target = "stoAbrE", source = "abrE")

    @Mapping(target = "stoMayA", source = "mayA")
    @Mapping(target = "stoMayB", source = "mayB")
    @Mapping(target = "stoMayC", source = "mayC")
    @Mapping(target = "stoMayD", source = "mayD")
    @Mapping(target = "stoMayE", source = "mayE")

    @Mapping(target = "stoJunA", source = "junA")
    @Mapping(target = "stoJunB", source = "junB")
    @Mapping(target = "stoJunC", source = "junC")
    @Mapping(target = "stoJunD", source = "junD")
    @Mapping(target = "stoJunE", source = "junE")

    @Mapping(target = "stoJulA", source = "julA")
    @Mapping(target = "stoJulB", source = "julB")
    @Mapping(target = "stoJulC", source = "julC")
    @Mapping(target = "stoJulD", source = "julD")
    @Mapping(target = "stoJulE", source = "julE")

    @Mapping(target = "stoAgoA", source = "agoA")
    @Mapping(target = "stoAgoB", source = "agoB")
    @Mapping(target = "stoAgoC", source = "agoC")
    @Mapping(target = "stoAgoD", source = "agoD")
    @Mapping(target = "stoAgoE", source = "agoE")

    @Mapping(target = "stoSetA", source = "septA")
    @Mapping(target = "stoSetB", source = "septB")
    @Mapping(target = "stoSetC", source = "septC")
    @Mapping(target = "stoSetD", source = "septD")
    @Mapping(target = "stoSetE", source = "septE")

    @Mapping(target = "stoOctA", source = "octA")
    @Mapping(target = "stoOctB", source = "octB")
    @Mapping(target = "stoOctC", source = "octC")
    @Mapping(target = "stoOctD", source = "octD")
    @Mapping(target = "stoOctE", source = "octE")

    @Mapping(target = "stoNovA", source = "novA")
    @Mapping(target = "stoNovB", source = "novB")
    @Mapping(target = "stoNovC", source = "novC")
    @Mapping(target = "stoNovD", source = "novD")
    @Mapping(target = "stoNovE", source = "novE")

    @Mapping(target = "stoDicA", source = "dicA")
    @Mapping(target = "stoDicB", source = "dicB")
    @Mapping(target = "stoDicC", source = "dicC")
    @Mapping(target = "stoDicD", source = "dicD")
    @Mapping(target = "stoDicE", source = "dicE")

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
    @Mapping(target = "situation", source = "stoSituation")
    @Mapping(target = "situationPersonal", source = "stoSituationPersonal")

    @Mapping(target = "eneA", source = "stoEneA")
    @Mapping(target = "eneB", source = "stoEneB")
    @Mapping(target = "eneC", source = "stoEneC")
    @Mapping(target = "eneD", source = "stoEneD")
    @Mapping(target = "eneE", source = "stoEneE")

    @Mapping(target = "febA", source = "stoFebA")
    @Mapping(target = "febB", source = "stoFebB")
    @Mapping(target = "febC", source = "stoFebC")
    @Mapping(target = "febD", source = "stoFebD")
    @Mapping(target = "febE", source = "stoFebE")

    @Mapping(target = "marA", source = "stoMarA")
    @Mapping(target = "marB", source = "stoMarB")
    @Mapping(target = "marC", source = "stoMarC")
    @Mapping(target = "marD", source = "stoMarD")
    @Mapping(target = "marE", source = "stoMarE")

    @Mapping(target = "abrA", source = "stoAbrA")
    @Mapping(target = "abrB", source = "stoAbrB")
    @Mapping(target = "abrC", source = "stoAbrC")
    @Mapping(target = "abrD", source = "stoAbrD")
    @Mapping(target = "abrE", source = "stoAbrE")

    @Mapping(target = "mayA", source = "stoMayA")
    @Mapping(target = "mayB", source = "stoMayB")
    @Mapping(target = "mayC", source = "stoMayC")
    @Mapping(target = "mayD", source = "stoMayD")
    @Mapping(target = "mayE", source = "stoMayE")

    @Mapping(target = "junA", source = "stoJunA")
    @Mapping(target = "junB", source = "stoJunB")
    @Mapping(target = "junC", source = "stoJunC")
    @Mapping(target = "junD", source = "stoJunD")
    @Mapping(target = "junE", source = "stoJunE")

    @Mapping(target = "julA", source = "stoJulA")
    @Mapping(target = "julB", source = "stoJulB")
    @Mapping(target = "julC", source = "stoJulC")
    @Mapping(target = "julD", source = "stoJulD")
    @Mapping(target = "julE", source = "stoJulE")

    @Mapping(target = "agoA", source = "stoAgoA")
    @Mapping(target = "agoB", source = "stoAgoB")
    @Mapping(target = "agoC", source = "stoAgoC")
    @Mapping(target = "agoD", source = "stoAgoD")
    @Mapping(target = "agoE", source = "stoAgoE")


    @Mapping(target = "septA", source = "stoSetA")
    @Mapping(target = "septB", source = "stoSetB")
    @Mapping(target = "septC", source = "stoSetC")
    @Mapping(target = "septD", source = "stoSetD")
    @Mapping(target = "septE", source = "stoSetE")

    @Mapping(target = "octA", source = "stoOctA")
    @Mapping(target = "octB", source = "stoOctB")
    @Mapping(target = "octC", source = "stoOctC")
    @Mapping(target = "octD", source = "stoOctD")
    @Mapping(target = "octE", source = "stoOctE")

    @Mapping(target = "novA", source = "stoNovA")
    @Mapping(target = "novB", source = "stoNovB")
    @Mapping(target = "novC", source = "stoNovC")
    @Mapping(target = "novD", source = "stoNovD")
    @Mapping(target = "novE", source = "stoNovE")

    @Mapping(target = "dicA", source = "stoDicA")
    @Mapping(target = "dicB", source = "stoDicB")
    @Mapping(target = "dicC", source = "stoDicC")
    @Mapping(target = "dicD", source = "stoDicD")
    @Mapping(target = "dicE", source = "stoDicE")

    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsOajeDto mapperToDto(EpStatisticsOajeEntity source);

    List<StatisticsOajeDto> mapperToList(Iterable<EpStatisticsOajeEntity> entities);
}