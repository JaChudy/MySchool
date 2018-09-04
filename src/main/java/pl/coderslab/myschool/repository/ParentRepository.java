package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
