package com.devcolibri.secure.service;

import com.devcolibri.secure.entity.User;

import java.util.List;

public interface UserService {

    User getUser(String login);
    List<User> getAllUsers();
    Integer createUser(User user);

}
