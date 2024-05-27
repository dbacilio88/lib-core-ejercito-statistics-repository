package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDilogeEntity;

import java.util.Optional;

/**
 * IEpStatisticsDilogeRepository
 * <p>
 * IEpStatisticsDilogeRepository interface.
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
public interface IEpStatisticsDilogeRepository extends JpaRepository<EpStatisticsDilogeEntity, Long> {

    @Query(value = "SELECT ae FROM EpStatisticsDilogeEntity ae " +
        "LEFT JOIN FETCH ae.stDocument " +
        "WHERE ae.uuId = :uuId")
    Optional<EpStatisticsDilogeEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT ae FROM EpStatisticsDilogeEntity ae " +
        "LEFT JOIN FETCH ae.stDocument " +
        "WHERE ae.id = :id")
    Optional<EpStatisticsDilogeEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT ae FROM EpStatisticsDilogeEntity ae " +
        "INNER JOIN FETCH ae.stDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(ae) FROM EpStatisticsDilogeEntity ae " +
            "LEFT JOIN ae.stDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsDilogeEntity> findAll(@Param("document") String document, Pageable pageable);
}