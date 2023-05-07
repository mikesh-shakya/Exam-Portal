package com.mikesh.Exam.Portal.Repositories;

import com.mikesh.Exam.Portal.Entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface questionRepo extends MongoRepository<Question, String> {

}
