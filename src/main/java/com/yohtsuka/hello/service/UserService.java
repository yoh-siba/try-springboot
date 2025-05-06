package com.yohtsuka.hello.service;

import com.yohtsuka.hello.model.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User(11111, "Yoh"),
                new User(22222, "Yoh2"),
                new User(33333, "Yoh3"));
    }

    public User getUserByIdAndName(int id) {
        if (id == 1111) {
            return new User(id, "Yoh");
        } else if (id == 2222) {
            return new User(id, "Yoh2");
        } else if (id == 3333) {
            return new User(id, "Yoh3");
        }
        return new User(id, "name not found");
    }
}
