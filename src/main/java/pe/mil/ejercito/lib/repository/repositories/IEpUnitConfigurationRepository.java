package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUnitConfigurationEntity;

import java.util.Optional;

/**
 * IEpUnitConfigurationRepository
 * <p>
 * IEpUnitConfigurationRepository interface.
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
public interface IEpUnitConfigurationRepository extends JpaRepository<EpUnitConfigurationEntity, Long> {

    @Query(value = "SELECT uc FROM EpUnitConfigurationEntity uc " +
        "LEFT JOIN FETCH uc.ucUnit  " +
        "LEFT JOIN FETCH uc.ucTypeRegister  " +
        "WHERE uc.uuId = :uuId")
    Optional<EpUnitConfigurationEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT uc FROM EpUnitConfigurationEntity uc " +
        "LEFT JOIN FETCH uc.ucUnit  " +
        "LEFT JOIN FETCH uc.ucTypeRegister  " +
        "WHERE uc.id = :id")
    Optional<EpUnitConfigurationEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT uc FROM EpUnitConfigurationEntity uc " +
        "LEFT JOIN FETCH uc.ucUnit u  " +
        "LEFT JOIN FETCH uc.ucTypeRegister tr  " +
        "WHERE u.id = :unitId AND tr.uuId = :typeRegister")
    Optional<EpUnitConfigurationEntity> findUnitByIdAndTypeRegisterByUuid(@Param("unitId") Long id, @Param("typeRegister") String typeRegister);

    @Query(value = "SELECT uc  FROM EpUnitConfigurationEntity uc " +
        "INNER JOIN uc.ucUnit u " +
        "INNER JOIN uc.ucTypeRegister tr " +
        "WHERE (:unit is null or u.uuId = :unit) ",
        countQuery = "SELECT COUNT(uc) FROM EpUnitConfigurationEntity uc " +
            "INNER JOIN uc.ucUnit u " +
            "INNER JOIN uc.ucTypeRegister tr " +
            "WHERE (:unit is null or u.uuId = :unit) ")
    Page<EpUnitConfigurationEntity> findAll(@Param("unit") String unit, Pageable pageable);
}