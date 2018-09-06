package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import pl.coderslab.myschool.entities.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {


}
