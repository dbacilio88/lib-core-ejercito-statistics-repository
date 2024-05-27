package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.views.EpCuadroAeroDataView;

import java.util.List;

/**
 * IEpCuadroAeroDataRepository
 * <p>
 * IEpCuadroAeroDataRepository interface.
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
public interface IEpCuadroAeroDataRepository extends JpaRepository<EpCuadroAeroDataView, Long> {

    @Query(value = "SELECT mad FROM EpCuadroAeroDataView mad WHERE mad.mhvType = :type")
    List<EpCuadroAeroDataView> findAll(@Param("type") String type);
}