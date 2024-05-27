package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpTypeRegisterEntity
 * <p>
 * EpTypeRegisterEntity class.
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
@Table(name = "EP_TYPE_REGISTER", indexes = {
        @Index(name = "EP_TYPE_REGISTER_UN1", columnList = "TR_UUID", unique = true)
})
public class EpTypeRegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_TYPE_REGISTER_SEQ")
    @SequenceGenerator(name = "EP_TYPE_REGISTER_SEQ", sequenceName = "EP_TYPE_REGISTER_SEQ", allocationSize = 1)
    @Column(name = "TR_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "TR_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TR_UNIT", nullable = false)
    private EpUnitEntity trUnit;

    @Size(max = 60)
    @NotNull
    @Column(name = "TR_NAME", nullable = false, length = 60)
    private String name;

    @Size(max = 120)
    @Column(name = "TR_DESCRIPTION", length = 120)
    private String trDescription;

    @NotNull
    @Column(name = "TR_CREATED_DATE", nullable = false)
    private Instant trCreatedDate;

    @Column(name = "TR_UPDATED_DATE")
    private Instant trUpdatedDate;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "drTypeRegister")
    private Set<EpDocumentRegisterEntity> epDocumentRegisters = new LinkedHashSet<>();

    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "ucTypeRegister")
    private Set<EpUnitConfigurationEntity> epUnitConfigurations = new LinkedHashSet<>();

}