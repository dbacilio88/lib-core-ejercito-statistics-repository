package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsDinveDto
 * <p>
 * StatisticsDinveDto class.
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
public class StatisticsDinveDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String typeInvestment;
    private Double idtIoarrInfrastructure;
    private Double idtIoarrEquipment;
    private Double idtIoarrInfrastructureEquipment;
    private Double idtPiInfrastructure;
    private Double idtPiEquipment;
    private Double idtPiInfrastructureEquipment;
    private Double ibiIoarrInfrastructure;
    private Double ibiIoarrEquipment;
    private Double ibiIoarrInfrastructureEquipment;
    private Double ibiPiInfrastructure;
    private Double ibiPiEquipment;
    private Double ibiPiInfrastructureEquipment;
    private Double ifeIoarrInfrastructure;
    private Double ifeIoarrEquipment;
    private Double ifeIoarrInfrastructureEquipment;
    private Double ifePiInfrastructure;
    private Double ifePiEquipment;
    private Double ifePiInfrastructureEquipment;
    private Double epiIoarr;
    private Double epiPiFts;
    private Double epiPiFte;
    private Double epiPiFmc;
    private Double epiPiEnp;

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