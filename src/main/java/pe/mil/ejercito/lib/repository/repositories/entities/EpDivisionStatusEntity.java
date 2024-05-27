package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpDivisionStatusEntity
 * <p>
 * EpDivisionStatusEntity class.
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
@Table(name = "EP_DIVISION_STATUS", indexes = {
        @Index(name = "EP_DIVISION_STATUS_UN1", columnList = "DS_UUID", unique = true),
        @Index(name = "EP_DIVISION_STATUS_UN2", columnList = "DS_CODE", unique = true),
        @Index(name = "EP_DIVISION_STATUS_UN3", columnList = "DS_NAME", unique = true)
})
public class EpDivisionStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_DIVISION_STATUS_SEQ")
    @SequenceGenerator(name = "EP_DIVISION_STATUS_SEQ", sequenceName = "EP_DIVISION_STATUS_SEQ", allocationSize = 1)
    @Column(name = "DS_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "DS_UUID", nullable = false, length = 36)
    private String uuId;

    @Size(max = 11)
    @NotNull
    @Column(name = "DS_CODE", nullable = false, length = 9)
    private String dsCode;

    @Size(max = 11)
    @NotNull
    @Column(name = "DS_NAME", nullable = false, length = 9)
    private String dsName;

    @Size(max = 20)
    @Column(name = "DS_DESCRIPTION", length = 20)
    private String dsDescription;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "diStatus")
    private Set<EpDivisionEntity> epDivisions = new LinkedHashSet<>();
}