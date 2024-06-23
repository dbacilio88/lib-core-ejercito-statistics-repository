package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDisaleEntity;

import java.util.Optional;

/**
 * IEpStatisticsDisaleRepository
 * <p>
 * IEpStatisticsDisaleRepository interface.
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
public interface IEpStatisticsDisaleRepository extends JpaRepository<EpStatisticsDisaleEntity, Long> {
    @Query(value = "SELECT d FROM EpStatisticsDisaleEntity d " +
        "LEFT JOIN FETCH d.stDocument " +
        "WHERE d.uuId = :uuId")
    Optional<EpStatisticsDisaleEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT d FROM EpStatisticsDisaleEntity d " +
        "LEFT JOIN FETCH d.stDocument " +
        "WHERE d.id = :id")
    Optional<EpStatisticsDisaleEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT di FROM EpStatisticsDisaleEntity di " +
        "INNER JOIN FETCH di.stDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(di) FROM EpStatisticsDisaleEntity di " +
            "LEFT JOIN di.stDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsDisaleEntity> findAll(@Param("document") String document, Pageable pageable);
}