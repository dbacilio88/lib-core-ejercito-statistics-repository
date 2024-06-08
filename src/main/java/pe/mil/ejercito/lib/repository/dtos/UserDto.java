package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import pe.mil.ejercito.lib.utils.componets.annotations.Uuid;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;

/**
 * UserDto
 * <p>
 * UserDto class.
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
public class UserDto implements Serializable {
    private static final long serialVersionUID = -4353098545665927883L;

    private Long id;

    private String uuId;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String person;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String profile;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String status;

    @Size(max = 36, min = 36)
    @NotNull
    @NotBlank
    @Uuid
    private String unit;

    @Size(max = 50)
    @NotNull
    @NotBlank
    private String username;

    @Size(max = 50)
    @NotNull
    @NotBlank
    private String password;

    private String ldap;

    @Size(max = 10)
    @NotNull
    @NotBlank
    private String category;

    @Size(max = 9)
    @NotNull
    @NotBlank
    private String phone;

    @Size(max = 50)
    @NotNull
    @NotBlank
    private String email;


    private Instant createDate;
    private Instant updateDate;
}