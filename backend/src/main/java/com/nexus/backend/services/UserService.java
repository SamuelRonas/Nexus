package com.nexus.backend.services;

import org.springframework.stereotype.Service;

import com.nexus.backend.interfaces.UserRepository;
import com.nexus.backend.user.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}
