package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsDisaleDto extends StatisticsBaseDto implements Serializable {

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
}