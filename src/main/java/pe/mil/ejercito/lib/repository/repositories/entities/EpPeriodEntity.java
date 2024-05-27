package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpPeriodEntity
 * <p>
 * EpPeriodEntity class.
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
@Table(name = "EP_PERIOD", indexes = {
    @Index(name = "EP_PERIOD_UN1", columnList = "PE_UUID", unique = true),
    @Index(name = "EP_PERIOD_UN2", columnList = "PE_NAME", unique = true)
})
public class EpPeriodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_PERIOD_SEQ")
    @SequenceGenerator(name = "EP_PERIOD_SEQ", sequenceName = "EP_PERIOD_SEQ", allocationSize = 1)
    @Column(name = "PE_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "PE_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PE_STATUS")
    private EpPeriodStatusEntity peStatus;

    @Size(max = 15)
    @NotNull
    @Column(name = "PE_NAME", nullable = false, length = 15)
    private String peName;

    @Size(max = 20)
    @Column(name = "PE_DESCRIPTION", length = 20)
    private String peDescription;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "drPeriod")
    private Set<EpDocumentRegisterEntity> epDocumentRegisters = new LinkedHashSet<>();

}