package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * BrigadeStatusDto
 * <p>
 * BrigadeStatusDto class.
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
public class BrigadeStatusDto implements Serializable {

    private static final long serialVersionUID = 6513459404533226833L;

    private Long id;

    private String uuId;

    @Size(max = 11)
    @NotNull
    @NotBlank
    private String code;

    @Size(max = 11)
    @NotNull
    @NotBlank
    private String name;

    @Size(max = 20)
    @NotNull
    @NotBlank
    private String description;
}