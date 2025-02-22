package com.jspring6.springjobproject.service;

import com.jspring6.springjobproject.model.JobPost;
import com.jspring6.springjobproject.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    // get all jobs list
    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    // method to add data
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }


    public List<JobPost> returnAllJobPosts() {
        return repo.returnAllJobPosts();
    }
}
