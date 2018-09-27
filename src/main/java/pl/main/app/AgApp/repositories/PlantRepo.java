package pl.main.app.AgApp.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.main.app.AgApp.classes.PlantFiltered;
import pl.main.app.AgApp.entity.Plant;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface PlantRepo extends JpaRepository<Plant, Long>{



//    @Query("SELECT t FROM Plant t " +
//            "LEFT JOIN t.kolorKwiatow k on t.id = k.id " +
//            "WHERE (t.grupa = :#{#searchPlant.grupa} or t.grupa = null)" +
//            "AND (t.zimozielone = :#{#searchPlant.zimozielone} or t.zimozielone = null)")


//    List<Plant> findFilterPlant(@Param("searchPlant") PlantFiltered plantFiltered);

}




//@Query("SELECT t FROM Plant t JOIN plant_kolor_kwiatow k on t.id = k.plant.id JOIN plant_naslonecznienie n on t.id = n.plant.id JOIN plant_owoce o on t.id = o.plant.id JOIN plant_ph_podloza ph on t.id = ph.plant.id JOIN plant_pokroj po on t.id = po.plant.id " +
//        "JOIN plant_pora_kwitnienia pk on t.id = pk.plant.id JOIN plant_pora_owocowania po on t.id = po.plant.id JOIN plant_rodzaj_gleby rg on t.id = rg.plant.id JOIN plant_stanowisko s on t.id = s.plant.id JOIN plant_walory w on t.id = w.plant.id JOIN plant_wilgotnosc wil on t.id = wil.plant.id " +
//        "JOIN plant_wysokosc wys on t.id = wys.plant.id JOIN plant_zastosowanie z on t.id = z.plant.id WHERE t.grupa = :searchPlant.grupa")