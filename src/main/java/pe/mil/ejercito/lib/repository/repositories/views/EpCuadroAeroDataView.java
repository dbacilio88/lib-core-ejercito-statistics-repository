package pe.mil.ejercito.lib.repository.repositories.views;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * EpCuadroAeroDataView
 * <p>
 * EpCuadroAeroDataView class.
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
@Table(name = "EP_CUADRO_AERO_DATA_VIEW")
public class EpCuadroAeroDataView {
    @Id
    @Column(name = "MHV_ID")
    private Long id;

    @Column(name = "MHV_TOTAL")
    private Double total;

    @Size(max = 100)
    @Column(name = "MHV_TYPE", length = 100)
    private String mhvType;

    @Size(max = 120)
    @Column(name = "MHV_LUGAR", length = 120)
    private String mhvLugar;

    @Size(max = 100)
    @Column(name = "MHV_DIVISION", length = 120)
    private String mhvDivision;

    @Size(max = 120)
    @Column(name = "MHV_TYPE_HELICOPTER", length = 120)
    private String mhvTypeHelicopter;

    @Size(max = 120)
    @Column(name = "MHV_MATRICULA", length = 120)
    private String mhvMatricula;

    @Size(max = 120)
    @Column(name = "MHV_HRS_MAINTENANCE", length = 120)
    private String mhvHrsMaintenance;

    @Column(name = "mhv_hrs_assigned")
    private Double mhvHrsAssigned;

    @Column(name = "mhv_hrs_flown")
    private Double mhvHrsFlown;

    @Size(max = 120)
    @Column(name = "MHV_MAINTENANCE", length = 120)
    private String mhvMaintenance;

}