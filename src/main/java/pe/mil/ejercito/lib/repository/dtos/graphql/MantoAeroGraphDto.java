package pe.mil.ejercito.lib.repository.dtos.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

/**
 * MantoAeroGraphDto
 * <p>
 * MantoAeroGraphDto interface.
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
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MantoAeroGraphDto implements Serializable {
    private static final long serialVersionUID = -1893796805910324897L;
    private Long id;
    private String typeManto;
    private String maintenance;
    private String typeHelicopter;
    private double ene;
    private double feb;
    private double mar;
    private double abr;
    private double may;
    private double jun;
    private double jul;
    private double ago;
    private double set;
    private double oct;
    private double nov;
    private double dic;
}