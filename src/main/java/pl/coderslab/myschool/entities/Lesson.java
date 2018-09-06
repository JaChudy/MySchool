package pl.coderslab.myschool.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lesson_day")
    private DayOfWeek lessonDay;

    @Column(name= "hour_start")
    private Time hourStart;

    @Column(name= "hour_end")
    private Time hourEnd;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany
    @JoinTable(
            name = "Lessons_Students",
            joinColumns = {@JoinColumn(name = "lesson_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    Set<Student> students = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DayOfWeek getLessonDay() {
        return lessonDay;
    }

    public void setLessonDay(DayOfWeek lessonDay) {
        this.lessonDay = lessonDay;
    }

    public Time getHourStart() {
        return hourStart;
    }

    public void setHourStart(Time hourStart) {
        this.hourStart = hourStart;
    }

    public Time getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(Time hourEnd) {
        this.hourEnd = hourEnd;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
