package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;


/**
 * EpStatisticsCoteEntity
 * <p>
 * EpStatisticsCoteEntity class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "EP_STATISTICS_COTE", indexes = {
    @Index(name = "EP_STATISTICS_COTE_UN1", columnList = "STC_UUID", unique = true),
})
public class EpStatisticsCoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_COTE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_COTE_SEQ", sequenceName = "EP_STATISTICS_COTE_SEQ", allocationSize = 1)
    @Column(name = "STC_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STC_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private EpDocumentRegisterEntity stcDocument;

    @Column(name = "STC_TEST_APPROVED_OO")
    private Double stcTestApprovedOo;

    @Column(name = "STC_TEST_APPROVED_TCOS")
    private Double stcTestApprovedTcos;

    @Column(name = "STC_TEST_DISAPPROVED_OO")
    private Double stcTestDisapprovedOo;

    @Column(name = "STC_TEST_DISAPPROVED_TCOS")
    private Double stcTestDisapprovedTcos;

    @Column(name = "STC_BORDER_SURVEILLANCE")
    private Double stcBorderSurveillance;

    @Column(name = "STC_HUMANITARIAN_DEMINING")
    private Double stcHumanitarianDemining;

    @Column(name = "STC_AGAINST_OT_SL")
    private Double stcAgainstOtSl;

    @Column(name = "STC_DRUG_TRAFFICKING")
    private Double stcDrugTrafficking;

    @Column(name = "STC_ILLEGAL_MINERY")
    private Double stcIllegalMinery;

    @Column(name = "STC_INTERNAL_ORDER")
    private Double stcInternalOrder;

    @Column(name = "STC_BIOLOGICAL_THREATS")
    private Double stcBiologicalThreats;

    @Column(name = "STC_NATIONAL_DEVELOPMENT")
    private Double stcNationalDevelopment;

    @Column(name = "STC_SINAGERD")
    private Double stcSinagerd;

    @Column(name = "STC_ELECTORAL_ELECTIONS")
    private Double stcElectoralElections;

    @Column(name = "STC_ILLEGAL_LOGGING")
    private Double stcIllegalLogging;

    @Column(name = "STC_IOFFENSIVE")
    private Double stcIoffensive;

    @Column(name = "STC_IDEFENSIVE")
    private Double stcIdefensive;

    @Column(name = "STC_IMILITARY_ACTION")
    private Double stcImilitaryAction;

    @Column(name = "STC_IATYPICAL_OPERATION")
    private Double stcIatypicalOperation;

    @Column(name = "STC_EOFFENSIVE")
    private Double stcEoffensive;

    @Column(name = "STC_EDEFENSIVE")
    private Double stcEdefensive;

    @Column(name = "STC_EMILITARY_ACTION")
    private Double stcEmilitaryAction;

    @Column(name = "STC_EATYPICAL_OPERATION")
    private Double stcEatypicalOperation;

    @Column(name = "STC_INSTRUCTION_OO")
    private Double stcInstructionOo;

    @Column(name = "STC_INSTRUCTION_TCOS")
    private Double stcInstructionTcos;

    @Column(name = "STC_INSTRUCTION_PTSVM")
    private Double stcInstructionPtsvm;

    @Column(name = "STC_TRAINING_OO")
    private Double stcTrainingOo;

    @Column(name = "STC_TRAINING_TCOS")
    private Double stcTrainingTcos;

    @Column(name = "STC_TRAINING_PTSVM")
    private Double stcTrainingPtsvm;

    @Size(max = 500)
    @Column(name = "ST_PLACE", length = 500)
    private String stPlace;

    @Size(max = 400)
    @Column(name = "ST_DIVISION", length = 400)
    private String stDivision;

    @Size(max = 400)
    @Column(name = "ST_DEPENDENCY", length = 400)
    private String stDependency;

    @Size(max = 400)
    @Column(name = "ST_OTHER_STATE", length = 400)
    private String stOtherState;

    @Size(max = 10)
    @Column(name = "ST_NRO", length = 10)
    private String stNro;

    @Column(name = "ST_TOTAL")
    private Double stTotal;

    @Size(max = 200)
    @Column(name = "ST_TYPE_SHEET", length = 200)
    private String stTypeSheet;

    @Size(max = 200)
    @Column(name = "ST_NAME_SHEET", length = 200)
    private String stNameSheet;

    @Size(max = 120)
    @Column(name = "ST_OBS", length = 120)
    private String stObs;

    @NotNull
    @Column(name = "ST_CREATED_DATE", nullable = false)
    private Instant stCreatedDate;

    @Column(name = "ST_UPDATED_DATE")
    private Instant stUpdatedDate;
}