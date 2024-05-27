package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDilogeEntity
 * <p>
 * EpStatisticsDilogeEntity class.
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
@Table(name = "EP_STATISTICS_DILOGE", indexes = {
    @Index(name = "EP_STATISTICS_DILOGE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDilogeEntity extends EpStatisticsDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DILOGE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DILOGE_SEQ", sequenceName = "EP_STATISTICS_DILOGE_SEQ", allocationSize = 1)
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


    @Size(max = 200)
    @Column(name = "STD_PMBSO", length = 200)
    private String stDilogePmbso;

    @Size(max = 200)
    @Column(name = "STD_REQUIREMENTS", length = 200)
    private String stDilogeRequirements;

    @Column(name = "STD_COLOGE")
    private Double stDilogeCologe;

    @Column(name = "STD_COGAE")
    private Double stDilogeCogae;

    @Column(name = "STD_COSALE")
    private Double stDilogeCosale;

    @Column(name = "STD_COEDE")
    private Double stDilogeCoede;

    @Column(name = "STD_COPERE")
    private Double stDilogeCopere;

    @Column(name = "STD_COTE")
    private Double stDilogeCote;

    @Column(name = "STD_AE")
    private Double stDilogeAe;

    @Column(name = "STD_IDE")
    private Double stDilogeIde;

    @Column(name = "STD_IIDE")
    private Double stDilogeIIDe;

    @Column(name = "STD_IIIDE")
    private Double stDilogeIIIDe;

    @Column(name = "STD_IVDE")
    private Double stDilogeIVDe;

    @Column(name = "STD_VDE")
    private Double stDilogeVde;

    @Size(max = 200)
    @Column(name = "STD_SUMMARY", length = 200)
    private String stDilogeSummary;

    @Column(name = "STD_CURRENT")
    private Double stDilogeCurrent;

    @Column(name = "STD_NEW")
    private Double stDilogeNew;

    @Column(name = "STD_UPDATE")
    private Double stDilogeUpdate;

    @Column(name = "STD_PROGRESS")
    private Double stDilogeProgress;

    @Size(max = 200)
    @Column(name = "STD_PRODUCTS", length = 200)
    private String stDilogeProducts;
}