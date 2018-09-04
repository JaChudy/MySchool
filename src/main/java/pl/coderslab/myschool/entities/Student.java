package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    //TODO relacje


    //jeden uczen - wielu rodzicow
    @ManyToMany
    @JoinTable(name = "students_parents",
        joinColumns = { @JoinColumn(name = "student_id")},
        inverseJoinColumns = {@JoinColumn(name = "parent_id")})
    private Set<Parent> parents;

    //jeden uczeń wielu nauczycieli
    @ManyToMany(mappedBy = "students")
    private Set<Teacher> teachers;


}
