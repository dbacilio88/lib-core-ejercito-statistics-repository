package pe.mil.ejercito.lib.repository.repositories.views;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * EpDocumentationDivisionView
 * <p>
 * EpDocumentationDivisionView class.
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
@Table(name = "EP_DOCUMENTATION_DIVISION_VIEW")
public class EpDocumentationDivisionView {

    @Id
    @Column(name = "DDV_ID")
    private Long id;

    @Size(max = 60)
    @Column(name = "DDV_DIVISION_NAME", length = 60)
    private String ddvDivisionName;

    @Size(max = 60)
    @Column(name = "DDV_BRIGADE_NAME", length = 60)
    private String ddvBrigadeName;

    @Size(max = 60)
    @Column(name = "DDV_UNIT_NAME", length = 60)
    private String ddvUnitName;

    @Column(name = "DDV_PERIODS")
    private Long ddvPeriods;

}