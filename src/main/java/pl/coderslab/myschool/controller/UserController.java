package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.UserRepository;
import pl.coderslab.myschool.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @GetMapping("/edit/{id}")
    @RequestMapping
    public String editUserRedirect(@PathVariable Long id, Model model){
        User user = userRepository.findById(id);
        String type = user.getType();
        model.addAttribute("userToEdit", user);

        return "kdkadkdkksd";
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
