package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileOptionModuleEntity;

import java.util.Optional;

/**
 * IEpProfileOptionModuleRepository
 * <p>
 * IEpProfileOptionModuleRepository interface.
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
public interface IEpProfileOptionModuleRepository extends JpaRepository<EpProfileOptionModuleEntity, Long> {

    @Query(value = "SELECT mos FROM EpProfileOptionModuleEntity mos " +
        "LEFT JOIN FETCH mos.posModule " +
        "LEFT JOIN FETCH mos.posProfile " +
        "WHERE mos.uuId = :uuId")
    Optional<EpProfileOptionModuleEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT mos FROM EpProfileOptionModuleEntity mos " +
        "LEFT JOIN FETCH mos.posModule " +
        "LEFT JOIN FETCH mos.posProfile " +
        "WHERE mos.id = :id")
    Optional<EpProfileOptionModuleEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT mos FROM EpProfileOptionModuleEntity mos " +
        "INNER JOIN FETCH mos.posModule m " +
        "INNER JOIN FETCH mos.posProfile pr " +
        "WHERE (:module is null or m.uuId = :module) " +
        "AND (:profile is null or pr.uuId = :profile) ",

        countQuery = "SELECT COUNT(mos) FROM EpProfileOptionModuleEntity mos " +
            "LEFT JOIN mos.posModule m " +
            "LEFT JOIN mos.posProfile pr " +
            "WHERE (:module is null or m.uuId = :module) " +
            "AND (:profile is null or pr.uuId = :profile)")
    Page<EpProfileOptionModuleEntity> findAll(@Param("module") String module, @Param("profile") String profile, Pageable pageable);


}