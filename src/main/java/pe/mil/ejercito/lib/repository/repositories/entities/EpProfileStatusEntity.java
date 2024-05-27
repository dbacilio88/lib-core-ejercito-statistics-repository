package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpProfileStatusEntity
 * <p>
 * EpProfileStatusEntity class.
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
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "EpProfileStatusEntity")
@Table(name = "EP_PROFILE_STATUS", indexes = {
        @Index(name = "EP_PROFILE_STATUS_UN1", columnList = "PS_UUID", unique = true),
        @Index(name = "EP_PROFILE_STATUS_UN2", columnList = "ps_code", unique = true),
        @Index(name = "EP_PROFILE_STATUS_UN3", columnList = "ps_name", unique = true)
})
public class EpProfileStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_PROFILE_STATUS_SEQ")
    @SequenceGenerator(name = "EP_PROFILE_STATUS_SEQ", allocationSize = 1)
    @Column(name = "PS_ID", nullable = false)
    private Long id;

    @Column(name = "PS_UUID", nullable = false, length = 36)
    private String uuId;

    @Column(name = "PS_CODE", nullable = false, length = 30)
    private String psCode;

    @Column(name = "PS_NAME", nullable = false, length = 50)
    private String psName;

    @Column(name = "PS_DESCRIPTION", length = 100)
    private String psDescription;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "prProfileStatus")
    private Set<EpProfileEntity> epProfiles = new LinkedHashSet<>();

}