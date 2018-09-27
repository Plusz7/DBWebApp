package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Pokroj;

public interface PokrojRepo extends JpaRepository<Pokroj, Long> {
}
