package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.views.EpMantoAeroGraphView;

import java.util.List;

/**
 * IEpMantoAeroGraphRepository
 * <p>
 * IEpMantoAeroGraphRepository interface.
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
public interface IEpMantoAeroGraphRepository extends JpaRepository<EpMantoAeroGraphView, Long> {

    @Query(value = "SELECT mad FROM EpMantoAeroGraphView mad WHERE mad.magvTypeManto = :type AND mad.magvUnit = :unit")
    List<EpMantoAeroGraphView> findAll(@Param("type") String type, @Param("unit") Long unit);
}