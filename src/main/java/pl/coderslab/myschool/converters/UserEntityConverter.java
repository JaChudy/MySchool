package pl.coderslab.myschool.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.UserRepository;

public class UserEntityConverter implements Converter<String, User> {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User convert(String s) {
        return userRepository.findById(s);
    }
}
