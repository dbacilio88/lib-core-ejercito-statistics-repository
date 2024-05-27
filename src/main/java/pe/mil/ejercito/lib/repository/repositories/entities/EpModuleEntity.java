package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;
import pe.mil.ejercito.lib.repository.repositories.converts.BooleanToNumericConverter;

import javax.persistence.*;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * EpModuleEntity
 * <p>
 * EpModuleEntity class.
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
@Entity(name = "EpModuleEntity")
@Table(name = "EP_MODULE", indexes = {
        @Index(name = "EP_MODULE_UN1", columnList = "MO_UUID", unique = true),
        @Index(name = "EP_MODULE_UN2", columnList = "MO_NAME", unique = true)
})
public class EpModuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_MODULE_SEQ")
    @SequenceGenerator(name = "EP_MODULE_SEQ", sequenceName = "EP_MODULE_SEQ", allocationSize = 1)
    @Column(name = "MO_ID", nullable = false)
    private Long id;

    @Column(name = "MO_UUID", nullable = false, length = 36)
    private String uuId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MO_MODULE_STATUS", nullable = false)
    @ToString.Exclude
    private EpModuleStatusEntity moModuleStatus;

    @Column(name = "MO_NAME", nullable = false, length = 50)
    private String moName;

    @Convert(converter = BooleanToNumericConverter.class)
    @Column(name = "MO_IS_COMPONENT", nullable = false, precision = 1)
    private Boolean moIsComponent;

    @Convert(converter = BooleanToNumericConverter.class)
    @Column(name = "MO_IS_MENU", nullable = false, precision = 1)
    private Boolean moIsMenu;

    @Column(name = "MO_ICON", length = 50)
    private String moIcon;

    @Column(name = "MO_PATH", length = 50)
    private String moPath;

    @Column(name = "MO_ORDER", nullable = false, precision = 1)
    private Integer moOrder;

    @Column(name = "MO_GROUP", nullable = false, precision = 1)
    private Integer moGroup;

    @Column(name = "MO_CREATE_DATE", nullable = false)
    private Instant moCreateDate;

    @Column(name = "MO_UPDATE_DATE")
    private Instant moUpdateDate;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "posModule")
    private Set<EpProfileOptionModuleEntity> epProfileOptionModules = new LinkedHashSet<>();

}