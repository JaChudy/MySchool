package pl.coderslab.myschool.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.myschool.entities.Student;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {

    @Override
    @Query("SELECT s FROM Student s WHERE s.type = 'student'")
    List<Student> findAll();
}
