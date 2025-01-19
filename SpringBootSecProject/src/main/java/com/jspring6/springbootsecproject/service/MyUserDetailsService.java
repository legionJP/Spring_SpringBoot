package com.jspring6.springbootsecproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jspring6.springbootsecproject.dao.UserRepo;
import com.jspring6.springbootsecproject.model.User;

@Service
public class MyUserDetailsService  implements UserDetailsService{

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user= repo.findByUsername(username);
       if(user==null)
       {
        System.out.println("user 404");
        throw new UsernameNotFoundException("404 user Not Found")
       }

        return User;
    } 
     // pass this class object in te config userdeatils service obj 
    
}

// we need to hit the databae to get the username so need to create the repo layer