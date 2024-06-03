package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpDocumentRegisterEntity
 * <p>
 * EpDocumentRegisterEntity class.
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
@Table(name = "EP_DOCUMENT_REGISTER", indexes = {
    @Index(name = "EP_DOCUMENT_REGISTER_UN1", columnList = "DR_UUID", unique = true)
})
public class EpDocumentRegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_DOCUMENT_REGISTER_SEQ")
    @SequenceGenerator(name = "EP_DOCUMENT_REGISTER_SEQ", sequenceName = "EP_DOCUMENT_REGISTER_SEQ", allocationSize = 1)
    @Column(name = "DR_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "DR_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DR_UNIT", nullable = false)
    private EpUnitEntity drUnit;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DR_TYPE_REGISTER", nullable = false)
    private EpTypeRegisterEntity drTypeRegister;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DR_PERIOD", nullable = false)
    private EpPeriodEntity drPeriod;
    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DR_STATUS", nullable = false)
    private EpDocumentStatusEntity drStatus;

    @Size(max = 200)
    @NotNull
    @Column(name = "DR_NAME", nullable = false, length = 200)
    private String drName;

    @NotNull
    @Column(name = "DR_CREATED_DATE", nullable = false)
    private Instant drCreatedDate;

    @Column(name = "DR_UPDATED_DATE")
    private Instant drUpdatedDate;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "staDocument", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<EpStatisticsAeEntity> epStatisticsAes = new LinkedHashSet<>();

    //TODO implementar entidades relacionadas a esta.


}