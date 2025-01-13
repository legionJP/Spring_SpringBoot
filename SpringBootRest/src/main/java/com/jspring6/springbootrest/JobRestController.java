package com.jspring6.springbootrest;

import com.jspring6.springbootrest.model.JobPost;
import com.jspring6.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController  // For the Rest we can use the rest-controller and no need of the @ResponseBody annotain
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

//1. Controller to return all the job posts
    @GetMapping("jobPosts")
    //@ResponseBody
    public List<JobPost> getAllJobs() {
        return  service.getAllJobs();
    }

//2. Controller to return Particular Job Post

//    @GetMapping("jobPosts/3")
//  @GetMapping("jobPosts/{postId}/{something}")    // for the dynamic
    @GetMapping("jobPosts/{postId}")    // for the dynamic
    public JobPost getJobById(@PathVariable("postId") int postId)
    {
        return service.getJob(postId);
    }
}
