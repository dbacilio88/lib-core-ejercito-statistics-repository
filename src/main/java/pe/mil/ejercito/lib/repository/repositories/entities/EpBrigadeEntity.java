package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpBrigadeEntity
 * <p>
 * EpBrigadeEntity class.
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
@Table(name = "EP_BRIGADE", indexes = {
    @Index(name = "EP_BRIGADE_UN1", columnList = "BR_UUID", unique = true),
    @Index(name = "EP_BRIGADE_UN2", columnList = "BR_CODE", unique = true),
    @Index(name = "EP_BRIGADE_UN3", columnList = "BR_NAME", unique = true)
})
public class EpBrigadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_BRIGADE_SEQ")
    @SequenceGenerator(name = "EP_BRIGADE_SEQ", sequenceName = "EP_BRIGADE_SEQ", allocationSize = 1)
    @Column(name = "BR_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "BR_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BR_DIVISION_ID", nullable = false)
    private EpDivisionEntity brDivision;

    @Size(max = 4)
    @NotNull
    @Column(name = "BR_CODE", nullable = false, length = 4)
    private String brCode;

    @Size(max = 60)
    @NotNull
    @Column(name = "BR_NAME", nullable = false, length = 60)
    private String brName;

    @Size(max = 120)
    @Column(name = "BR_DESCRIPTION", length = 120)
    private String brDescription;

    @NotNull
    @Column(name = "BR_CREATED_DATE", nullable = false)
    private Instant brCreatedDate;

    @Column(name = "BR_UPDATED_DATE")
    private Instant brUpdatedDate;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "unBrigade")
    private Set<EpUnitEntity> epUnits = new LinkedHashSet<>();

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BR_STATUS", nullable = false)
    @ToString.Exclude
    private EpBrigadeStatusEntity brStatus;

}