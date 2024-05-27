package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import pe.mil.ejercito.lib.utils.componets.annotations.Uuid;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * UnitConfigurationDto
 * <p>
 * UnitConfigurationDto class.
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
public class UnitConfigurationDto implements Serializable {
    private static final long serialVersionUID = -4408874116403100514L;

    private Long id;

    private String uuId;

    private String file;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String unit;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String typeRegister;

    @NotNull
    @Size(max = 15)
    @NotBlank
    private String template;
}