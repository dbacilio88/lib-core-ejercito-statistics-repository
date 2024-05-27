package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpBrigadeEntity;

import java.util.Optional;

/**
 * IEpBrigadeRepository
 * <p>
 * IEpBrigadeRepository interface.
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
public interface IEpBrigadeRepository extends JpaRepository<EpBrigadeEntity, Long>, JpaSpecificationExecutor<EpBrigadeEntity> {

    @Query(value = "SELECT b FROM EpBrigadeEntity b " +
        "LEFT JOIN FETCH b.brStatus " +
        "LEFT JOIN FETCH b.brDivision " +
        "WHERE b.uuId = :uuId")
    Optional<EpBrigadeEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT b FROM EpBrigadeEntity b " +
        "LEFT JOIN FETCH b.brStatus " +
        "LEFT JOIN FETCH b.brDivision " +
        "WHERE b.id = :id")
    Optional<EpBrigadeEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT b FROM EpBrigadeEntity b " +
        "INNER JOIN FETCH b.brDivision d " +
        "INNER JOIN FETCH b.brStatus s " +
        "WHERE (:division is null or d.uuId = :division) " +
        "AND (:status is null or s.bsCode = :status)",
        countQuery = "SELECT COUNT(b) FROM EpBrigadeEntity b " +
            "LEFT JOIN b.brDivision d " +
            "LEFT JOIN b.brStatus s " +
            "WHERE (:division is null or d.uuId = :division) " +
            "AND (:status is null or s.bsCode = :status)")
    Page<EpBrigadeEntity> findAll(@Param("division") String division, @Param("status") String status, Pageable pageable);
}