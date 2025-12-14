package com.fitness.activityservice;

import com.fitness.activityservice.dto.ActivityRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends MongoRepository<ActivityRequest, String> {
}
