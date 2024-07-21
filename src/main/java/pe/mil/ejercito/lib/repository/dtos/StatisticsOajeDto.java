package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

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
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsOajeDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String situation;
    private String situationPersonal;

    private Double eneA;
    private Double eneB;
    private Double eneC;
    private Double eneD;
    private Double eneE;

    private Double febA;
    private Double febB;
    private Double febC;
    private Double febD;
    private Double febE;

    private Double marA;
    private Double marB;
    private Double marC;
    private Double marD;
    private Double marE;

    private Double abrA;
    private Double abrB;
    private Double abrC;
    private Double abrD;
    private Double abrE;

    private Double mayA;
    private Double mayB;
    private Double mayC;
    private Double mayD;
    private Double mayE;

    private Double junA;
    private Double junB;
    private Double junC;
    private Double junD;
    private Double junE;

    private Double julA;
    private Double julB;
    private Double julC;
    private Double julD;
    private Double julE;

    private Double agoA;
    private Double agoB;
    private Double agoC;
    private Double agoD;
    private Double agoE;

    private Double septA;
    private Double septB;
    private Double septC;
    private Double septD;
    private Double septE;

    private Double octA;
    private Double octB;
    private Double octC;
    private Double octD;
    private Double octE;

    private Double novA;
    private Double novB;
    private Double novC;
    private Double novD;
    private Double novE;

    private Double dicA;
    private Double dicB;
    private Double dicC;
    private Double dicD;
    private Double dicE;

    private Long id;
    private String uuId;
    private String document;
    private String place;
    private String division;
    private String dependency;
    private String otherState;
    private String nro;
    private double total;
    private String typeSheet;
    private String nameSheet;
    private String obs;
    private Instant created;
    private Instant updated;
}