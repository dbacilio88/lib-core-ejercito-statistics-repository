package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDivisionEntity;

import java.util.Optional;

/**
 * IEpDivisionRepository
 * <p>
 * IEpDivisionRepository interface.
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
public interface IEpDivisionRepository extends JpaRepository<EpDivisionEntity, Long> {

    @Query(value = "SELECT d FROM EpDivisionEntity d " +
        "LEFT JOIN FETCH d.diStatus " +
        "WHERE d.uuId = :uuId")
    Optional<EpDivisionEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT d FROM EpDivisionEntity d " +
        "LEFT JOIN FETCH d.diStatus " +
        "WHERE d.id = :id")
    Optional<EpDivisionEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT d  FROM EpDivisionEntity d " +
        "INNER JOIN FETCH d.diStatus s " +
        "WHERE (:status is null or s.dsCode = :status) ",
        countQuery = "SELECT COUNT(d) FROM EpDivisionEntity d " +
            "LEFT JOIN d.diStatus s " +
            "WHERE (:status is null or s.dsCode = :status) ")
    Page<EpDivisionEntity> findAll(@Param("status") String status, Pageable pageable);
}