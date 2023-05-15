package com.mikesh.Exam.Portal.Services.ServicesImpl;

import com.mikesh.Exam.Portal.Entities.Question;
import com.mikesh.Exam.Portal.Repositories.QuestionRepo;
import com.mikesh.Exam.Portal.Services.QuestionService;
import com.mongodb.client.*;
import com.mongodb.client.model.Aggregates;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Value("${spring.data.mongodb.uri}")
    String uri;
    @Autowired
    private QuestionRepo questionRepo;
    @Override
    public Question create(Question question) {
        return questionRepo.save(question);
    }
    @Override
    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }
    @Override
    public String getRandomQuestion() {
        try (MongoClient clients = MongoClients.create(uri)){
            MongoDatabase mongoDatabase = clients.getDatabase("Catolorian");
            MongoCollection<Document> collection = mongoDatabase.getCollection("Question");
//            Bson query = eq("countries", "Spain"); // Example Query
//            long numberOfQuestions = collection.estimatedDocumentCount();
//            System.out.println(numberOfQuestions);
            AggregateIterable<Document> question = collection.aggregate(List.of(Aggregates.sample(1)));
            for (Document document : question) {
                return document.toJson();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Some issue is there...";
    }
}
