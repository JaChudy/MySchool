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
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.StudentRepository;
import pl.coderslab.myschool.repository.TeacherRepository;
import pl.coderslab.myschool.repository.UserRepository;
import pl.coderslab.myschool.services.UserService;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;




    @GetMapping("/register-teacher")
    public String teacherRegisterForm(Model model){
        List<Student> studentsList = studentRepository.findAll();
        model.addAttribute("students", studentsList /*studentRepository.findAll()*/);
        model.addAttribute("teacher", new Teacher());
        return "teacher_register";
    }

    @PostMapping("/register-teacher")
    public String teacherRegister(@ModelAttribute Teacher teacher){
        teacher.setType("teacher");
        teacherRepository.save(teacher);
        return "redirect:/admin";
    }

}
