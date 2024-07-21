package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

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
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EP_STATISTICS_DILOGE", indexes = {
    @Index(name = "EP_STATISTICS_DILOGE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDilogeEntity {

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
    private EpDocumentRegisterEntity stdDocument;


    @Size(max = 200)
    @Column(name = "STD_PMBSO", length = 200)
    private String stdPmbso;

    @Size(max = 200)
    @Column(name = "STD_REQUIREMENTS", length = 200)
    private String stdRequirements;

    @Column(name = "STD_COLOGE")
    private Double stdCologe;

    @Column(name = "STD_COGAE")
    private Double stdCogae;

    @Column(name = "STD_COSALE")
    private Double stdCosale;

    @Column(name = "STD_COEDE")
    private Double stdCoede;

    @Column(name = "STD_COPERE")
    private Double stdCopere;

    @Column(name = "STD_COTE")
    private Double stdCote;

    @Column(name = "STD_AE")
    private Double stdAe;

    @Column(name = "STD_IDE")
    private Double stdIde;

    @Column(name = "STD_IIDE")
    private Double stdIIDe;

    @Column(name = "STD_IIIDE")
    private Double stdIIIDe;

    @Column(name = "STD_IVDE")
    private Double stdIVDe;

    @Column(name = "STD_VDE")
    private Double stdVde;

    @Size(max = 200)
    @Column(name = "STD_SUMMARY", length = 200)
    private String stdSummary;

    @Column(name = "STD_CURRENT")
    private Double stdCurrent;

    @Column(name = "STD_NEW")
    private Double stdNew;

    @Column(name = "STD_UPDATE")
    private Double stdUpdate;

    @Column(name = "STD_PROGRESS")
    private Double stdProgress;

    @Size(max = 200)
    @Column(name = "STD_PRODUCTS", length = 200)
    private String stdProducts;
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


    @Column(name = "ST_ENE")
    private Double stEne;

    @Column(name = "ST_FEB")
    private Double stFeb;

    @Column(name = "ST_MAR")
    private Double stMar;

    @Column(name = "ST_ABR")
    private Double stAbr;

    @Column(name = "ST_MAY")
    private Double stMay;

    @Column(name = "ST_JUN")
    private Double stJun;

    @Column(name = "ST_JUL")
    private Double stJul;

    @Column(name = "ST_AGO")
    private Double stAgo;

    @Column(name = "ST_SET")
    private Double stSet;

    @Column(name = "ST_OCT")
    private Double stOct;

    @Column(name = "ST_NOV")
    private Double stNov;

    @Column(name = "ST_DIC")
    private Double stDic;
}