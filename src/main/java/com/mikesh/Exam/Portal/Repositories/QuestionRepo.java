package com.mikesh.Exam.Portal.Repositories;

import com.mikesh.Exam.Portal.Entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends MongoRepository<Question, String> {

}
