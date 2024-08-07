package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsCoteDto
 * <p>
 * StatisticsCoteDto class.
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
public class StatisticsCoteDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private Double testApprovedOo;
    private Double testApprovedTcos;
    private Double testDisapprovedOo;
    private Double testDisapprovedTcos;
    private Double borderSurveillance;

    private Double humanitarianDemining;
    private Double againstOtSl;
    private Double drugTrafficking;
    private Double illegalMinery;
    private Double internalOrder;

    private Double biologicalThreats;
    private Double nationalDevelopment;
    private Double sinagerd;
    private Double electoralElections;
    private Double illegalLogging;

    private Double ioffensive;
    private Double idefensive;
    private Double imilitaryAction;
    private Double iatypicalOperation;
    private Double eoffensive;

    private Double edefensive;
    private Double emilitaryAction;
    private Double eatypicalOperation;
    private Double instructionOo;
    private Double instructionTcos;

    private Double instructionPtsvm;
    private Double trainingOo;
    private Double trainingTcos;
    private Double trainingPtsvm;

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