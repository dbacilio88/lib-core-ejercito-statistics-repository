package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpPeriodEntity;

import java.util.Optional;

/**
 * IEpPeriodRepository
 * <p>
 * IEpPeriodRepository interface.
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
public interface IEpPeriodRepository extends JpaRepository<EpPeriodEntity, Long> {

    @Query(value = "SELECT d FROM EpPeriodEntity d " +
        "LEFT JOIN FETCH d.peStatus " +
        "WHERE d.uuId = :uuId")
    Optional<EpPeriodEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT d FROM EpPeriodEntity d " +
        "LEFT JOIN FETCH d.peStatus " +
        "WHERE d.id = :id")
    Optional<EpPeriodEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT d  FROM EpPeriodEntity d " +
        "INNER JOIN FETCH d.peStatus s " +
        "WHERE (:status is null or s.psCode = :status) ",
        countQuery = "SELECT COUNT(d) FROM EpPeriodEntity d " +
            "LEFT JOIN d.peStatus s " +
            "WHERE (:status is null or s.psCode = :status) ")
    Page<EpPeriodEntity> findAll(@Param("status") String status, Pageable pageable);
}