package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsOeeDto extends StatisticsDateDto implements Serializable {

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
    private Double setPersonal;
    private Double octPersonal;
    private Double novPersonal;
    private Double dicPersonal;
}