package com.devcolibri.secure.controller;

import com.devcolibri.secure.entity.User;
import com.devcolibri.secure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getUsers(Model model) {
        List<User> list = userService.getAllUsers();
        model.addAttribute("users",list);
        return "users";
    }
}
