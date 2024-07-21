package pe.mil.ejercito.lib.repository.repositories.views;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
/**
 * EpDieGraphView
 * <p>
 * EpDieGraphView class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Immutable
@Table(name = "EP_DIE_GRAPH_VIEW")
public class EpDieGraphView {

    @Id
    @Column(name = "AM_ID")
    private Long id;

    @Size(max = 120)
    @Column(name = "AM_ACTION", length = 120)
    private String action;

    @Size(max = 200)
    @Column(name = "AM_TYPES_MEASUREMENTS", length = 200)
    private String amTypesMeasurements;

    @Size(max = 200)
    @Column(name = "AM_TYPE", length = 200)
    private String amType;

    @Size(max = 120)
    @Column(name = "AM_ACTIVITY", length = 120)
    private String amActivity;

    @Column(name = "AM_UNIT")
    private Long amUnit;

    @Column(name = "AM_ENE")
    private Double amEne;

    @Column(name = "AM_FEB")
    private Double amFeb;

    @Column(name = "AM_MAR")
    private Double amMar;

    @Column(name = "AM_ABR")
    private Double amAbr;

    @Column(name = "AM_MAY")
    private Double amMay;

    @Column(name = "AM_JUN")
    private Double amJun;

    @Column(name = "AM_JUL")
    private Double amJul;

    @Column(name = "AM_AGO")
    private Double amAgo;

    @Column(name = "AM_SET")
    private Double amSet;

    @Column(name = "AM_OCT")
    private Double amOct;

    @Column(name = "AM_NOV")
    private Double amNov;

    @Column(name = "AM_DIC")
    private Double amDic;

}