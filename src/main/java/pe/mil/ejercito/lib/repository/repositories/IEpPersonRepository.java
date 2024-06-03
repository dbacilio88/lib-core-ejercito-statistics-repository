package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.mil.ejercito.lib.repository.repositories.entities.EpPersonEntity;

import java.util.Optional;

/**
 * IEpPersonRepository
 * <p>
 * IEpPersonRepository interface.
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
public interface IEpPersonRepository extends JpaRepository<EpPersonEntity, Long> {

    Optional<EpPersonEntity> findByUuId(String uuId);

    @Query(name = "SELECT p FROM EpPersonEntity p WHERE p.peDocument = :document")
    Optional<EpPersonEntity> findByDocument(String document);
}