package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}
