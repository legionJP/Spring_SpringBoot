package com.jspring6.springbootrest.repo;
import com.jspring6.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
// It will have all the data for returning the data for the service
public class JobRepo {

    List<JobPost>  jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Must have good understating in Java","1", Collections.singletonList("Java Developer")),
            new JobPost(2,"Java Developer","Must have good understating in Java","1", Collections.singletonList("Java Developer")),
            new JobPost(3,"Java Developer","Must have good understating in Java","1", Collections.singletonList("Java Developer")),
            new JobPost(4,"Java Developer","Must have good understating in Java","1", Collections.singletonList("Java Developer")),
            new JobPost(5,"Java Developer","Must have good understating in Java","1", Collections.singletonList("Java Developer"))
    ));

    public List<JobPost> getAllJobs()
    {
        return jobs;
    }

    public void addJob(JobPost job)
    {
        jobs.add(job);
        System.out.println(jobs);
    }

    public List<JobPost> returnAllJobPosts() {
        return jobs;
    }

    // returning the matching post
    public JobPost getJob(int postId) {
        for(JobPost job: jobs)
        {
            if(job.getPostId() ==postId)
                return job;
        }
        return null;
    }
}
