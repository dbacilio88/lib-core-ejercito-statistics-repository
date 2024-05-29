package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpStatisticsDisaleEntity
 * <p>
 * EpStatisticsDisaleEntity class.
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
@Table(name = "EP_STATISTICS_DISALE", indexes = {
    @Index(name = "EP_STATISTICS_DISALE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDisaleEntity extends EpStatisticsBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DISALE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DISALE_SEQ", sequenceName = "EP_STATISTICS_DISALE_SEQ", allocationSize = 1)
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
    @Column(name = "STD_ACTIVITY_DIRECTION", length = 500)
    private String stActivityDirection;

    @Size(max = 500)
    @Column(name = "STD_ACTIVITY_RECOMMENDATION", length = 500)
    private String stActivityRecommendation;

    @Size(max = 500)
    @Column(name = "STD_PS_LEVELS_CARE", length = 500)
    private String stPsLevelsCare;

    @Size(max = 500)
    @Column(name = "STD_ASM_ATTENTIONS", length = 500)
    private String stAsmAttentions;

    @Column(name = "STD_ACTIVITY_COMMITTEES_MINDEF")
    private Double stActivityCommitteesMindef;

    @Column(name = "STD_ACTIVITY_COMMITTEES_MINSA")
    private Double stActivityCommitteesMinsa;

    @Column(name = "STD_ACTIVITY_COMMITTEES_INSTITUTIONAL")
    private Double stActivityCommitteesInstitutional;

    @Column(name = "STD_ACTIVITY_OPTIONS_MINDEF")
    private Double stActivityOptionsMindef;

    @Column(name = "STD_ACTIVITY_OPTIONS_MINSA")
    private Double stActivityOptionsMinsa;

    @Column(name = "STD_ACTIVITY_OPTIONS_INSTITUTIONAL")
    private Double stActivityOptionsInstitutional;

    @Column(name = "STD_ACTIVITY_DIRECTIVES_PROJECT")
    private Double stActivityDirectivesProject;

    @Column(name = "STD_ACTIVITY_DIRECTIVES_UPDATE")
    private Double stActivityDirectivesUpdate;

    @Column(name = "STD_ACTIVITY_DIRECTIVES_APPROVED")
    private Double stActivityDirectivesApproved;

    @Column(name = "STD_RRHH_LEVEL1_DOCTOR")
    private Double stRrHhLevel1Doctor;

    @Column(name = "STD_RRHH_LEVEL1_OTHER")
    private Double stRrHhLevel1Other;

    @Column(name = "STD_RRHH_LEVEL1_TCOS")
    private Double stRrHhLevel1Tcos;

    @Column(name = "STD_RRHH_LEVEL2_DOCTOR")
    private Double stRrHhLevel2Doctor;

    @Column(name = "STD_RRHH_LEVEL2_OTHER")
    private Double stRrHhLevel2Other;

    @Column(name = "STD_RRHH_LEVEL2_TCOS")
    private Double stRrHhLevel2Tcos;

    @Column(name = "STD_RRHH_LEVEL3_DOCTOR")
    private Double stRrHhLevel3Doctor;

    @Column(name = "STD_RRHH_LEVEL3_OTHER")
    private Double stRrHhLevel3Other;

    @Column(name = "STD_RRHH_LEVEL3_TCOS")
    private Double stRrHhLevel3Tcos;

    @Column(name = "STD_CO_UNHEALTHY")
    private Double stCoUnHealthy;

    @Column(name = "STD_CO_IMPROVE")
    private Double stCoImprove;

    @Column(name = "STD_CO_HEALTHY")
    private Double stCoHealthy;

    @Column(name = "STD_ASM_LEVEL1")
    private Double stAsmLevel1;

    @Column(name = "STD_ASM_LEVEL2")
    private Double stAsmLevel2;

    @Column(name = "STD_ASM_LEVEL3")
    private Double stAsmLevel3;

    @Column(name = "STD_PS_EP")
    private Double stPsEp;

    @Column(name = "STD_PS_INFORMATION")
    private Double stPsInformation;

    @Column(name = "STD_PS_SEND_INFORMATION")
    private Double stPsSendInformation;
}