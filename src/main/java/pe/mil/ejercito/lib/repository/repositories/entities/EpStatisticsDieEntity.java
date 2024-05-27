package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDieEntity
 * <p>
 * EpStatisticsDieEntity class.
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
@Table(name = "EP_STATISTICS_DIE", indexes = {
    @Index(name = "EP_STATISTICS_DIE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDieEntity extends EpStatisticsDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DIE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DIE_SEQ", sequenceName = "EP_STATISTICS_DIE_SEQ", allocationSize = 1)
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

    @Size(max = 120)
    @Column(name = "STD_ACTION_OOTT", length = 120)
    private String stDieActionOoTt;

    @Size(max = 120)
    @Column(name = "STD_ACTIVITIES", length = 120)
    private String stDieActivities;

    @Size(max = 200)
    @Column(name = "STD_TYPES_MEASUREMENTS", length = 200)
    private String stDieTypesMeasurements;
}