package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
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

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "pay_for_hour")
    private BigDecimal payForHour;

    @Column(name = "creation_data")
    private LocalDateTime creationDate;



    //relacje

    //uczen nauczyciel - jeden nauczyciel moze miec wielu uczniów.
    @OneToMany
    @JoinColumn(name = "studet_id")
    private List<Student> students;




    @PrePersist
    public void  prePresit(){
        creationDate = LocalDateTime.now();
    }

    private boolean enabled = true;
    private boolean tokenExpired = true;
}
