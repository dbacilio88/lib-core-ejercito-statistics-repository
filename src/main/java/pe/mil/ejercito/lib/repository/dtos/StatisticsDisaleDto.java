package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsDisaleDto
 * <p>
 * StatisticsDisaleDto class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsDisaleDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String activityDirection;
    private String activityRecommendation;
    private String psLevelsCare;
    private String asmAttentions;
    private Double activityCommitteesMindef;
    private Double activityCommitteesMinsa;
    private Double activityCommitteesInstitutional;
    private Double activityOptionsMindef;
    private Double activityOptionsMinsa;
    private Double activityOptionsInstitutional;
    private Double activityDirectivesProject;
    private Double activityDirectivesUpdate;
    private Double activityDirectivesApproved;
    private Double rrHhLevel1Doctor;
    private Double rrHhLevel1Other;
    private Double rrHhLevel1Tcos;
    private Double rrHhLevel2Doctor;
    private Double rrHhLevel2Other;
    private Double rrHhLevel2Tcos;
    private Double rrHhLevel3Doctor;
    private Double rrHhLevel3Other;
    private Double rrHhLevel3Tcos;
    private Double coUnHealthy;
    private Double coImprove;
    private Double coHealthy;
    private Double asmLevel1;
    private Double asmLevel2;
    private Double asmLevel3;
    private Double psEp;
    private Double psInformation;
    private Double psSendInformation;

    private Long id;
    private String uuId;
    private String document;
    private String place;
    private String division;
    private String dependency;
    private String otherState;
    private String nro;
    private double total;
    private String typeSheet;
    private String nameSheet;
    private String obs;
    private Instant created;
    private Instant updated;
}