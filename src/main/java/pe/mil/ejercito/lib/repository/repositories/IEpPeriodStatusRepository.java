package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpPeriodStatusEntity;

import java.util.Optional;

/**
 * IEpPeriodStatusRepository
 * <p>
 * IEpPeriodStatusRepository interface.
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
public interface IEpPeriodStatusRepository extends JpaRepository<EpPeriodStatusEntity, Long> {
    @Query(value = "select ps from EpPeriodStatusEntity ps where ps.uuId = :uuId")
    Optional<EpPeriodStatusEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "select ps from EpPeriodStatusEntity ps where ps.id = :id")
    Optional<EpPeriodStatusEntity> findById(@Param("id") Long id);

    @Query(value = "select ps from EpPeriodStatusEntity ps where ps.psCode = :code")
    Optional<EpPeriodStatusEntity> findByPsCode(@Param("code") String code);
}