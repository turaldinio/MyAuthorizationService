package ru.guluev.serviceforautorization.repository;

import org.springframework.stereotype.Repository;
import ru.guluev.serviceforautorization.enums.Authorities;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return null;
    }
}