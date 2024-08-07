package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsCoteEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsOajeEntity;

import java.util.Optional;

/**
 * IEpStatisticsCoteRepository
 * <p>
 * IEpStatisticsCoteRepository interface.
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
public interface IEpStatisticsCoteRepository extends JpaRepository<EpStatisticsCoteEntity, Long> {
    @Query(value = "SELECT c FROM EpStatisticsCoteEntity c " +
        "LEFT JOIN FETCH c.stcDocument " +
        "WHERE c.uuId = :uuId")
    Optional<EpStatisticsCoteEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT c FROM EpStatisticsCoteEntity c " +
        "LEFT JOIN FETCH c.stcDocument " +
        "WHERE c.id = :id")
    Optional<EpStatisticsCoteEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT c FROM EpStatisticsCoteEntity c " +
        "INNER JOIN FETCH c.stcDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(c) FROM EpStatisticsCoteEntity c " +
                "LEFT JOIN c.stcDocument d " +
                "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsCoteEntity> findAll(@Param("document") String document, Pageable pageable);
}