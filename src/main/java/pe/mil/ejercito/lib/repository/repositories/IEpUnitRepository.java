package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUnitEntity;

import java.util.Optional;

/**
 * IEpUnitRepository
 * <p>
 * IEpUnitRepository interface.
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
public interface IEpUnitRepository extends JpaRepository<EpUnitEntity, Long> {

    @Query(value = "SELECT u FROM EpUnitEntity u " +
        "LEFT JOIN FETCH u.unStatus " +
        "LEFT JOIN FETCH u.unBrigade  " +
        "WHERE u.uuId = :uuId")
    Optional<EpUnitEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT u FROM EpUnitEntity u " +
        "LEFT JOIN FETCH u.unStatus " +
        "LEFT JOIN FETCH u.unBrigade  " +
        "WHERE u.id = :id")
    Optional<EpUnitEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT u FROM EpUnitEntity u " +
        "INNER JOIN FETCH u.unBrigade b " +
        "INNER JOIN FETCH u.unStatus s " +
        "WHERE (:brigade is null or b.uuId = :brigade) " +
        "AND (:status is null or s.usCode = :status)",
        countQuery = "SELECT COUNT(u) FROM EpUnitEntity u " +
            "LEFT JOIN u.unBrigade b " +
            "LEFT JOIN u.unStatus s " +
            "WHERE (:brigade is null or b.uuId = :brigade) " +
            "AND (:status is null or s.usCode = :status)")
    Page<EpUnitEntity> findAll(@Param("brigade") String brigade, @Param("status") String status, Pageable pageable);

}