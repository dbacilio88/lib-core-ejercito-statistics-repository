package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileEntity;

import java.util.Optional;

/**
 * IEpProfileRepository
 * <p>
 * IEpProfileRepository interface.
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
public interface IEpProfileRepository extends JpaRepository<EpProfileEntity, Long> {

    @Query(value = "SELECT p FROM EpProfileEntity p " +
        "INNER JOIN FETCH p.prProfileStatus " +
        "WHERE p.uuId = :uuId")
    Optional<EpProfileEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT p FROM EpProfileEntity p " +
        "INNER JOIN FETCH p.prProfileStatus " +
        "WHERE p.id = :id")
    Optional<EpProfileEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT p FROM EpProfileEntity p " +
        "INNER JOIN FETCH p.prProfileStatus s " +
        "WHERE (:status is null or s.psCode = :status) ",
        countQuery = "SELECT COUNT(p) FROM EpProfileEntity p " +
            "LEFT JOIN p.prProfileStatus s " +
            "WHERE (:status is null or s.psCode = :status) ")
    Page<EpProfileEntity> findAll(@Param("status") String status, Pageable pageable);
}