package com.jspring6.springjobproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
//

@Data
@AllArgsConstructor  // Using the Lombark to make constructor
@NoArgsConstructor
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private String reqExperience;
    private String postTechStack;
}
