package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * DocumentStatusDto
 * <p>
 * DocumentStatusDto class.
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
public class DocumentStatusDto implements Serializable {

    private static final long serialVersionUID = 1765330787035819960L;
    private Long id;
    private String uuId;
    @NotNull
    @NotBlank
    @Size(max = 15)
    private String code;
    @NotNull
    @NotBlank
    @Size(max = 20)
    private String name;
    @NotNull
    @NotBlank
    @Size(max = 20)
    private String style;
    @NotNull
    @NotBlank
    @Size(max = 20)
    private String icon;
    @Size(max = 40)
    private String description;
}