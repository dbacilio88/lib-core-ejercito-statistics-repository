package pe.mil.ejercito.lib.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.mil.ejercito.lib.repository.repositories.views.EpDieGraphView;

import java.util.List;

/**
 * IEpDieGraphRepository
 * <p>
 * IEpDieGraphRepository interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bacsystem
 * @author bacsystem.sac@gmail.com
 * @since 8/07/2024
 */
@Repository
public interface IEpDieGraphRepository extends JpaRepository<EpDieGraphView, Long> {

    @Query(value = "SELECT dgv FROM EpDieGraphView dgv WHERE dgv.amType = :type AND dgv.amUnit = :unit")
    List<EpDieGraphView> findAll(@Param("type") String type, @Param("unit") Long unit);
}
