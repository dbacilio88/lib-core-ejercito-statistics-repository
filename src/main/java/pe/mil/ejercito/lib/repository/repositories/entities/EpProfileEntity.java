package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpProfileEntity
 * <p>
 * EpProfileEntity class.
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
@Entity(name = "EpProfileEntity")
@Table(name = "EP_PROFILE", indexes = {
        @Index(name = "EP_PROFILE_UN1", columnList = "PR_UUID", unique = true),
        @Index(name = "EP_PROFILE_UN2", columnList = "PR_CODE", unique = true)
})
public class EpProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_PROFILE_SEQ")
    @SequenceGenerator(name = "EP_PROFILE_SEQ", sequenceName = "EP_PROFILE_SEQ", allocationSize = 1)
    @Column(name = "PR_ID", nullable = false)
    private Long id;

    @Column(name = "PR_UUID", nullable = false, length = 36)
    private String uuId;

    @Column(name = "PR_CODE", nullable = false, length = 50)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PR_PROFILE_STATUS", nullable = false)
    @ToString.Exclude
    private EpProfileStatusEntity prProfileStatus;

    @Column(name = "PR_NAME", nullable = false, length = 50)
    private String prName;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "posProfile")
    private Set<EpProfileOptionModuleEntity> epProfileOptionModules = new LinkedHashSet<>();

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "usProfile")
    private Set<EpUserEntity> epUsers = new LinkedHashSet<>();

}