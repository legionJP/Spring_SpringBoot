package com.jspring6.springbootsecproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspring6.springbootsecproject.dao.UserRepo;
import com.jspring6.springbootsecproject.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    public User saveUser(User user)
    {
        return  repo.save(user);  // using the Jpa
    }
}
