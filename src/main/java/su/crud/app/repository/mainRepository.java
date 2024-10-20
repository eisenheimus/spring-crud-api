package su.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import su.crud.app.entities.mainEntity;

@Repository
public interface mainRepository extends JpaRepository<mainEntity, Integer> {
}
