package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

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
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EP_STATISTICS_DICITECE", indexes = {
    @Index(name = "EP_STATISTICS_DICITECE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDiciteceEntity {

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
    private EpDocumentRegisterEntity stdDocument;

    @Size(max = 500)
    @Column(name = "STD_INVESTIGATION_AREA", length = 500)
    private String stdInvestigationArea;

    @Size(max = 1000)
    @Column(name = "STD_PROJECT_NAME", length = 1000)
    private String stdProjectName;

    @Size(max = 1000)
    @Column(name = "STD_WORKSHOP_NAME", length = 1000)
    private String stdWorkshopName;

    @Column(name = "STD_PERSONAL_OO")
    private Double stdPersonalOO;

    @Column(name = "STD_PERSONAL_TCOS")
    private Double stdPersonalTcos;

    @Column(name = "STD_PERSONAL_CIVIL")
    private Double stdPersonalCivil;

    @Column(name = "STD_PERSONAL_EXTERNAL")
    private Double stdPersonalExternal;

    @Column(name = "STD_PRE_PERSONAL_TOTAL")
    private Double stdPrePersonalTotal;

    @Column(name = "STD_PIS_PERCENTAGE_ENE")
    private Double stdPisPercentageEne;

    @Column(name = "STD_PIS_FINANCIAL_ENE")
    private Double stdPisFinancialEne;

    @Column(name = "STD_PIS_PERCENTAGE_FEB")
    private Double stdPisPercentageFeb;

    @Column(name = "STD_PIS_FINANCIAL_FEB")
    private Double stdPisFinancialFeb;

    @Column(name = "STD_PIS_PERCENTAGE_TOTAL")
    private Double stdPisPercentageTotal;

    @Column(name = "STD_PIS_FINANCIAL_TOTAL")
    private Double stdPisFinancialTotal;


    @Column(name = "STD_WORKSHOP_DEPENDENCY_ASSISTANCE")
    private Double stdWorkshopDependencyAssistance;

    @Column(name = "STD_AGREEMENTS_TYPE_TRAINING_OO")
    private Double stdAgreementsTypeTrainingOO;

    @Column(name = "STD_AGREEMENTS_TYPE_TRAINING_TCOS")
    private Double stdAgreementsTypeTrainingTcos;

    @Column(name = "STD_AGREEMENTS_TYPE_TRAINING_CIVIL")
    private Double stdAgreementsTypeTrainingCivil;

    @Column(name = "STD_AGREEMENTS_TYPE_ID_OO")
    private Double stdAgreementsTypeIdOO;

    @Column(name = "STD_AGREEMENTS_TYPE_ID_TCOS")
    private Double stdAgreementsTypeIdTcos;

    @Column(name = "STD_AGREEMENTS_TYPE_ID_CIVIL")
    private Double stdAgreementsTypeIdCivil;

    @Column(name = "STD_AGREEMENTS_PERSONAL_TRAINING_OO")
    private Double stdAgreementsPersonalTrainingOO;

    @Column(name = "STD_AGREEMENTS_PERSONAL_TRAINING_TCOS")
    private Double stdAgreementsPersonalTrainingTcos;

    @Column(name = "STD_AGREEMENTS_PERSONAL_TRAINING_CIVIL")
    private Double stdAgreementsPersonalTrainingCivil;

    @Column(name = "STD_AGREEMENTS_PERSONAL_ID_OO")
    private Double stdAgreementsPersonalIdOO;

    @Column(name = "STD_AGREEMENTS_PERSONAL_ID_TCOS")
    private Double stdAgreementsPersonalIdTcos;

    @Column(name = "STD_AGREEMENTS_PERSONAL_ID_CIVIL")
    private Double stdAgreementsPersonalIdCivil;

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