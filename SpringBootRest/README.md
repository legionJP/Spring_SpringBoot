#
# Spring Boot Rest API 

# JobRest Controller 

```markdown
It gives the error when we put the @Controller and not returing 
the Views. 
We need to return the data as the JSON Data 
to solve it be need to use the annotation as the @ResponseBody 


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


// Add job Controller using the API endpoint
    @PostMapping("jobPosts")
    //    public void addJob(@RequestBody JobPost jobPost) // to accept the json data body
    public JobPost addJob(@RequestBody JobPost jobPost) // to accept the json data body
    {
        service.addJob(jobPost);
//        return jobPost;
        // returning the data from where  it is saved
        return service.getJob(jobPost.getPostId());
    }
```
# Put and Delete Mapping 
```java
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
```
# Repo Logic to delete and update  the data 

```java

// updating the job using the put
    public void updateJob(JobPost jobPost) {
        for (JobPost jobPost1 : jobs) {
            if (jobPost1.getPostId() == jobPost.getPostId()) {
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setPostId(jobPost.getPostId());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());

            }
        }
    }
//2.

    public void deleteJob(int postId) {
        Iterator<JobPost> iterator = jobs.iterator();
        while (iterator.hasNext()) {
            JobPost jobPost = iterator.next();
            if (jobPost.getPostId() == postId) {
                iterator.remove();  // Safely remove using the iterator
                return;  // Exit the method after removing the item
            }
        }
    }

}

    
```

# Content Negotiation

### 2. Only Producing  the JSON or 
```markdown
        @PostMapping(path = "jobPosts", consumes = {"application/xml"})
//    public void addJob(@RequestBody JobPost jobPost) // to accept the json data body
         public JobPost addJob(@RequestBody JobPost jobPost) // to accept the json data body
    {
        service.addJob(jobPost);
//        return jobPost;
        // returning the data from where  it is saved
        return service.getJob(jobPost.getPostId());
    }


```
### 1. XML jackson library to convert the java object into xml data
```markdown
To get the data in the xml form by get request in the api tool 
pu the headers Key: Accept , Value: application/xml 
But this will give the 406 error as the Not acceptable 
Bcz when serializing the data , but in the server
u are returning the data in list but the client side 
return it into the JSON by using jackson , by default the 
jackson only work with the json not xml 
so add the dependencies in pom.xml for the jackson xml 

```
### 3. Only consuming the JSON 

```java

//    @PostMapping("jobPosts")
    @PostMapping(path = "jobPosts", consumes = {"application/xml"})
//    public void addJob(@RequestBody JobPost jobPost) // to accept the json data body
    public JobPost addJob(@RequestBody JobPost jobPost) // to accept the json data body
    {
        service.addJob(jobPost);
//        return jobPost;
        // returning the data from where  it is saved
        return service.getJob(jobPost.getPostId());
    }

```