package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsDiradneEntity
 * <p>
 * EpStatisticsDiradneEntity class.
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
@Entity
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EP_STATISTICS_DIRADNE", indexes = {
    @Index(name = "EP_STATISTICS_DIRADNE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDiradneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DIRADNE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DIRADNE_SEQ", sequenceName = "EP_STATISTICS_DIRADNE_SEQ", allocationSize = 1)
    @Column(name = "STD_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STD_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STD_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stdDocument;


    @Column(name = "STD_AGREEMENTS_CM_INST_PRIVATE")
    private Double stdAgreementsCmInstPrivate;

    @Column(name = "STD_AGREEMENTS_CM_INST_PUBLIC")
    private Double stdAgreementsCmInstPublic;

    @Column(name = "STD_AGREEMENTS_CM_GOB_LOCAL")
    private Double stdAgreementsCmGobLocal;

    @Column(name = "STD_AGREEMENTS_CE_INST_PRIVATE")
    private Double stdAgreementsCeInstPrivate;

    @Column(name = "STD_AGREEMENTS_CE_INST_PUBLIC")
    private Double stdAgreementsCeInstPublic;

    @Column(name = "STD_AGREEMENTS_CE_GOB_LOCAL")
    private Double stdAgreementsCeGobLocal;

    @Column(name = "STD_RISKS_MILITARY_ACTIONS_REPORT")
    private Double stdRisksMilitaryActionsReport;

    @Column(name = "STD_RISKS_TSUNAMI")
    private Double stdRisksTsunami;

    @Column(name = "STD_RISKS_CIRD")
    private Double stdRisksCird;

    @Column(name = "STD_RISKS_TRAINING_ENTITIES")
    private Double stdRisksTrainingEntities;

    @Column(name = "STD_SUPPORT_POPULATION_AC")
    private Double stdSupportPopulationAc;

    @Column(name = "STD_SUPPORT_POPULATION_AH")
    private Double stdSupportPopulationAh;

    @Column(name = "STD_SUPPORT_POPULATION_PB")
    private Double stdSupportPopulationPb;

    @Column(name = "STD_ROAD_CONSTRUCTION")
    private Double stdRoadConstruction;

    @Column(name = "STD_ROAD_MAINTENANCE")
    private Double stdRoadMaintenance;

    @Column(name = "STD_ROAD_REHABILITATION")
    private Double stdRoadRehabilitation;

    @Column(name = "STD_ROAD_PB")
    private Double stdRoadPb;

    @Column(name = "STD_ENVIRONMENTAL_ACTIVITIES")
    private Double stdEnvironmentalActivities;

    @Column(name = "STD_ENVIRONMENTAL_MANAGEMENT")
    private Double stdEnvironmentalManagement;

    @Column(name = "STD_ENVIRONMENTAL_COMPLIANCE")
    private Double stdEnvironmentalCompliance;

    @Column(name = "STD_ENVIRONMENTAL_MITIGATION")
    private Double stdEnvironmentalMitigation;

    @Column(name = "STD_ENVIRONMENTAL_STRENGTHENING")
    private Double stdEnvironmentalStrengthening;


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