package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.myschool.entities.Lesson;
import pl.coderslab.myschool.entities.Student;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    @Query("SELECT l FROM Lesson l WHERE l.teacher.id = ?1")
    List<Lesson> findAllLessonOfTeacher(Long id);

//    @Query("Select s from Student s Join s.lesson l where l = :lesson")
//    List<Student> findAllStudentsByLesson(@Param("lesson") Lesson lesson);
}
