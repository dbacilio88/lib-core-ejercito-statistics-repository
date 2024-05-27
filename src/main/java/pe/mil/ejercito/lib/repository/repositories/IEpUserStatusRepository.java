package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUserStatusEntity;

import java.util.Optional;

/**
 * IEpUserStatusRepository
 * <p>
 * IEpUserStatusRepository interface.
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
public interface IEpUserStatusRepository extends JpaRepository<EpUserStatusEntity, Long> {

    @Query(value = "select us from EpUserStatusEntity us where us.uuId = :uuId")
    Optional<EpUserStatusEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "select us from EpUserStatusEntity us where us.id = :id")
    Optional<EpUserStatusEntity> findById(@Param("id") Long id);

    @Query(value = "select us from EpUserStatusEntity us where us.usCode = :code")
    Optional<EpUserStatusEntity> findByUsCode(@Param("code") String code);
}