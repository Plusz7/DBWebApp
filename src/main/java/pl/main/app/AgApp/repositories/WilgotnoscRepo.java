package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Wilgotnosc;

public interface WilgotnoscRepo extends JpaRepository<Wilgotnosc, Long> {
}
