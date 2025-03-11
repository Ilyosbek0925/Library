package spring.librarian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import spring.librarian.entity.Roles;
import spring.librarian.entity.Users;
import spring.librarian.repo.UserRepo;

@Service
public class LoginService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    PasswordEncoder passwordEncoder;


    public String login(Users user) {
        user.setRole(Roles.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return "success";
    }
}
