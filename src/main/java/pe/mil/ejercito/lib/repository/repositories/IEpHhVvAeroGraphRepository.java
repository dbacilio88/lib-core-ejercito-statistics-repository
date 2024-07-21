package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.views.EpHhVvAeroGraphView;

import java.util.List;

/**
 * IEpHhVvAeroGraphRepository
 * <p>
 * IEpHhVvAeroGraphRepository interface.
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
public interface IEpHhVvAeroGraphRepository extends JpaRepository<EpHhVvAeroGraphView, Long> {

    @Query(value = "SELECT vag FROM EpHhVvAeroGraphView vag WHERE vag.magvTypeManto = :type AND vag.magvUnit = :unit")
    List<EpHhVvAeroGraphView> findAll(@Param("type") String type,@Param("unit") Long unit);
}