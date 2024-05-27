package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDiciteceEntity
 * <p>
 * EpStatisticsDiciteceEntity class.
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
@Table(name = "EP_STATISTICS_DICITECE", indexes = {
    @Index(name = "EP_STATISTICS_DICITECE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDiciteceEntity extends EpStatisticsBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DICITECE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DICITECE_SEQ", sequenceName = "EP_STATISTICS_DICITECE_SEQ", allocationSize = 1)
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

    @Size(max = 500)
    @Column(name = "STD_INVESTIGATION_AREA", length = 500)
    private String stDiciteceInvestigationArea;

    @Size(max = 1000)
    @Column(name = "STD_PROJECT_NAME", length = 1000)
    private String stDiciteceProjectName;

    @Size(max = 1000)
    @Column(name = "STD_WORKSHOP_NAME", length = 1000)
    private String stDiciteceWorkshopName;

    @Column(name = "STD_PERSONAL_OO")
    private Double stDicitecePersonalOO;

    @Column(name = "STD_PERSONAL_TCOS")
    private Double stDicitecePersonalTcos;

    @Column(name = "STD_PERSONAL_CIVIL")
    private Double stDicitecePersonalCivil;

    @Column(name = "STD_PERSONAL_EXTERNAL")
    private Double stDicitecePersonalExternal;

    @Column(name = "STD_PRE_PERSONAL_TOTAL")
    private Double stDicitecePrePersonalTotal;

    @Column(name = "STD_PIS_PERCENTAGE_ENE")
    private Double stDicitecePisPercentageEne;

    @Column(name = "STD_PIS_FINANCIAL_ENE")
    private Double stDicitecePisFinancialEne;

    @Column(name = "STD_PIS_PERCENTAGE_FEB")
    private Double stDicitecePisPercentageFeb;

    @Column(name = "STD_PIS_FINANCIAL_FEB")
    private Double stDicitecePisFinancialFeb;

    @Column(name = "STD_PIS_PERCENTAGE_TOTAL")
    private Double stDicitecePisPercentageTotal;

    @Column(name = "STD_PIS_FINANCIAL_TOTAL")
    private Double stDicitecePisFinancialTotal;


    @Column(name = "STD_WORKSHOP_DEPENDENCY_ASSISTANCE")
    private Double stDiciteceWorkshopDependencyAssistance;

    @Column(name = "STD_AGREEMENTS_TYPE_TRAINING_OO")
    private Double stDiciteceAgreementsTypeTrainingOO;

    @Column(name = "STD_AGREEMENTS_TYPE_TRAINING_TCOS")
    private Double stDiciteceAgreementsTypeTrainingTcos;

    @Column(name = "STD_AGREEMENTS_TYPE_TRAINING_CIVIL")
    private Double stDiciteceAgreementsTypeTrainingCivil;

    @Column(name = "STD_AGREEMENTS_TYPE_ID_OO")
    private Double stDiciteceAgreementsTypeIdOO;

    @Column(name = "STD_AGREEMENTS_TYPE_ID_TCOS")
    private Double stDiciteceAgreementsTypeIdTcos;

    @Column(name = "STD_AGREEMENTS_TYPE_ID_CIVIL")
    private Double stDiciteceAgreementsTypeIdCivil;

    @Column(name = "STD_AGREEMENTS_PERSONAL_TRAINING_OO")
    private Double stDiciteceAgreementsPersonalTrainingOO;

    @Column(name = "STD_AGREEMENTS_PERSONAL_TRAINING_TCOS")
    private Double stDiciteceAgreementsPersonalTrainingTcos;

    @Column(name = "STD_AGREEMENTS_PERSONAL_TRAINING_CIVIL")
    private Double stDiciteceAgreementsPersonalTrainingCivil;

    @Column(name = "STD_AGREEMENTS_PERSONAL_ID_OO")
    private Double stDiciteceAgreementsPersonalIdOO;

    @Column(name = "STD_AGREEMENTS_PERSONAL_ID_TCOS")
    private Double stDiciteceAgreementsPersonalIdTcos;

    @Column(name = "STD_AGREEMENTS_PERSONAL_ID_CIVIL")
    private Double stDiciteceAgreementsPersonalIdCivil;
}