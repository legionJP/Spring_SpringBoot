package com.jspring6.springdatarestapp.repo;
import com.jspring6.springdatarestapp.model.JobPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

@Repository
// It will have all the data for returning the data for the service
public interface JobRepo extends JpaRepository<JobPost , Integer> {

    
}
