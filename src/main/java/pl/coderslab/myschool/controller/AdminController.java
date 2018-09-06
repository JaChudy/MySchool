package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.entities.Message;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.MessageRepository;
import pl.coderslab.myschool.repository.UserRepository;
import pl.coderslab.myschool.services.UserService;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private UserService userService;

    @RequestMapping
    public String adminPanel(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User userLogin = userRepository.findByLogin(name);
        String userAcontType = userLogin.getType();
        switch (userAcontType){
            case "student": return "student_panel";
            case "admin": return "admin_panel";
            case "teacher": return "teacher_panel";
            case "parent": return "parent_panel";
        }
        return "admin_panel";
    }

    @GetMapping("/all")
    public String showAllUsers(){
        return "user_list";
    }

//    @RequestMapping("/message-in")
//    public String messageIn(Model model){
//        model.addAttribute("messageIn", userService.messageInComing());
//        return "message_in";
//    }

    @GetMapping("/message")
    public String messageForm(Model model){
        model.addAttribute("userId", userService.userLoggedIn());
        model.addAttribute("message", new Message());
        return "message_panel";
    }

    @PostMapping("/message")
    public String messagePage(@ModelAttribute Message message){

        messageRepository.save(message);
        return "redirect:/admin";
    }

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute @Valid User user, BindingResult bindingResult,
                           HttpServletRequest request){ //validation bindigresult
        if(bindingResult.hasErrors()){
            return "register";
        }
        user.setEnabled(true);
        userRepository.save(user);


        return "redirect:/admin";
    }

    @ModelAttribute("allUser")
    public List<User> allUsers(){
        return userRepository.findAll();
    }

    @ModelAttribute("userType")
    public List<String> allUserTypes() {
        return Arrays.asList("student", "teacher", "parent");
    }

    @ModelAttribute("nameOfLoginUser")
    public String name(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

//    @ModelAttribute("messageReceiver")
//    public List<Message> messagesRec(){
//        return
//    }



}
