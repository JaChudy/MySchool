package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.coderslab.myschool.entities.Message;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query(value = "SELECT m FROM Message m WHERE m.sender.id = ?1")
    List<Message> findAllMessageSend(Long id);

    @Query(value = "SELECT m FROM Message m WHERE m.receiver.id = ?1")
    List<Message> findAllMessageIn(Long id);


}
