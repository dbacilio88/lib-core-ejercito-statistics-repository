package pe.mil.ejercito.lib.repository.repositories.views;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * EpMantoAeroGraphView
 * <p>
 * EpMantoAeroGraphView class.
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
@Table(name = "EP_MANTO_AERO_GRAPH_VIEW")
public class EpMantoAeroGraphView {

    @Id
    @Column(name = "MAGV_ID")
    private Long id;

    @Size(max = 100)
    @Column(name = "MAGV_TYPE_MANTO", length = 100)
    private String magvTypeManto;

    @Size(max = 100)
    @Column(name = "MAGV_MAINTENANCE", length = 100)
    private String magvMaintenance;

    @Size(max = 120)
    @Column(name = "MAGV_TYPE_HELICOPTER", length = 120)
    private String magvTypeHelicopter;

    @Column(name = "MAGV_ENE")
    private Double magvEne;

    @Column(name = "MAGV_FEB")
    private Double magvFeb;

    @Column(name = "MAGV_MAR")
    private Double magvMar;

    @Column(name = "MAGV_ABR")
    private Double magvAbr;

    @Column(name = "MAGV_MAY")
    private Double magvMay;

    @Column(name = "MAGV_JUN")
    private Double magvJun;

    @Column(name = "MAGV_JUL")
    private Double magvJul;

    @Column(name = "MAGV_AGO")
    private Double magvAgo;

    @Column(name = "MAGV_SET")
    private Double magvSet;

    @Column(name = "MAGV_OCT")
    private Double magvOct;

    @Column(name = "MAGV_NOV")
    private Double magvNov;

    @Column(name = "MAGV_DIC")
    private Double magvDic;

}