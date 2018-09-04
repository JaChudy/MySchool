package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.Student;

public interface StudentRepository extends JpaRepository <Student, Long> {
}
