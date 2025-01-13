package com.jspring6.springjobproject;

import com.jspring6.springjobproject.model.JobPost;
import com.jspring6.springjobproject.repo.JobRepo;
import com.jspring6.springjobproject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service;
    @RequestMapping({"/", "/home"})
    public String home(){
        return "home";
    }

    @RequestMapping({"/addjob"})
    public String addJob(){
        return "addjob";
    }

// handle the request form with POST
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost)  // this obj is called the DTO , Data transfer object
    {   service.addJob(jobPost);
        return "success";
    }
}

