package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.entities.Lesson;
import pl.coderslab.myschool.entities.Teacher;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.LessonRepository;
import pl.coderslab.myschool.repository.StudentRepository;
import pl.coderslab.myschool.repository.TeacherRepository;
import pl.coderslab.myschool.services.UserService;

import javax.jws.soap.SOAPBinding;
import javax.persistence.MapsId;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/lesson")
public class LessonController {
    @Autowired
    private LessonRepository lessonRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/add")
    public String addLessonForm(Model model){
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("lesson", new Lesson());
        return "lesson_add";
    }

    @PostMapping("/add")
    public String addLesson(@ModelAttribute Lesson lesson){
       User user =  userService.userLooggeDetail();
       //todo if user hase type teacher
       Teacher teacher = teacherRepository.findById(user.getId());
        lesson.setTeacher(teacher);
        lessonRepository.save(lesson);
        return "redirect:/admin";
    }

//    @GetMapping("/all")
//    public String allLessonShow

    @ModelAttribute("dayOfWeek")
    public List<String> dayOfWeek(){
       return Arrays.asList("MONDAY",
                "TUESDAY",
                "WEDNESDAY",
                "THURSDAY",
                "FRIDAY",
                "SATURDAY",
                "SUNDAY");
    }



}
