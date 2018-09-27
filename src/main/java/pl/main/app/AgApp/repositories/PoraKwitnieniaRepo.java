package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.PoraKwitnienia;

public interface PoraKwitnieniaRepo extends JpaRepository<PoraKwitnienia, Long> {
}
