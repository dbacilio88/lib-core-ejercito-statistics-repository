package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpTypeRegisterEntity;

import java.util.Optional;

/**
 * IEpTypeRegisterRepository
 * <p>
 * IEpTypeRegisterRepository class.
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
public interface IEpTypeRegisterRepository extends JpaRepository<EpTypeRegisterEntity, Long> {

    @Query(value = "SELECT b FROM EpTypeRegisterEntity b  " +
        "LEFT JOIN FETCH b.trUnit " +
        "WHERE b.uuId = :uuId")
    Optional<EpTypeRegisterEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT b FROM EpTypeRegisterEntity b  " +
        "LEFT JOIN FETCH b.trUnit " +
        "WHERE b.id = :id")
    Optional<EpTypeRegisterEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT b FROM EpTypeRegisterEntity b " +
        "INNER JOIN FETCH b.trUnit u " +
        "WHERE (:unit is null or u.uuId = :unit) ",
        countQuery = "SELECT COUNT(b) FROM EpTypeRegisterEntity b " +
            "LEFT JOIN b.trUnit u " +
            "WHERE (:unit is null or u.uuId = :unit) ")
    Page<EpTypeRegisterEntity> findAll(@Param("unit") String unit, Pageable pageable);

}