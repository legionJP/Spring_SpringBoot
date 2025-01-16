package com.jspring6.springbootrestaop.service;

import com.jspring6.springbootrestaop.model.JobPost;
import com.jspring6.springbootrestaop.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Service
//public class JobService {
//
//    @Autowired
//    public JobRepo repo;
//
//    // get all jobs list
//    public List<JobPost> getAllJobs(){
//        return repo.getAllJobs();
//    }
//
//    // method to add job post data
//    public void addJob(JobPost jobPost) {
//        repo.addJob(jobPost);
//    }
//
//
//    public List<JobPost> returnAllJobPosts() {
//        return repo.returnAllJobPosts();
//    }
//
//    public JobPost getJob(int postId) {
//        return  repo.getJob(postId);
//    }
//
//    public void updateJob(JobPost jobPost) {
//        repo.updateJob(jobPost);
//    }
//
//    public void deleteJob(int postId) {
//        repo.deleteJob(postId);
//    }
//}
//

// FOR JPA use

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    // get all jobs list
    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    // method to add job post data
    public void addJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public JobPost getJob(int postId) {
        // int num =10/0;
        return  repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load()
    {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Must have good understating in Java", "1", Arrays.asList("Java Developer")),
                new JobPost(2, "Java Developer", "Must have best understating in Java", "1", Arrays.asList("Java Developer")),
                new JobPost(3, "Java Developer", "Must have excellent understating in Java", "1", Arrays.asList("Java Developer")),
                new JobPost(4, "Java Developer", "Must have better understating in Java", "1", Arrays.asList("Java Developer")),
                new JobPost(5, "Python Developer", "Must have good understating in Py", "1", Arrays.asList("Python Developer"))
        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }

}
