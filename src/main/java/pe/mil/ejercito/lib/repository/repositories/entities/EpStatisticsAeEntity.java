package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsAeEntity
 * <p>
 * EpStatisticsAeEntity class.
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
@Table(name = "EP_STATISTICS_AE", indexes = {
    @Index(name = "EP_STATISTICS_AE_UN1", columnList = "STA_UUID", unique = true)
})
public class EpStatisticsAeEntity extends EpStatisticsDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_AE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_AE_SEQ", sequenceName = "EP_STATISTICS_AE_SEQ", allocationSize = 1)
    @Column(name = "STA_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STA_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STA_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity staDocument;

    @Size(max = 120)
    @Column(name = "STA_MAINTENANCE", length = 120)
    private String staMaintenance;

    @Size(max = 120)
    @Column(name = "STA_TYPE_HELICOPTER", length = 120)
    private String staTypeHelicopter;

    @Size(max = 120)
    @Column(name = "STA_AIRPLANE_REGISTRATION", length = 120)
    private String staAirplaneRegistration;

    @Size(max = 120)
    @Column(name = "STA_HRS_MAINTENANCE")
    private String staHrsMaintenance;

    @Column(name = "STA_HRS_ASSIGNED")
    private Double staHrsAssigned;

    @Column(name = "STA_HRS_FLOWN")
    private Double staHrsFlown;

}