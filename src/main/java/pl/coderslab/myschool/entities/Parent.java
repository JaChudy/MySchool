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


    @Column(name = "creation_data")
    private LocalDateTime creationDate;

    //rodzic moze miec wiecej niz jedno dziecko w szkole
    @ManyToMany(mappedBy = "parents")
    private Set<Student> students;

    @PrePersist
    public void  prePresit(){
        creationDate = LocalDateTime.now();
    }

    private boolean enabled = true;
    private boolean tokenExpired = true;

}
