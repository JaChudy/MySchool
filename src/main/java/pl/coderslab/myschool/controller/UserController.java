package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.myschool.entities.Teacher;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.TeacherRepository;
import pl.coderslab.myschool.repository.UserRepository;
import pl.coderslab.myschool.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private TeacherRepository teacherRepository;


    @GetMapping("/edit/{id}")
    public String editUserRedirect(@PathVariable Long id, Model model){
        User user = userRepository.findById(id);
        String type = user.getType();
        Long Id = user.getId();
        if(type.equals("teacher")){
            Teacher teacher = teacherRepository.findById(Id);
            model.addAttribute("teacherToEdit", teacher);
            return "edit_teacher";
        }
        model.addAttribute("userToEdit", user);

        return "edit_user";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute User userToEdit){
        return "redirect:/admin";
    }

//    @GetMapping("/details/{id}")
//    public String setUserDetails(@PathVariable Long id, Model model){
//        User user = userRepository.findById(id);
//        model.addAttribute("userDetails", user);
//        String type = user.getType();
//        User userLogg = userService.userLooggeDetail();
//        if(userLogg.getType().equals("admin")) {
//
//
//            if (type.equals("teacher")) {
//                return "teacher_details";
//            } else if (type.equals("student")) {
//                return "student_details";
//            }
//            return "parent_details";
//        }
//        return "redirect:/admin";
//    }
}
