#
# Spring Boot Rest API 

# JobRest Controller 

```markdown
It gives the error when we put the @Controller and not returing 
the Views. 
- We need to return the data as the JSON Data 
- to solve it be need to use the annotation as the @ResponseBody 


```

# Rest Controller 
```markdown
for the rest-controller what ever is returned treated as the body 
```

# Connecting the React and Spring to get Data

```java

//@Controller
@RestController  // For the Rest we can use the rest-controller and no need of the @ResponseBody annotain
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    //@ResponseBody
    public List<JobPost> getAllJobs() {
        return  service.getAllJobs();
    }
}

```
# path Variable (Getting data by ID)

```java

//2. Controller to return Particular Job Post
    
//    @GetMapping("jobPosts/3")
//  @GetMapping("jobPosts/{postId}/{something}")    // for the dynamic
    @GetMapping("jobPosts/{postId}")    // for the dynamic
    public JobPost getJobById(@PathVariable("postId") int postId)
    {
        return service.getJob(postId);
    }
};
```

# Sending the Data  and Request Body 

```java


```