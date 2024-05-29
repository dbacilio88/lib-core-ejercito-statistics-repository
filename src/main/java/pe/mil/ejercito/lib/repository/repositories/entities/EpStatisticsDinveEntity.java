package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDinveEntity
 * <p>
 * EpStatisticsDinveEntity class.
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
@Table(name = "EP_STATISTICS_DINVE", indexes = {
    @Index(name = "EP_STATISTICS_DINVE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDinveEntity extends EpStatisticsBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DINVE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DINVE_SEQ", sequenceName = "EP_STATISTICS_DINVE_SEQ", allocationSize = 1)
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


    @Size(max = 500)
    @Column(name = "STD_TYPE_INVESTMENT", length = 500)
    private String stTypeInvestment;

    @Column(name = "STD_IDT_IOARR_INFRASTRUCTURE")
    private Double stIdtIoarrInfrastructure;

    @Column(name = "STD_IDT_IOARR_EQUIPMENT")
    private Double stIdtIoarrEquipment;

    @Column(name = "STD_IDT_IOARR_INF_EQU")
    private Double stIdtIoarrInfrastructureEquipment;

    @Column(name = "STD_IDT_PI_INFRASTRUCTURE")
    private Double stIdtPiInfrastructure;

    @Column(name = "STD_IDT_PI_EQUIPMENT")
    private Double stIdtPiEquipment;

    @Column(name = "STD_IDT_PI_INF_EQU")
    private Double stIdtPiInfrastructureEquipment;


    @Column(name = "STD_IBI_IOARR_INFRASTRUCTURE")
    private Double stIbiIoarrInfrastructure;

    @Column(name = "STD_IBI_IOARR_EQUIPMENT")
    private Double stIbiIoarrEquipment;

    @Column(name = "STD_IBI_IOARR_INF_EQU")
    private Double stIbiIoarrInfrastructureEquipment;

    @Column(name = "STD_IBI_PI_INFRASTRUCTURE")
    private Double stIbiPiInfrastructure;

    @Column(name = "STD_IBI_PI_EQUIPMENT")
    private Double stIbiPiEquipment;

    @Column(name = "STD_IBI_PI_INF_EQU")
    private Double stIbiPiInfrastructureEquipment;


    @Column(name = "STD_IFE_IOARR_INFRASTRUCTURE")
    private Double stIfeIoarrInfrastructure;

    @Column(name = "STD_IFE_IOARR_EQUIPMENT")
    private Double stIfeIoarrEquipment;

    @Column(name = "STD_IFE_IOARR_INF_EQU")
    private Double stIfeIoarrInfrastructureEquipment;

    @Column(name = "STD_IFE_PI_INFRASTRUCTURE")
    private Double stIfePiInfrastructure;

    @Column(name = "STD_IFE_PI_EQUIPMENT")
    private Double stIfePiEquipment;

    @Column(name = "STD_IFE_PI_INF_EQU")
    private Double stIfePiInfrastructureEquipment;

    @Column(name = "STD_EPI_IOARR")
    private Double stEpiIoarr;

    @Column(name = "STD_EPI_PI_FTS")
    private Double stEpiPiFts;

    @Column(name = "STD_EPI_PI_FTE")
    private Double stEpiPiFte;

    @Column(name = "STD_EPI_PI_FMC")
    private Double stEpiPiFmc;

    @Column(name = "STD_EPI_PI_ENP")
    private Double stEpiPiEnp;
}