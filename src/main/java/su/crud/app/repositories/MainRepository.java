package su.crud.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import su.crud.app.entities.MainEntity;

@Repository
public interface MainRepository extends JpaRepository<MainEntity, Integer> {
}
