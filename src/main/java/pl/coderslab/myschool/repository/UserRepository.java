package pl.coderslab.myschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.myschool.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
    User findFirstByFirstNameAndLastName(String firstName, String lastName);
    User findByEmail(String email);

    @Override
    void delete(User user);

    User findById(String s);
}
