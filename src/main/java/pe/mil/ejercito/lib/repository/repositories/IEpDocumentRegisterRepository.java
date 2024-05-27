package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDocumentRegisterEntity;

import java.util.Optional;

/**
 * IEpDocumentRegisterRepository
 * <p>
 * IEpDocumentRegisterRepository interface.
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
public interface IEpDocumentRegisterRepository extends JpaRepository<EpDocumentRegisterEntity, Long> {

    @Query(value = "SELECT dr FROM EpDocumentRegisterEntity dr " +
        "LEFT JOIN FETCH dr.drUnit " +
        "LEFT JOIN FETCH dr.drTypeRegister " +
        "LEFT JOIN FETCH dr.drPeriod " +
        "LEFT JOIN FETCH dr.drStatus " +
        "WHERE dr.uuId = :uuId")
    Optional<EpDocumentRegisterEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT dr FROM EpDocumentRegisterEntity dr " +
        "INNER JOIN FETCH dr.drUnit " +
        "LEFT JOIN FETCH dr.drTypeRegister " +
        "LEFT JOIN FETCH dr.drPeriod " +
        "LEFT JOIN FETCH dr.drStatus " +
        "WHERE dr.id = :id")
    Optional<EpDocumentRegisterEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT dr FROM EpDocumentRegisterEntity dr " +
        "INNER JOIN FETCH dr.drUnit u " +
        "INNER JOIN FETCH dr.drTypeRegister tr " +
        "INNER JOIN FETCH dr.drPeriod p " +
        "INNER JOIN FETCH dr.drStatus s " +
        "WHERE (:unit is null or u.uuId = :unit) " +
        "AND (:period is null or p.uuId = :period) " +
        "AND (:status is null or s.dsCode = :status) " +
        "AND (:typeRegister is null or tr.uuId = :typeRegister)",
        countQuery = "SELECT COUNT(dr) FROM EpDocumentRegisterEntity dr " +
            "LEFT JOIN dr.drUnit u " +
            "LEFT JOIN dr.drPeriod p " +
            "LEFT JOIN dr.drTypeRegister tr " +
            "LEFT JOIN dr.drStatus s " +
            "WHERE (:unit is null or u.uuId = :unit) " +
            "AND (:period is null or p.uuId = :period) " +
            "AND (:status is null or s.dsCode = :status) " +
            "AND (:typeRegister is null or tr.uuId = :typeRegister)")
    Page<EpDocumentRegisterEntity> findAll(
        @Param("unit") String unit,
        @Param("period") String period,
        @Param("typeRegister") String typeRegister,
        @Param("status") String status,
        Pageable pageable);
}