package pl.main.app.AgApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.main.app.AgApp.entity.Zastosowanie;

public interface ZastosowanieRepo extends JpaRepository<Zastosowanie, Long> {
}
