package com.jspring6.springbootsecproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService  implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        @Autowired
        private UserRepo repo;

       return null;
    } 
     // pass this class object in te config userdeatils service obj 
    
}

// we need to hit the databae to get the username so need to create the repo layer