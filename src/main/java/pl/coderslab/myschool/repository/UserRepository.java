package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.myschool.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
//    User findByuserLogin(String login);
//    User findFirstByuserfirstNameAnduserlastName(String firstName, String lastName);
//    User findByuserEmail(String email);
}
