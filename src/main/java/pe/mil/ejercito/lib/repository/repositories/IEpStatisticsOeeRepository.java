package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsOeeEntity;

import java.util.Optional;

/**
 * IEpStatisticsOeeRepository
 * <p>
 * IEpStatisticsOeeRepository interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Repository
public interface IEpStatisticsOeeRepository extends JpaRepository<EpStatisticsOeeEntity, Long> {
    @Query(value = "SELECT o FROM EpStatisticsOeeEntity o " +
        "LEFT JOIN FETCH o.stDocument " +
        "WHERE o.uuId = :uuId")
    Optional<EpStatisticsOeeEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT o FROM EpStatisticsOeeEntity o " +
        "LEFT JOIN FETCH o.stDocument " +
        "WHERE o.id = :id")
    Optional<EpStatisticsOeeEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT o FROM EpStatisticsOeeEntity o " +
        "INNER JOIN FETCH o.stDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(o) FROM EpStatisticsOeeEntity o " +
            "LEFT JOIN o.stDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsOeeEntity> findAll(@Param("document") String document, Pageable pageable);
}