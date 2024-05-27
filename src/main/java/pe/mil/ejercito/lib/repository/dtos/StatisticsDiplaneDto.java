package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * StatisticsDiplaneDto
 * <p>
 * StatisticsDiplaneDto class.
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
public class StatisticsDiplaneDto extends StatisticsBaseDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String strategicObjectives;
    private double strategicActivities;
    private double strategicAdvance;
    private String activities;
    private String task;
    private String processName;
    private String processType;
    private double processLevel1;
    private double processLevel2;
    private double processTotal;


}