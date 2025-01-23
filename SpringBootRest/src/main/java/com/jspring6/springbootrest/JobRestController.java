package com.jspring6.springbootrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspring6.springbootrest.model.JobPost;
import com.jspring6.springbootrest.model.User;
import com.jspring6.springbootrest.service.JobService;
import com.jspring6.springbootrest.service.UserService;


//@Controller
@RestController  // For the Rest we can use the rest-controller and no need of the @ResponseBody annotain
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;
    @Autowired
    private JobPost jobPost;

    //1. Controller to return all the job posts
   // @GetMapping(path = "jobPosts", produces = {"application/json"})
    @GetMapping(value = "jobPosts")
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

// 3 Add job Controller using the API endpoint

    @PostMapping("jobPosts")
   // @PostMapping(path = "jobPosts", consumes = {"application/xml"})
//    public void addJob(@RequestBody JobPost jobPost) // to accept the json data body
    public JobPost addJob(@RequestBody JobPost jobPost) // to accept the json data body
    {
        service.addJob(jobPost);
//        return jobPost;
        // returning the data from where  it is saved
        return service.getJob(jobPost.getPostId());
    }

    // 4. JobPost Put Method

    @PutMapping("jobPosts")   // same url but diferent Methods
    public JobPost updateJob(@RequestBody JobPost jobPost)
    {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    //5. JobPost delete

    @DeleteMapping("jobPosts/{postId}")
    public String deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
        return "Success, Deleted JOB Post: ";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "Success";
    }

    // Getting the job by the keyword below is by the job id

    // @GetMapping("jobPosts/{postId}")    // for the dynamic
    // public JobPost getJobById(@PathVariable("postId") int postId)
    // {
    //     return service.getJob(postId);
    // }

        @GetMapping("jobPosts/keyword/{keyword}")
       public List<JobPost> searchbyKeyword(@PathVariable("keyword") String keyword)
       {
            return service.search(keyword);
       }

    @Autowired
    private UserService userService;
    
// registering the user 
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}
