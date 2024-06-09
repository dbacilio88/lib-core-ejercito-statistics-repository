package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

/**
 * EpUserEntity
 * <p>
 * EpUserEntity class.
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
@Entity(name = "EpUserEntity")
@Table(name = "EP_USER", indexes = {
    @Index(name = "EP_USER_UN1", columnList = "US_UUID", unique = true),
    @Index(name = "EP_USER_UN2", columnList = "US_USERNAME", unique = true)
})
public class EpUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_USER_SEQ")
    @SequenceGenerator(name = "EP_USER_SEQ", sequenceName = "EP_USER_SEQ", allocationSize = 1)
    @Column(name = "US_ID", nullable = false)
    private Long id;

    @Column(name = "US_UUID", nullable = false, length = 36)
    private String uuId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "US_PERSON_ID", nullable = false)
    @ToString.Exclude
    private EpPersonEntity usPerson;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "US_PROFILE_ID", nullable = false)
    @ToString.Exclude
    private EpProfileEntity usProfile;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "US_USER_STATUS", nullable = false)
    @ToString.Exclude
    private EpUserStatusEntity usUserStatus;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "US_UNIT_ID", nullable = false)
    @ToString.Exclude
    private EpUnitEntity usUnit;

    @Column(name = "US_USERNAME", nullable = false, length = 50)
    private String usUsername;

    @Column(name = "US_PASSWORD", nullable = false, length = 60)
    private String usPassword;

    @Column(name = "US_LDAP", length = 100)
    private String usLap;

    @Column(name = "US_CATEGORY", nullable = false, length = 10)
    private String usCategory;

    @Column(name = "US_PHONE", nullable = false, length = 9)
    private String usPhone;

    @Column(name = "US_EMAIL", nullable = false, length = 50)
    private String usEmail;

    @Column(name = "US_BRIGADE", nullable = false, length = 36)
    private String usBrigade;

    @Column(name = "US_DIVISION", nullable = false, length = 36)
    private String usDivision;

    @Column(name = "US_CREATE_DATE", nullable = false)
    private Instant usCreateDate;

    @Column(name = "US_UPDATE_DATE")
    private Instant usUpdateDate;

}