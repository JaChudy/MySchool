package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.entities.Student;
import pl.coderslab.myschool.entities.Teacher;
import pl.coderslab.myschool.repository.StudentRepository;
import pl.coderslab.myschool.services.UserService;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/register-student")
    public String teacherRegisterForm(Model model){
        model.addAttribute("student", new Student());
        return "student_register";
    }

    @PostMapping("/register-student")
    public String teacherRegister(@ModelAttribute Student student){
        student.setType("student");
        studentRepository.save(student);
        return "redirect:/admin";
    }

}
