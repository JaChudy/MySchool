package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.entities.Parent;
import pl.coderslab.myschool.entities.Student;
import pl.coderslab.myschool.repository.ParentRepository;
import pl.coderslab.myschool.repository.StudentRepository;
@Controller
@RequestMapping("/parent")
public class ParentController {

    @Autowired
    private ParentRepository parentRepository;

    @GetMapping("/register-parent")
    public String teacherRegisterForm(Model model){
        model.addAttribute("parent", new Parent());
        return "parent_register";
    }

    @PostMapping("/register-student")
    public String teacherRegister(@ModelAttribute Parent parent){
        parent.setType("parent");
        parentRepository.save(parent);
        return "redirect:/admin";
    }

}
