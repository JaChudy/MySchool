package pl.coderslab.myschool.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.myschool.repository.RoleRepository;
import pl.coderslab.myschool.repository.UserRepository;

//@Component
//public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
//
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//
//    @Override
//    @Transactional
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//
//    }
//}
