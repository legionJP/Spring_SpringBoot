package com.jspring6.springbootrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
//
//
//@Data
//@AllArgsConstructor  // Using the Lombok to make constructor
//@NoArgsConstructor
//@Component
//public class JobPost {
//    private int postId;
//    private String postProfile;
//    private String postDesc;
//    private String reqExperience;
//    private List<String> postTechStack;
//}


@Data
@AllArgsConstructor  // Using the Lombok to make constructor
@NoArgsConstructor
@Component

@Entity
public class JobPost {
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private String reqExperience;
    private List<String> postTechStack;
}
