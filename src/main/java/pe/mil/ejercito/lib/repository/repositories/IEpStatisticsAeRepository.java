package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsAeEntity;

import java.util.Optional;

/**
 * IEpStatisticsAeRepository
 * <p>
 * IEpStatisticsAeRepository interface.
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
public interface IEpStatisticsAeRepository extends JpaRepository<EpStatisticsAeEntity, Long> {

    @Query(value = "SELECT ae FROM EpStatisticsAeEntity ae " +
        "LEFT JOIN FETCH ae.staDocument " +
        "WHERE ae.uuId = :uuId")
    Optional<EpStatisticsAeEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT ae FROM EpStatisticsAeEntity ae " +
        "LEFT JOIN FETCH ae.staDocument " +
        "WHERE ae.id = :id")
    Optional<EpStatisticsAeEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT ae FROM EpStatisticsAeEntity ae " +
        "INNER JOIN FETCH ae.staDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(ae) FROM EpStatisticsAeEntity ae " +
            "LEFT JOIN ae.staDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsAeEntity> findAll(@Param("document") String document, Pageable pageable);
}