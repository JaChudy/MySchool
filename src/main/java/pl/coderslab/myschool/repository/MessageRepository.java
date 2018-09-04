package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
