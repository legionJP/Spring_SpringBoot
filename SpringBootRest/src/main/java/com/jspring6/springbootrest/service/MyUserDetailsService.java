package com.jspring6.springbootrest.service;

// import java.nio.file.attribute.UserPrincipal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jspring6.springbootrest.model.User;
import com.jspring6.springbootrest.model.UserPrincipal;
import com.jspring6.springbootrest.repo.UserRepo;



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
        throw new UsernameNotFoundException("404 user Not Found");
       }

        return new UserPrincipal(user);
    } 
     // pass this class object in te config userdeatils service obj 
    
}

// we need to hit the databae to get the username so need to create the repo layer