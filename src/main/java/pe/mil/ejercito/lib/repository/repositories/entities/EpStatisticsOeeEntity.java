package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
@Table(name = "EP_STATISTICS_OOE", indexes = {
    @Index(name = "EP_STATISTICS_OOE_UN1", columnList = "STO_UUID", unique = true)
})
public class EpStatisticsOeeEntity extends EpStatisticsDateEntity {

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
}