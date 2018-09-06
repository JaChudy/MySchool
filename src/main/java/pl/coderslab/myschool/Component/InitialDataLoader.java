package pl.coderslab.myschool.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.myschool.entities.Role;
import pl.coderslab.myschool.entities.User;
import pl.coderslab.myschool.repository.RoleRepository;
import pl.coderslab.myschool.repository.UserRepository;

import java.util.Arrays;
//
//@Component
//public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
//
//
//    boolean alreadySetup = false;
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
//        if(alreadySetup){
//            return;
//        }
//        Role role = new Role();
//        role.setName("ROLE_ADMIN");
//        roleRepository.save(role);
//
//        role = new Role();
//        role.setName("ROLE_STUDENT");
//        roleRepository.save(role);
//
//        Role adminRole = roleRepository.findByName("ROLE_ADMIN");
//        User user = new User();
//        user.setFirstName("Test");
//        user.setLastName("Test");
//        user.setLogin("Test");
//        user.setPassword("test");
//        user.setType("admin");
//        user.setEmail("test@test.com");
//        user.setRoles(Arrays.asList(adminRole));
//        user.setEnabled(true);
//        userRepository.save(user);
//
//        alreadySetup = true;
//    }
//
//    @Transactional
//    private Role createRoleIfNotFound(String name){
//
//        Role role = roleRepository.findByName(name);
//        if(role == null){
//            role = new Role(name);
//            roleRepository.save(role);
//        }
//        return role;
//    }

//}
