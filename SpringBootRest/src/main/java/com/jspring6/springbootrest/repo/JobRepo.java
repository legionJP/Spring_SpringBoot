package com.jspring6.springbootrest.repo;
import com.jspring6.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    // method using the DSL in Spring JPA 
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
    // I will hit this query 
    // Hibernate: select jp1_0.post_id,jp1_0.post_desc,jp1_0.post_profile,jp1_0.post_tech_stack,jp1_0.req_experience from job_post jp1_0 where jp1_0.post_profile like ? escape '\' or jp1_0.post_desc like ? escape '\'


}


// comment when Using JPA
//
//@Repository
//// It will have all the data for returning the data for the service
//public class JobRepo {


//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer", "Must have good understating in Java", "1", Collections.singletonList("Java Developer")),
//            new JobPost(2, "Java Developer", "Must have good understating in Java", "1", Collections.singletonList("Java Developer")),
//            new JobPost(3, "Java Developer", "Must have good understating in Java", "1", Collections.singletonList("Java Developer")),
//            new JobPost(4, "Java Developer", "Must have good understating in Java", "1", Collections.singletonList("Java Developer")),
//            new JobPost(5, "Java Developer", "Must have good understating in Java", "1", Collections.singletonList("Java Developer"))
//    ));
//
//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    public void addJob(JobPost job) {
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public List<JobPost> returnAllJobPosts() {
//        return jobs;
//    }
//
//    // returning the matching post
//    public JobPost getJob(int postId) {
//        for (JobPost job : jobs) {
//            if (job.getPostId() == postId)
//                return job;
//        }
//        return null;
//    }
//
//    // updating the job using the put
//    public void updateJob(JobPost jobPost) {
//        for (JobPost jobPost1 : jobs) {
//            if (jobPost1.getPostId() == jobPost.getPostId()) {
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDesc(jobPost.getPostDesc());
//                jobPost1.setPostId(jobPost.getPostId());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//
//            }
//        }
//    }
//
////    public void deleteJob(int postId) {
////        // jobs.removeIf(jobPost -> jobPost.getPostId() == postId); // collection loop
////        for (JobPost jobPost : jobs) {
////            if (jobPost.getPostId() == postId) {
////                jobs.remove(jobPost);
////            }
////        }
////    }
//
//    public void deleteJob(int postId) {
//        Iterator<JobPost> iterator = jobs.iterator();
//        while (iterator.hasNext()) {
//            JobPost jobPost = iterator.next();
//            if (jobPost.getPostId() == postId) {
//                iterator.remove();  // Safely remove using the iterator
//                return;  // Exit the method after removing the item
//            }
//        }
//    }

//}




// _____________________________________________________________________________
/*
// loop to delete the post :
 for(JobPost jobPost: jobs){
            if(jobPost.getPostId() == postId)
            {
                jobs.remove(jobPost);
            }
 */