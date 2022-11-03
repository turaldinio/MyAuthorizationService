package ru.guluev.serviceforautorization.controoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.guluev.serviceforautorization.enums.Authorities;
import ru.guluev.serviceforautorization.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    @GetMapping("/createUser")
    public List<Authorities> createUser(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.createUser(user, password);
    }
}
