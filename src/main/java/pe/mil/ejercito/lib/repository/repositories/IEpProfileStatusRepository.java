package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpProfileStatusEntity;

import java.util.Optional;

/**
 * IEpProfileStatusRepository
 * <p>
 * IEpProfileStatusRepository interface.
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
public interface IEpProfileStatusRepository extends JpaRepository<EpProfileStatusEntity, Long> {
    @Query(value = "select ps from EpProfileStatusEntity ps where ps.uuId = :uuId")
    Optional<EpProfileStatusEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "select ps from EpProfileStatusEntity ps where ps.id = :id")
    Optional<EpProfileStatusEntity> findById(@Param("id") Long id);

    @Query(value = "select ps from EpProfileStatusEntity ps where ps.psCode = :code")
    Optional<EpProfileStatusEntity> findByPsCode(@Param("code") String code);
}