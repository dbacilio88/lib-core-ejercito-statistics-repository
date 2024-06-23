package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsOeeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsOeeEntity;

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
public interface IStatisticsOeeMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stOtherState", source = "otherState")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")


    @Mapping(target = "stPersonal", source = "personal")
    @Mapping(target = "stEnePersonal", source = "enePersonal")
    @Mapping(target = "stFebPersonal", source = "febPersonal")
    @Mapping(target = "stMarPersonal", source = "marPersonal")
    @Mapping(target = "stAbrPersonal", source = "abrPersonal")
    @Mapping(target = "stMayPersonal", source = "mayPersonal")
    @Mapping(target = "stJunPersonal", source = "junPersonal")
    @Mapping(target = "stJulPersonal", source = "julPersonal")
    @Mapping(target = "stAgoPersonal", source = "agoPersonal")
    @Mapping(target = "stSetPersonal", source = "setPersonal")
    @Mapping(target = "stOctPersonal", source = "octPersonal")
    @Mapping(target = "stNovPersonal", source = "novPersonal")
    @Mapping(target = "stDicPersonal", source = "dicPersonal")

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
    EpStatisticsOeeEntity mapperToEntity(StatisticsOeeDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")


    @Mapping(target = "personal", source = "stPersonal")
    @Mapping(target = "enePersonal", source = "stEnePersonal")
    @Mapping(target = "febPersonal", source = "stFebPersonal")
    @Mapping(target = "marPersonal", source = "stMarPersonal")
    @Mapping(target = "abrPersonal", source = "stAbrPersonal")
    @Mapping(target = "mayPersonal", source = "stMayPersonal")
    @Mapping(target = "junPersonal", source = "stJunPersonal")
    @Mapping(target = "julPersonal", source = "stJulPersonal")
    @Mapping(target = "agoPersonal", source = "stAgoPersonal")
    @Mapping(target = "setPersonal", source = "stSetPersonal")
    @Mapping(target = "octPersonal", source = "stOctPersonal")
    @Mapping(target = "novPersonal", source = "stNovPersonal")
    @Mapping(target = "dicPersonal", source = "stDicPersonal")

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
    StatisticsOeeDto mapperToDto(EpStatisticsOeeEntity source);

    List<StatisticsOeeDto> mapperToList(Iterable<EpStatisticsOeeEntity> entities);
}