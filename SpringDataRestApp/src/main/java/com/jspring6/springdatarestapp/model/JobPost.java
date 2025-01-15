package com.jspring6.springdatarestapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
//

@Data
@AllArgsConstructor  // Using the Lombark to make constructor
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
