package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
@Table(name = "EP_STATISTICS_DIRADNE", indexes = {
    @Index(name = "EP_STATISTICS_DIRADNE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDiradneEntity extends EpStatisticsBaseEntity {

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
    private EpDocumentRegisterEntity stDocument;


    @Column(name = "STD_AGREEMENTS_CM_INST_PRIVATE")
    private Double stDiradneAgreementsCmInstPrivate;

    @Column(name = "STD_AGREEMENTS_CM_INST_PUBLIC")
    private Double stDiradneAgreementsCmInstPublic;

    @Column(name = "STD_AGREEMENTS_CM_GOB_LOCAL")
    private Double stDiradneAgreementsCmGobLocal;

    @Column(name = "STD_AGREEMENTS_CE_INST_PRIVATE")
    private Double stDiradneAgreementsCeInstPrivate;

    @Column(name = "STD_AGREEMENTS_CE_INST_PUBLIC")
    private Double stDiradneAgreementsCeInstPublic;

    @Column(name = "STD_AGREEMENTS_CE_GOB_LOCAL")
    private Double stDiradneAgreementsCeGobLocal;

    @Column(name = "STD_RISKS_MILITARY_ACTIONS_REPORT")
    private Double stDiradneRisksMilitaryActionsReport;

    @Column(name = "STD_RISKS_TSUNAMI")
    private Double stDiradneRisksTsunami;

    @Column(name = "STD_RISKS_CIRD")
    private Double stDiradneRisksCird;

    @Column(name = "STD_RISKS_TRAINING_ENTITIES")
    private Double stDiradneRisksTrainingEntities;

    @Column(name = "STD_SUPPORT_POPULATION_AC")
    private Double stDiradneSupportPopulationAc;

    @Column(name = "STD_SUPPORT_POPULATION_AH")
    private Double stDiradneSupportPopulationAh;

    @Column(name = "STD_SUPPORT_POPULATION_PB")
    private Double stDiradneSupportPopulationPb;

    @Column(name = "STD_ROAD_CONSTRUCTION")
    private Double stDiradneRoadConstruction;

    @Column(name = "STD_ROAD_MAINTENANCE")
    private Double stDiradneRoadMaintenance;

    @Column(name = "STD_ROAD_REHABILITATION")
    private Double stDiradneRoadRehabilitation;

    @Column(name = "STD_ROAD_PB")
    private Double stDiradneRoadPb;

    @Column(name = "STD_ENVIRONMENTAL_ACTIVITIES")
    private Double stDiradneEnvironmentalActivities;

    @Column(name = "STD_ENVIRONMENTAL_MANAGEMENT")
    private Double stDiradneEnvironmentalManagement;

    @Column(name = "STD_ENVIRONMENTAL_COMPLIANCE")
    private Double stDiradneEnvironmentalCompliance;

    @Column(name = "STD_ENVIRONMENTAL_MITIGATION")
    private Double stDiradneEnvironmentalMitigation;

    @Column(name = "STD_ENVIRONMENTAL_STRENGTHENING")
    private Double stDiradneEnvironmentalStrengthening;
}