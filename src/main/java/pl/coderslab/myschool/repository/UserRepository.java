package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.myschool.entities.Student;
import pl.coderslab.myschool.entities.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
    User findFirstByFirstNameAndLastName(String firstName, String lastName);
    User findByEmail(String email);

    @Override
    void delete(User user);

    User findById(String s);

    User findById(Long id);

    List<User>  findAllByType(String type);
}
