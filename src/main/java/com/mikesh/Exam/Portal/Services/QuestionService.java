package com.mikesh.Exam.Portal.Services;

import com.mikesh.Exam.Portal.Entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> getAllQuestions();
    String getRandomQuestion();

}
