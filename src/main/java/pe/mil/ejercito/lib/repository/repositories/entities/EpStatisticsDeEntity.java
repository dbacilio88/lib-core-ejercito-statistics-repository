package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDeEntity
 * <p>
 * EpStatisticsDeEntity class.
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
@Table(name = "EP_STATISTICS_DDEE", indexes = {
    @Index(name = "EP_STATISTICS_DDEE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDeEntity extends EpStatisticsDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DDEE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DDEE_SEQ", sequenceName = "EP_STATISTICS_DDEE_SEQ", allocationSize = 1)
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

    @Column(name = "STD_ACAS_MACHINERY")
    private Double stdAcasMachinery;

    @Column(name = "STD_ACAS_HEALTH")
    private Double stdAcasHealth;

    @Column(name = "STD_ACAS_SOCIAL")
    private Double stdAcasSocial;

    @Column(name = "STD_PCIAPNP_SOCIAL_CONFLICT")
    private Double stdAcasSocialConflict;

    @Column(name = "STD_PCIAPNP_ILLEGAL_MINING")
    private Double stdPciAPnpIlegalMining;

    @Column(name = "STD_PCIAPNP_TDI")
    private Double stdPciAPnpTdi;

    @Column(name = "STD_PCIAPNP_TIM")
    private Double stdPciAPnpTim;

    @Column(name = "STD_PCIAPNP_FOREST_FIRE")
    private Double stdPciAPnpForestFire;

    @Column(name = "STD_AR_ECONOMIC_SOCIAL")
    private Double stdArEconomicSocial;

    @Column(name = "STD_AR_SCIENCE_TECHNOLOGY")
    private Double stdArScienceTechnology;

    @Column(name = "STD_AR_ARCHAEOLOGICAL_HISTORICAL")
    private Double stdArArchaeologicalHistorical;

    @Column(name = "STD_AR_ANTARCTIC_AMAZON_AFFAIRS")
    private Double stdArAntarcticAmazonAffairs;

    @Column(name = "STD_AR_ENVIRONMENTAL_PROTECTION")
    private Double stdArEnvironmentalProtection;

    @Column(name = "STD_HITO_AMOUNT")
    private Double stdHitoAmount;

    @Column(name = "STD_HITO_ORDERS")
    private Double stdHitoOrders;

    @Column(name = "STD_HITO_RECOGNITION")
    private Double stdHitoRecognition;

    @Column(name = "STD_HITO_MAINTENANCE")
    private Double stdHitoMaintenance;

}