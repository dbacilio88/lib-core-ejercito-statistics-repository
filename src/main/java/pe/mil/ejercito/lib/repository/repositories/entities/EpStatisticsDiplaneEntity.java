package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDiplaneEntity
 * <p>
 * EpStatisticsDiplaneEntity class.
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
@Table(name = "EP_STATISTICS_DIPLANE", indexes = {
    @Index(name = "EP_STATISTICS_DIPLANE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDiplaneEntity extends EpStatisticsBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DIPLANE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DIPLANE_SEQ", sequenceName = "EP_STATISTICS_DIPLANE_SEQ", allocationSize = 1)
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

    @Size(max = 500)
    @Column(name = "STD_STRATEGIC_OBJECTIVES", length = 500)
    private String stDiplaneStrategicObjectives;

    @Column(name = "STD_STRATEGIC_ACTIVITIES")
    private Double stDiplaneStrategicActivities;

    @Column(name = "STD_STRATEGIC_ADVANCE")
    private Double stDiplaneStrategicAdvance;

    @Size(max = 1000)
    @Column(name = "STD_ACTIVITIES", length = 1000)
    private String stDiplaneActivities;

    @Size(max = 1000)
    @Column(name = "STD_TASK", length = 1000)
    private String stDiplaneTask;

    @Size(max = 10)
    @Column(name = "STD_PROCESS_NRO", length = 10)
    private String stDiplaneProcessNro;

    @Size(max = 1000)
    @Column(name = "STD_PROCESS_NAME", length = 1000)
    private String stDiplaneProcessName;

    @Size(max = 100)
    @Column(name = "STD_PROCESS_TYPE", length = 100)
    private String stDiplaneProcessType;

    @Column(name = "STD_PROCESS_LEVEL1")
    private Double stDiplaneProcessLevel1;

    @Column(name = "STD_PROCESS_LEVEL2")
    private Double stDiplaneProcessLevel2;

    @Column(name = "STD_PROCESS_TOTAL")
    private Double stDiplaneProcessTotal;
}