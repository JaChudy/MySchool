package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
