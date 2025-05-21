package com.learntrack.learn_track_server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learntrack.learn_track_server.model.StudentProgress;

@Repository
public interface StudentProgressRepository extends MongoRepository<StudentProgress, String> {
}
