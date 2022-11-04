package ru.guluev.serviceforautorization.controoler;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.guluev.serviceforautorization.enums.Authorities;
import ru.guluev.serviceforautorization.model.User;
import ru.guluev.serviceforautorization.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Validated User user) {
        return service.getAuthorities(user.getName(), user.getPassword());
    }

    @GetMapping("/createUser")
    public List<Authorities> createUser(@Validated User user) {
        return service.createUser(user.getName(), user.getPassword());
    }
}
