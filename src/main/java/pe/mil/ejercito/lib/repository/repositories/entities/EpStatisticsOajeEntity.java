package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsOajeEntity
 * <p>
 * EpStatisticsOajeEntity class.
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
@Table(name = "EP_STATISTICS_OAJE", indexes = {@Index(name = "EP_STATISTICS_OAJE_UN1", columnList = "STO_UUID", unique = true)})
public class EpStatisticsOajeEntity extends EpStatisticsBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_OAJE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_OAJE_SEQ", sequenceName = "EP_STATISTICS_OAJE_SEQ", allocationSize = 1)
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
    @Column(name = "STO_SITUATION", length = 500)
    private String stoSituation;

    @Size(max = 500)
    @Column(name = "STO_SITUATION_PERSONAL", length = 500)
    private String stoSituationPersonal;

    @Column(name = "STO_ENE_A")
    private Double stoEneA;
    @Column(name = "STO_ENE_B")
    private Double stoEneB;
    @Column(name = "STO_ENE_C")
    private Double stoEneC;
    @Column(name = "STO_ENE_D")
    private Double stoEneD;
    @Column(name = "STO_ENE_E")
    private Double stoEneE;

    @Column(name = "STO_FEB_A")
    private Double stoFebA;
    @Column(name = "STO_FEB_B")
    private Double stoFebB;
    @Column(name = "STO_FEB_C")
    private Double stoFebC;
    @Column(name = "STO_FEB_D")
    private Double stoFebD;
    @Column(name = "STO_FEB_E")
    private Double stoFebE;

    @Column(name = "STO_MAR_A")
    private Double stoMarA;
    @Column(name = "STO_MAR_B")
    private Double stoMarB;
    @Column(name = "STO_MAR_C")
    private Double stoMarC;
    @Column(name = "STO_MAR_D")
    private Double stoMarD;
    @Column(name = "STO_MAR_E")
    private Double stoMarE;

    @Column(name = "STO_ABR_A")
    private Double stoAbrA;
    @Column(name = "STO_ABR_B")
    private Double stoAbrB;
    @Column(name = "STO_ABR_C")
    private Double stoAbrC;
    @Column(name = "STO_ABR_D")
    private Double stoAbrD;
    @Column(name = "STO_ABR_E")
    private Double stoAbrE;

    @Column(name = "STO_MAY_A")
    private Double stoMayA;
    @Column(name = "STO_MAY_B")
    private Double stoMayB;
    @Column(name = "STO_MAY_C")
    private Double stoMayC;
    @Column(name = "STO_MAY_D")
    private Double stoMayD;
    @Column(name = "STO_MAY_E")
    private Double stoMayE;

    @Column(name = "STO_JUN_A")
    private Double stoJunA;
    @Column(name = "STO_JUN_B")
    private Double stoJunB;
    @Column(name = "STO_JUN_C")
    private Double stoJunC;
    @Column(name = "STO_JUN_D")
    private Double stoJunD;
    @Column(name = "STO_JUN_E")
    private Double stoJunE;

    @Column(name = "STO_JUL_A")
    private Double stoJulA;
    @Column(name = "STO_JUL_B")
    private Double stoJulB;
    @Column(name = "STO_JUL_C")
    private Double stoJulC;
    @Column(name = "STO_JUL_D")
    private Double stoJulD;
    @Column(name = "STO_JUL_E")
    private Double stoJulE;

    @Column(name = "STO_AGO_A")
    private Double stoAgoA;
    @Column(name = "STO_AGO_B")
    private Double stoAgoB;
    @Column(name = "STO_AGO_C")
    private Double stoAgoC;
    @Column(name = "STO_AGO_D")
    private Double stoAgoD;
    @Column(name = "STO_AGO_E")
    private Double stoAgoE;

    @Column(name = "STO_SET_A")
    private Double stoSetA;
    @Column(name = "STO_SET_B")
    private Double stoSetB;
    @Column(name = "STO_SET_C")
    private Double stoSetC;
    @Column(name = "STO_SET_D")
    private Double stoSetD;
    @Column(name = "STO_SET_E")
    private Double stoSetE;

    @Column(name = "STO_OCT_A")
    private Double stoOctA;
    @Column(name = "STO_OCT_B")
    private Double stoOctB;
    @Column(name = "STO_OCT_C")
    private Double stoOctC;
    @Column(name = "STO_OCT_D")
    private Double stoOctD;
    @Column(name = "STO_OCT_E")
    private Double stoOctE;

    @Column(name = "STO_NOV_A")
    private Double stoNovA;
    @Column(name = "STO_NOV_B")
    private Double stoNovB;
    @Column(name = "STO_NOV_C")
    private Double stoNovC;
    @Column(name = "STO_NOV_D")
    private Double stoNovD;
    @Column(name = "STO_NOV_E")
    private Double stoNovE;

    @Column(name = "STO_DIC_A")
    private Double stoDicA;
    @Column(name = "STO_DIC_B")
    private Double stoDicB;
    @Column(name = "STO_DIC_C")
    private Double stoDicC;
    @Column(name = "STO_DIC_D")
    private Double stoDicD;
    @Column(name = "STO_DIC_E")
    private Double stoDicE;
}