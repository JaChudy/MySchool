package pl.coderslab.myschool.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teachers")
public class Teacher extends User{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "pay_for_hour")
    private BigDecimal payForHour;


    @OneToMany(mappedBy = "teacher")
    private Set<Lesson> lessons = new HashSet<>();



    //relacje

    //uczen nauczyciel - jeden nauczyciel moze miec wielu uczniów.


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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getPayForHour() {
        return payForHour;
    }

    public void setPayForHour(BigDecimal payForHour) {
        this.payForHour = payForHour;
    }


}
