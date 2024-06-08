package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDieEntity;

import java.util.Optional;

/**
 * IEpStatisticsDieRepository
 * <p>
 * IEpStatisticsDieRepository interface.
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
public interface IEpStatisticsDieRepository extends JpaRepository<EpStatisticsDieEntity, Long> {

    @Query(value = "SELECT ae FROM EpStatisticsDieEntity ae " +
        "LEFT JOIN FETCH ae.stdDocument " +
        "WHERE ae.uuId = :uuId")
    Optional<EpStatisticsDieEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT ae FROM EpStatisticsDieEntity ae " +
        "LEFT JOIN FETCH ae.stdDocument " +
        "WHERE ae.id = :id")
    Optional<EpStatisticsDieEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT ae FROM EpStatisticsDieEntity ae " +
        "INNER JOIN FETCH ae.stdDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(ae) FROM EpStatisticsDieEntity ae " +
            "LEFT JOIN ae.stdDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsDieEntity> findAll(@Param("document") String document, Pageable pageable);
}