package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpUserEntity;

import java.util.Optional;

/**
 * IEpUserRepository
 * <p>
 * IEpUserRepository interface.
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
public interface IEpUserRepository extends JpaRepository<EpUserEntity, Long> {

    @Query(value = "SELECT u FROM EpUserEntity u " +
        "LEFT JOIN  FETCH u.usUserStatus " +
        "LEFT JOIN FETCH u.usPerson " +
        "LEFT JOIN FETCH u.usProfile " +
        "LEFT JOIN FETCH u.usUnit " +
        "WHERE u.uuId = :uuId")
    Optional<EpUserEntity> findByUuId(@Param("uuId") String uuId);

    @Query(value = "SELECT u FROM EpUserEntity u " +
        "LEFT JOIN  FETCH u.usUserStatus " +
        "LEFT JOIN FETCH u.usPerson " +
        "LEFT JOIN FETCH u.usProfile " +
        "LEFT JOIN FETCH u.usUnit " +
        "WHERE u.id = :id")
    Optional<EpUserEntity> findById(@Param("id") Long id);

    @Query(value = "SELECT u FROM EpUserEntity u " +
        "LEFT JOIN  FETCH u.usUserStatus " +
        "LEFT JOIN FETCH u.usPerson " +
        "LEFT JOIN FETCH u.usProfile " +
        "LEFT JOIN FETCH u.usUnit " +
        "WHERE u.usUsername = :username")
    Optional<EpUserEntity> findByUsername(String username);


    @Query(value = "SELECT u FROM EpUserEntity u " +
        "INNER JOIN FETCH u.usUserStatus us " +
        "INNER JOIN FETCH u.usPerson p " +
        "INNER JOIN FETCH u.usProfile pr " +
        "INNER JOIN FETCH u.usUnit un " +
        "WHERE (:status is null or us.usCode = :status) " +
        "AND (:profile is null or pr.uuId = :profile) " +
        "AND (:person is null or p.uuId = :person) " +
        "AND (:unit is null or un.uuId = :unit) ",
        countQuery = "SELECT COUNT(u) FROM EpUserEntity u " +
            "LEFT JOIN u.usUserStatus us " +
            "LEFT JOIN u.usPerson p " +
            "LEFT JOIN u.usProfile pr " +
            "LEFT JOIN u.usUnit un " +
            "WHERE (:status is null or us.usCode = :status) " +
            "AND (:profile is null or pr.uuId = :profile) " +
            "AND (:person is null or p.uuId = :person) " +
            "AND (:unit is null or un.uuId = :unit) ")
    Page<EpUserEntity> findAll(@Param("status") String status, @Param("profile") String profile, @Param("person") String personId, @Param("unit") String unit, Pageable pageable);
}