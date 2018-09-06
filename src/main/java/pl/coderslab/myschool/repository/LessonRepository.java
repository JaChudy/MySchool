package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
