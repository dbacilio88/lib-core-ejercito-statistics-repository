package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * StatisticsDiradneDto
 * <p>
 * StatisticsDiradneDto class.
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
public class StatisticsDiradneDto extends StatisticsBaseDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private double agreementsCmInstPrivate;
    private double agreementsCmInstPublic;
    private double agreementsCmGobLocal;
    private double agreementsCeInstPrivate;
    private double agreementsCeInstPublic;
    private double agreementsCeGobLocal;
    private double risksMilitaryActionsReport;
    private double risksTsunami;
    private double risksCird;
    private double risksTrainingEntities;
    private double supportPopulationAc;
    private double supportPopulationAh;
    private double supportPopulationPb;
    private double roadConstruction;
    private double roadMaintenance;
    private double roadRehabilitation;
    private double roadPb;
    private double environmentalActivities;
    private double environmentalManagement;
    private double environmentalCompliance;
    private double environmentalMitigation;
    private double environmentalStrengthening;
}