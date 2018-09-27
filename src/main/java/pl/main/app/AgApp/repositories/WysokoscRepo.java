package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Wysokosc;

public interface WysokoscRepo extends JpaRepository<Wysokosc, Long> {
}
