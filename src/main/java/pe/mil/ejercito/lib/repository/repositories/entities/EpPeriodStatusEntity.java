package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * EpPeriodStatusEntity
 * <p>
 * EpPeriodStatusEntity class.
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
@Table(name = "EP_PERIOD_STATUS", indexes = {
    @Index(name = "EP_PERIOD_STATUS_UN1", columnList = "PS_UUID", unique = true),
    @Index(name = "EP_PERIOD_STATUS_UN2", columnList = "PS_CODE", unique = true),
    @Index(name = "EP_PERIOD_STATUS_UN3", columnList = "PS_NAME", unique = true)
})
public class EpPeriodStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_PERIOD_STATUS_SEQ")
    @SequenceGenerator(name = "EP_PERIOD_STATUS_SEQ", sequenceName = "EP_PERIOD_STATUS_SEQ", allocationSize = 1)
    @Column(name = "PS_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "PS_UUID", nullable = false, length = 36)
    private String uuId;

    @Size(max = 15)
    @NotNull
    @Column(name = "PS_CODE", nullable = false, length = 15)
    private String psCode;

    @Size(max = 16)
    @NotNull
    @Column(name = "PS_NAME", nullable = false, length = 16)
    private String psName;

    @Size(max = 20)
    @Column(name = "PS_DESCRIPTION", length = 20)
    private String psDescription;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "peStatus")
    private Set<EpPeriodEntity> epPeriods = new LinkedHashSet<>();

}