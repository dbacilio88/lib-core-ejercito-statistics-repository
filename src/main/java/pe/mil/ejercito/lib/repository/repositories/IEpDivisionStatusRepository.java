package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDivisionStatusEntity;

import java.util.Optional;

/**
 * IEpDivisionStatusRepository
 * <p>
 * IEpDivisionStatusRepository interface.
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
public interface IEpDivisionStatusRepository extends JpaRepository<EpDivisionStatusEntity, Long> {
    Optional<EpDivisionStatusEntity> findByUuId(String uuId);
}