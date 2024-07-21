package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsDiciteceDto
 * <p>
 * StatisticsDiciteceDto class.
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
public class StatisticsDiciteceDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String investigationArea;
    private String projectName;
    private String workshopName;
    private double personalOO;
    private double personalTcos;
    private double personalCivil;
    private double personalExternal;
    private double personalTotal;
    private double pisPercentageEne;
    private double pisFinancialEne;
    private double pisPercentageFeb;
    private double pisFinancialFeb;
    private double pisPercentageTotal;
    private double pisFinancialTotal;
    private double workshopDependencyAssistance;
    private double agreementsTypeTrainingOO;
    private double agreementsTypeTrainingTcos;
    private double agreementsTypeTrainingCivil;
    private double agreementsTypeIdOO;
    private double agreementsTypeIdTcos;
    private double agreementsTypeIdCivil;
    private double agreementsPersonalTrainingOO;
    private double agreementsPersonalTrainingTcos;
    private double agreementsPersonalTrainingCivil;
    private double agreementsPersonalIdOO;
    private double agreementsPersonalIdTcos;
    private double agreementsPersonalIdCivil;
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