package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpUnitEntity
 * <p>
 * EpUnitEntity class.
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
@Table(name = "EP_UNIT", indexes = {
    @Index(name = "EP_UNIT_UN1", columnList = "UN_UUID", unique = true),
    @Index(name = "EP_UNIT_UN2", columnList = "UN_CODE", unique = true),
    @Index(name = "EP_UNIT_UN3", columnList = "UN_NAME", unique = true)
})
public class EpUnitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_UNIT_SEQ")
    @SequenceGenerator(name = "EP_UNIT_SEQ", sequenceName = "EP_UNIT_SEQ", allocationSize = 1)
    @Column(name = "UN_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "UN_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UN_BRIGADE_ID", nullable = false)
    private EpBrigadeEntity unBrigade;

    @Size(max = 6)
    @NotNull
    @Column(name = "UN_CODE", nullable = false, length = 6)
    private String unCode;

    @Size(max = 60)
    @NotNull
    @Column(name = "UN_NAME", nullable = false, length = 60)
    private String unName;

    @Size(max = 120)
    @Column(name = "UN_DESCRIPTION", length = 120)
    private String unDescription;

    @NotNull
    @Column(name = "UN_CREATED_DATE", nullable = false)
    private Instant unCreatedDate;

    @Column(name = "UN_UPDATED_DATE")
    private Instant unUpdatedDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UN_STATUS", nullable = false)
    @ToString.Exclude
    private EpUnitStatusEntity unStatus;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "trUnit")
    private Set<EpTypeRegisterEntity> epDivisions = new LinkedHashSet<>();

    @Size(max = 80)
    @Column(name = "UN_UBIGEO", length = 80)
    private String unUbigeo;

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "drUnit")
    private Set<EpDocumentRegisterEntity> epDocumentRegisters = new LinkedHashSet<>();

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "ucUnit")
    private Set<EpUnitConfigurationEntity> epUnitConfigurations = new LinkedHashSet<>();

}