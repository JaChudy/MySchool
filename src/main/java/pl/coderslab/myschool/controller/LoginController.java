package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.myschool.entities.Role;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.RoleRepository;
import pl.coderslab.myschool.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @PostMapping("/login")
//    public String loginPage(HttpServletRequest request){
//
//
//        if(request.isUserInRole("ADMIN")) {
//            return "admin_panel";
//        } else if(request.isUserInRole("STUDENT")){
//            return "student_panel";
//        } else if(request.isUserInRole("TEACHER")) {
//            return "teacher_panel";
//        }
//        return "parent_panel";
//    }


    @ModelAttribute("allRoles")
    public List<Role> aleRoles(){
        return roleRepository.findAll();
    }
}
