package com.devcolibri.secure.service;

import com.devcolibri.secure.dao.UserRepository;
import com.devcolibri.secure.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    
    //   @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }


    public List<User> getAllUsers() {
        return this.userRepository.getAllUsers();
    }

    public Integer createUser(User user) {
        return this.userRepository.createUser(user);
    }
}
