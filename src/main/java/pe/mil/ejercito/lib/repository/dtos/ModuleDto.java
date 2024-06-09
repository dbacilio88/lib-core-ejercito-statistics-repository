package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import pe.mil.ejercito.lib.utils.componets.annotations.Uuid;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * ModuleDto
 * <p>
 * ModuleDto class.
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
@JsonPropertyOrder({
    "id",
    "uuId",
    "status",
    "title",
    "level",
    "child",
    "icon",
    "type",
    "path",
    "father",
    "createDate",
    "updateDate",
    "children",
})
public class ModuleDto implements Serializable {
    private static final long serialVersionUID = -477612838432715446L;

    private Long id;

    private String uuId;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String status;

    @Size(max = 50)
    @NotNull
    @NotBlank
    private String title;

    @NotNull
    private Integer level;

    @NotNull
    private Boolean child;

    @Size(max = 50)
    private String icon;

    @NotNull
    @NotBlank
    @Size(max = 5)
    private String type;

    @Size(max = 50)
    private String path;

    @NotNull
    private Long father;

    private List<ModuleDto> children;

    private Instant createDate;

    private Instant updateDate;
}