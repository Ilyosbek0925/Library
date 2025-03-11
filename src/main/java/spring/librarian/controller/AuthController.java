package spring.librarian.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.librarian.entity.Users;
import spring.librarian.service.LoginService;

@RestController
public class AuthController {

    @Autowired
    LoginService loginService;
    @PostMapping("/register")
    public String register(@RequestBody Users user) {
        return loginService.login(user);
    }


}
