package com.jspring6.SpringJWTproject.dao;

// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jspring6.SpringJWTproject.model.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

    User  findByUsername(String username); // return user by finding the userbyname
}
