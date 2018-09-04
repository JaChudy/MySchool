package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "parents")
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //rodzic moze miec wiecej niz jedno dziecko w szkole
    @ManyToMany(mappedBy = "parents")
    private Set<Student> students;


}
