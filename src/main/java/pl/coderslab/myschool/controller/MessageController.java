package pl.coderslab.myschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.myschool.services.UserService;

@Controller
public class MessageController {

    @Autowired
    private UserService userService;

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

}
