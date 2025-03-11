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


    public String login(Users user) {
        user.setRole(Roles.USER);
        userRepo.save(user);
        return "success";
    }
}
