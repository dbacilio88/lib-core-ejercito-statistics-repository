package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsCoadneEntity;

import java.util.Optional;

/**
 * IEpStatisticsCoadneRepository
 * <p>
 * IEpStatisticsCoadneRepository interface.
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
public interface IEpStatisticsCoadneRepository extends JpaRepository<EpStatisticsCoadneEntity, Long> {

    @Query(value = "SELECT ae FROM EpStatisticsCoadneEntity ae " +
        "LEFT JOIN FETCH ae.stcDocument " +
        "WHERE ae.uuId = :uuId")
    Optional<EpStatisticsCoadneEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT ae FROM EpStatisticsCoadneEntity ae " +
        "LEFT JOIN FETCH ae.stcDocument " +
        "WHERE ae.id = :id")
    Optional<EpStatisticsCoadneEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT ae FROM EpStatisticsCoadneEntity ae " +
        "INNER JOIN FETCH ae.stcDocument d " +
        "WHERE (:document is null or d.uuId = :document) ",
        countQuery = "SELECT COUNT(ae) FROM EpStatisticsCoadneEntity ae " +
            "LEFT JOIN ae.stcDocument d " +
            "WHERE (:document is null or d.uuId = :unit) ")
    Page<EpStatisticsCoadneEntity> findAll(@Param("document") String document, Pageable pageable);
}