package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDinveEntity;

import java.util.Optional;

/**
 * IEpStatisticsDinveRepository
 * <p>
 * IEpStatisticsDinveRepository interface.
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
public interface IEpStatisticsDinveRepository extends JpaRepository<EpStatisticsDinveEntity, Long> {
    @Query(value = "SELECT d FROM EpStatisticsDinveEntity d " +
        "LEFT JOIN FETCH d.stdDocument " +
        "WHERE d.uuId = :uuId")
    Optional<EpStatisticsDinveEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT d FROM EpStatisticsDinveEntity d " +
        "LEFT JOIN FETCH d.stdDocument " +
        "WHERE d.id = :id")
    Optional<EpStatisticsDinveEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT di FROM EpStatisticsDinveEntity di " +
        "INNER JOIN FETCH di.stdDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(di) FROM EpStatisticsDinveEntity di " +
            "LEFT JOIN di.stdDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsDinveEntity> findAll(@Param("document") String document, Pageable pageable);
}