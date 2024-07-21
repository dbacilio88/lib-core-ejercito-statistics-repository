package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsOeeDto
 * <p>
 * StatisticsOeeDto class.
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
public class StatisticsOeeDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String personal;
    private Double enePersonal;
    private Double febPersonal;
    private Double marPersonal;
    private Double abrPersonal;
    private Double mayPersonal;
    private Double junPersonal;
    private Double julPersonal;
    private Double agoPersonal;
    private Double septPersonal;
    private Double octPersonal;
    private Double novPersonal;
    private Double dicPersonal;
    private Double totalPersonal;
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
    private double ene;
    private double feb;
    private double mar;
    private double abr;
    private double may;
    private double jun;
    private double jul;
    private double ago;
    private double set;
    private double oct;
    private double nov;
    private double dic;
}