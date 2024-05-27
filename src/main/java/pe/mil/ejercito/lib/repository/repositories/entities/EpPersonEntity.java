package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpPersonEntity
 * <p>
 * EpPersonEntity class.
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
@Entity(name = "EpPersonEntity")
@Table(name = "EP_PERSON", indexes = {
        @Index(name = "EP_PERSON_UN1", columnList = "PE_UUID", unique = true)
})
public class EpPersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_PERSON_SEQ")
    @SequenceGenerator(name = "EP_PERSON_SEQ", sequenceName = "EP_PERSON_SEQ", allocationSize = 1)
    @Column(name = "PE_ID", nullable = false)
    private Long id;

    @Column(name = "PE_UUID", nullable = false, length = 36)
    private String uuId;

    @Column(name = "PE_NAME", nullable = false, length = 50)
    private String peName;

    @Column(name = "PE_LASTNAME", nullable = false, length = 50)
    private String peLastname;

    @Column(name = "PE_DOB", nullable = false)
    private Instant peDob;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "usPerson")
    private Set<EpUserEntity> epUsers = new LinkedHashSet<>();

}