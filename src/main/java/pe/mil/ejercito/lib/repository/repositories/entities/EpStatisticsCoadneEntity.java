package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsCoadneEntity
 * <p>
 * EpStatisticsCoadneEntity class.
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
@Table(name = "EP_STATISTICS_COADNE", indexes = {
    @Index(name = "EP_STATISTICS_COADNE_UN1", columnList = "STC_UUID", unique = true)
})
public class EpStatisticsCoadneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_COADNE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_COADNE_SEQ", sequenceName = "EP_STATISTICS_COADNE_SEQ", allocationSize = 1)
    @Column(name = "STC_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STC_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STC_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stcDocument;

    @Column(name = "STC_AST_OO")
    private Double stcAstOo;

    @Column(name = "STC_AST_TS")
    private Double stcAstTs;

    @Column(name = "STC_AST_EC")
    private Double stcAstEc;

    @Column(name = "STC_ASA_OO")
    private Double stcAsaOo;

    @Column(name = "STC_ASA_TS")
    private Double stcAsaTs;

    @Column(name = "STC_ASA_EC")
    private Double stcAsaEc;

    @Column(name = "STC_DHAREA")
    private Double stcDhArea;

    @Column(name = "STC_DH_OO")
    private Double stcDhOo;

    @Column(name = "STC_DH_TCOS")
    private Double stcDhTcos;

    @Column(name = "STC_DH_AREA_TO_DEMINE")
    private Double stcDhAreaToDemine;

    @Size(max = 200)
    @Column(name = "STC_AC_DPTO", length = 200)
    private String stcAcDpto;

    @Size(max = 200)
    @Column(name = "STC_AC_PROV", length = 200)
    private String stcAcProv;

    @Size(max = 200)
    @Column(name = "STC_AC_DIST", length = 200)
    private String stcAcDist;

    @Size(max = 200)
    @Column(name = "STC_AC_TYPE_ACTIVITY", length = 200)
    private String stcAcTypeActivity;

    @Size(max = 200)
    @Column(name = "STC_AC_DATE_INIT", length = 200)
    private String stcAcDateInit;

    @Size(max = 200)
    @Column(name = "STC_AC_DATE_END", length = 200)
    private String stcAcDateEnd;

    @Column(name = "STC_AC_BENEFITED_POPULATION")
    private Double stcAcBenefitedPopulation;

    @Column(name = "STC_AC_METERING")
    private Double stcAcMetering;

    @Size(max = 200)
    @Column(name = "STC_AC_TYPE_OF_CIVIC_ACTION", length = 200)
    private String stcAcTypeOfCivicAction;

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