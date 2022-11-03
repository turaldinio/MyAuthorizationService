package ru.guluev.serviceforautorization.repository;

import org.springframework.stereotype.Repository;
import ru.guluev.serviceforautorization.enums.Authorities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Repository
public class UserRepository {
    private ConcurrentMap<String, String> map = new ConcurrentHashMap();

    public List<Authorities> getUserAuthorities(String user, String password) {
        String currentMapValue = map.get(user);
        if (currentMapValue != null && currentMapValue.equals(password)) {
            List<Authorities> result = new ArrayList<>();
            result.add(Authorities.READ);
            return result;
        }
        return null;
    }

    public List<Authorities> addUser(String userName, String userPassword) {
        map.put(userName, userPassword);
        List<Authorities> list = new ArrayList<>();
        list.add(Authorities.WRITE);
        return list;
    }

}