package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * StatisticsCoadneDto
 * <p>
 * StatisticsCoadneDto class.
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
public class StatisticsCoadneDto extends StatisticsBaseDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private double astOo;
    private double astTs;
    private double astEc;
    private double asaOo;
    private double asaTs;
    private double asaEc;
    private double dhArea;
    private double dhOo;
    private double dhTcos;
    private double dhAreaToDemine;
    private String acDpto;
    private String acProv;
    private String acDist;
    private String acTypeActivity;
    private String acDateInit;
    private String acDateEnd;
    private double acBenefitedPopulation;
    private double acMetering;
    private String acTypeOfCivicAction;
}