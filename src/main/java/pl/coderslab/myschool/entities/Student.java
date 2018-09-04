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

    @Column(nullable = false, name = "first_name")
    @NotBlank
    private String firstName;

    @Column(nullable = false, name = "last_name")
    @NotBlank
    private String lastName;

    @Column(nullable = false)
    @NotBlank
    private String login;

    @Column(nullable = false)
    @Email
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    private String phone;

    @Column(columnDefinition = "text")
    private String address;

    @Column(name = "birthday")
    private LocalDateTime dateOfBirthday;

    @Column(name = "creation_data")
    private LocalDateTime creationDate;



    @PrePersist
    public void  prePresit(){
        creationDate = LocalDateTime.now();
    }



    private boolean enabled = true;
    private boolean tokenExpired = true;

    //TODO relacje

    @ManyToOne // jeden uczeń ma jednego nauczyciela
    private Teacher teacher;

    //jeden uczen - wielu rodzicow
    @ManyToMany
    @JoinTable(name = "students_parents",
        joinColumns = { @JoinColumn(name = "student_id")},
        inverseJoinColumns = {@JoinColumn(name = "parent_id")})
    private Set<Parent> parents;
//
//    @ManyToMany
//    @JoinTable(
//            name = "users_roles",
//            joinColumns = @JoinColumn(
//                    name =
//            )
//    )

}
