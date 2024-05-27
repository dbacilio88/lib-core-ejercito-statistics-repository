package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * StatisticsDilogeDto
 * <p>
 * StatisticsDilogeDto class.
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
public class StatisticsDilogeDto extends StatisticsDateDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String pmbso;
    private String requirements;
    private String summary;
    private double current;
    private double sNew;
    private double sUpdate;
    private double sProgress;
    private String products;
    private double cologe;
    private double cogae;
    private double cosale;
    private double coede;
    private double copere;
    private double cote;
    private double ae;
    private double ide;
    private double iide;
    private double iiide;
    private double ivde;
    private double vde;
}