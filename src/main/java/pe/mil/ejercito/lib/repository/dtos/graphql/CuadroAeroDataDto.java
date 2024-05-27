package pe.mil.ejercito.lib.repository.dtos.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

/**
 * CuadroAeroDataDto
 * <p>
 * CuadroAeroDataDto interface.
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
public class CuadroAeroDataDto implements Serializable {
    private static final long serialVersionUID = -3601364804845927012L;
    private Long id;
    private Double total;
    private String type;
    private String lugar;
    private String division;
    private String typeHelicopter;
    private String matricula;
    private String hrsMaintenance;
    private String maintenance;
    private Double hrsAssigned;
    private Double hrsFlown;
}