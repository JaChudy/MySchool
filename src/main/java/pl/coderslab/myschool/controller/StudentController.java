package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.entities.Student;
import pl.coderslab.myschool.repository.StudentRepository;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;



    @GetMapping("/add")
    public String addStudentForm(Model model){
        model.addAttribute("student", new Student());
        return "student_add";
    }

    @PostMapping("add")
    public String addStudent(@ModelAttribute Student student){
        studentRepository.save(student);
        return "redirect:/student_add";
    }

}
