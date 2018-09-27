package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Stanowisko;

public interface StanowiskoRepo extends JpaRepository<Stanowisko, Long> {
}
