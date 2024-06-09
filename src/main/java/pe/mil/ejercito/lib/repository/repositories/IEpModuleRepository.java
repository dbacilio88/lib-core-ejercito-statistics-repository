package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpModuleEntity;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * IEpModuleRepository
 * <p>
 * IEpModuleRepository interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Transactional
@Repository
public interface IEpModuleRepository extends JpaRepository<EpModuleEntity, Long> {

    @Query(value = "SELECT m FROM EpModuleEntity m " +
        "LEFT JOIN FETCH m.moModuleStatus " +
        "WHERE m.uuId = :uuId")
    Optional<EpModuleEntity> findByUuId(String uuId);

    @Query(value = "SELECT m FROM EpModuleEntity m " +
        "LEFT JOIN FETCH m.moModuleStatus " +
        "WHERE m.id = :id")
    Optional<EpModuleEntity> findEntityById(Long id);


    @Query(value = "SELECT m FROM EpModuleEntity m " +
        "INNER JOIN FETCH m.moModuleStatus s " +
        "WHERE (:status is null or s.msCode = :status) ",
        countQuery = "SELECT COUNT(m) FROM EpModuleEntity m " +
            "LEFT JOIN m.moModuleStatus s " +
            "WHERE (:status is null or s.msCode = :status) ")
    Page<EpModuleEntity> findAll(final @Param("status") String status, Pageable pageable);


    @Query(value = "SELECT m FROM EpModuleEntity m LEFT JOIN FETCH m.moModuleStatus")
    List<EpModuleEntity> findAll();

    @Query(value = "SELECT m FROM EpModuleEntity m LEFT JOIN FETCH m.moModuleStatus lef LEFT JOIN FETCH m.epProfileOptionModules pom WHERE m.moFather in (:ids) AND pom.posProfile.uuId = :profile")
    List<EpModuleEntity> findAll(final @Param("ids") Set<Long> ids, final @Param("profile") String profile);

}