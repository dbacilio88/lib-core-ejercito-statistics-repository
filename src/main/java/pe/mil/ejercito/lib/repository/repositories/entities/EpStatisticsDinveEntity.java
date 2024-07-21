package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

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
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EP_STATISTICS_DINVE", indexes = {
    @Index(name = "EP_STATISTICS_DINVE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDinveEntity {

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