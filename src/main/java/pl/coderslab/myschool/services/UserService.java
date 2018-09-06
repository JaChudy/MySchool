package pl.coderslab.myschool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import pl.coderslab.myschool.entities.Message;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.MessageRepository;
import pl.coderslab.myschool.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    public String userLoggedIn(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByLogin(name);
        return String.valueOf(user.getId());
    }

    public List<Message> messageInComing(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByLogin(name);
        return messageRepository.findAllMessageIn(user.getId());
    }

    public List<Message> messagesOut(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByLogin(name);
        return messageRepository.findAllMessageSend(user.getId());
    }
}
