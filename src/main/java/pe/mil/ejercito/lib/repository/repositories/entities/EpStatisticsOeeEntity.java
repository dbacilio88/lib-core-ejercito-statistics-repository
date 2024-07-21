package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsOeeEntity
 * <p>
 * EpStatisticsOeeEntity class.
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
@Table(name = "EP_STATISTICS_OOE", indexes = {
    @Index(name = "EP_STATISTICS_OOE_UN1", columnList = "STO_UUID", unique = true)
})
public class EpStatisticsOeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_OOE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_OOE_SEQ", sequenceName = "EP_STATISTICS_OOE_SEQ", allocationSize = 1)
    @Column(name = "STO_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STO_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STO_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stDocument;

    @Size(max = 500)
    @Column(name = "STO_PERSONAL", length = 500)
    private String stPersonal;

    @Column(name = "STO_ENE_PERSON")
    private Double stEnePersonal;

    @Column(name = "STO_FEB_PERSON")
    private Double stFebPersonal;

    @Column(name = "STO_MAR_PERSON")
    private Double stMarPersonal;

    @Column(name = "STO_ABR_PERSON")
    private Double stAbrPersonal;

    @Column(name = "STO_MAY_PERSON")
    private Double stMayPersonal;

    @Column(name = "STO_JUN_PERSON")
    private Double stJunPersonal;

    @Column(name = "STO_JUL_PERSON")
    private Double stJulPersonal;

    @Column(name = "STO_AGO_PERSON")
    private Double stAgoPersonal;

    @Column(name = "STO_SET_PERSON")
    private Double stSetPersonal;

    @Column(name = "STO_OCT_PERSON")
    private Double stOctPersonal;

    @Column(name = "STO_NOV_PERSON")
    private Double stNovPersonal;

    @Column(name = "STO_DIC_PERSON")
    private Double stDicPersonal;

    @Column(name = "STO_TOTAL_PERSON")
    private Double stTotalPerson;

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