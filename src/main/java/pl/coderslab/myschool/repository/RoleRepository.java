package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
