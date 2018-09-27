package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Owoce;

public interface OwoceRepo extends JpaRepository<Owoce, Long> {
}
