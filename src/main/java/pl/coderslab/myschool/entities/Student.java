package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
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


    @ManyToMany(mappedBy = "students")
    private Set<Lesson> lessons = new HashSet<>();


    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }


}
