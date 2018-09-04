package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "pay_for_hour")
    private BigDecimal payForHour;





    //relacje

    //uczen nauczyciel - jeden nauczyciel moze miec wielu uczniów.


    @ManyToMany
    @JoinTable(name = "teachers_students",
            joinColumns = { @JoinColumn(name = "teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private Set<Student> students;



}
