package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.entities.Message;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.MessageRepository;
import pl.coderslab.myschool.repository.UserRepository;
import pl.coderslab.myschool.services.UserService;

import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private UserService userService;

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private UserRepository userRepository;

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

    @RequestMapping("/message-in")
    public String messageIn(Model model){
        model.addAttribute("messageIn", userService.messageInComing());
        return "message_in";
    }

    @RequestMapping("/message-out")
    public String messageOut(Model model){
        model.addAttribute("messageOut", userService.messagesOut());
        return "message_out";
    }

    @ModelAttribute("allUser")
    public List<User> allUsers(){
        return userRepository.findAll();
    }

}
