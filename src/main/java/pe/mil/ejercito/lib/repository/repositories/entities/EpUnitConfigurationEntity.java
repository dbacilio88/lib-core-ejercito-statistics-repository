package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * EpUnitConfigurationEntity
 * <p>
 * EpUnitConfigurationEntity class.
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
@Table(name = "EP_UNIT_CONFIGURATION", indexes = {
    @Index(name = "EP_UNIT_CONFIGURATION_UN1", columnList = "UC_UUID", unique = true)
})
public class EpUnitConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_UNIT_CONFIGURATION_SEQ")
    @SequenceGenerator(name = "EP_UNIT_CONFIGURATION_SEQ", sequenceName = "EP_UNIT_CONFIGURATION_SEQ", allocationSize = 1)
    @Column(name = "UC_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "UC_UUID", nullable = false, length = 36)
    private String uuId;

    @NotNull
    @Column(name = "UC_FILE", nullable = false, length = 200)
    private String file;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UC_UNIT", nullable = false)
    private EpUnitEntity ucUnit;

    @Size(max = 15)
    @NotNull
    @Column(name = "UC_CONFIGURATION_VALUE", nullable = false, length = 15, columnDefinition = "jsonb")
    private String ucConfigurationValue;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UC_TYPE_REGISTER", nullable = false)
    private EpTypeRegisterEntity ucTypeRegister;

}