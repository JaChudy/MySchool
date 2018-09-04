package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.UserRepository;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user){
        String lastName = user.getLastName();
        String firstName = user.getFirstName();
        String email = user.getEmail();
        String login = user.getLogin();
//        User loginAlreadyExist = userRepository.findByuserLogin(login);
//        User alreadyRegister = userRepository.findFirstByuserfirstNameAnduserlastName(firstName, lastName);
//        User emailAlreadyUse = userRepository.findByuserLogin(email);
//        if(alreadyRegister != null || emailAlreadyUse != null || loginAlreadyExist != null){
//            return "register";
//        }
        userRepository.save(user);
        return "redirect:/";
    }
}
