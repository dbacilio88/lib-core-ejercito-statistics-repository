package pe.mil.ejercito.lib.repository.repositories.views;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * EpHhVvAeroGraphView
 * <p>
 * EpHhVvAeroGraphView class.
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
@Table(name = "EP_HH_VV_AERO_GRAPH_VIEW")
public class EpHhVvAeroGraphView {

    @Id
    @Column(name = "MAGV_ID")
    private Long id;

    @Size(max = 100)
    @Column(name = "MAGV_TYPE_MANTO", length = 100)
    private String magvTypeManto;

    @Size(max = 120)
    @Column(name = "MAGV_DIVISION", length = 120)
    private String magvDivision;

    @Column(name = "MAGV_COUNT")
    private Double magvCount;

    @Column(name = "MAGV_UNIT")
    private Long magvUnit;

}