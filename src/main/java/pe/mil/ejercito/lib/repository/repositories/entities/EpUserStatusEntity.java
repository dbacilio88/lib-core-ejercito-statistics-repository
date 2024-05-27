package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpUserStatusEntity
 * <p>
 * EpUserStatusEntity class.
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
@Entity(name = "EpUserStatusEntity")
@Table(name = "EP_USER_STATUS", indexes = {
        @Index(name = "EP_USER_STATUS_UN1", columnList = "US_UUID", unique = true),
        @Index(name = "EP_USER_STATUS_UN2", columnList = "US_CODE", unique = true),
        @Index(name = "EP_USER_STATUS_UN3", columnList = "US_NAME", unique = true)
})
public class EpUserStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_USER_STATUS_SEQ")
    @SequenceGenerator(name = "EP_USER_STATUS_SEQ", sequenceName = "EP_USER_STATUS_SEQ", allocationSize = 1)
    @Column(name = "US_ID", nullable = false)
    private Long id;

    @Column(name = "US_UUID", nullable = false, length = 36)
    private String uuId;

    @Column(name = "US_CODE", nullable = false, length = 30)
    private String usCode;

    @Column(name = "US_NAME", nullable = false, length = 50)
    private String usName;

    @Column(name = "US_DESCRIPTION", length = 100)
    private String usDescription;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "usUserStatus")
    private Set<EpUserEntity> epUsers = new LinkedHashSet<>();

}