package com.yohtsuka.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yohtsuka.hello.model.User;
import com.yohtsuka.hello.service.UserService;

import org.springframework.ui.Model;

@Controller
public class HelloApplicationController {

    @RequestMapping("/")
    public String test() {
        return "Hello World";
    }

    // paramやメソッドを指定する場合
    @RequestMapping(value = "/test", method = RequestMethod.GET, headers = "Accept=application/*", params = "id=002")
    public String testWithId() {
        return "Test with ID 002";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("users", userList);
        return "users"; // templates/user.html
    }

    @GetMapping("/user")
    public String getUserByParams(@RequestParam("id") int id, Model model) {
        System.out.println("id:" + id);
        User user = userService.getUserByIdAndName(id);
        System.out.println("user:" + user);
        model.addAttribute("user", user);
        return "user";
    }

}