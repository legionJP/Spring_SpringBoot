package com.jspring6.springbootrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jspring6.springbootrest.model.User;
import com.jspring6.springbootrest.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user)
    {
        // setting the password with encoder
        user.setPassword(encoder.encode(user.getPassword()));
        
        System.out.println(user.getPassword());
        return  repo.save(user);  // using the Jpa
    }
}
