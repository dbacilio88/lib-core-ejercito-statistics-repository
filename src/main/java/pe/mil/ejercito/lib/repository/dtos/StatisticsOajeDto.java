package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * StatisticsOajeDto
 * <p>
 * StatisticsOajeDto class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsOajeDto extends StatisticsBaseDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String oSituation;
    private String oSituationPersonal;

    private Double oEneA;
    private Double oEneB;
    private Double oEneC;
    private Double oEneD;
    private Double oEneE;

    private Double oFebA;
    private Double oFebB;
    private Double oFebC;
    private Double oFebD;
    private Double oFebE;

    private Double oMarA;
    private Double oMarB;
    private Double oMarC;
    private Double oMarD;
    private Double oMarE;

    private Double oAbrA;
    private Double oAbrB;
    private Double oAbrC;
    private Double oAbrD;
    private Double oAbrE;

    private Double oMayA;
    private Double oMayB;
    private Double oMayC;
    private Double oMayD;
    private Double oMayE;

    private Double oJunA;
    private Double oJunB;
    private Double oJunC;
    private Double oJunD;
    private Double oJunE;

    private Double oJulA;
    private Double oJulB;
    private Double oJulC;
    private Double oJulD;
    private Double oJulE;

    private Double oAgoA;
    private Double oAgoB;
    private Double oAgoC;
    private Double oAgoD;
    private Double oAgoE;

    private Double oSetA;
    private Double oSetB;
    private Double oSetC;
    private Double oSetD;
    private Double oSetE;

    private Double oOctA;
    private Double oOctB;
    private Double oOctC;
    private Double oOctD;
    private Double oOctE;

    private Double oNovA;
    private Double oNovB;
    private Double oNovC;
    private Double oNovD;
    private Double oNovE;

    private Double oDicA;
    private Double oDicB;
    private Double oDicC;
    private Double oDicD;
    private Double oDicE;
}