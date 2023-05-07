package com.mikesh.Exam.Portal.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Catolorian")
public class Question {
    @Id
    private String questionId;
    private String question;
    private String[] options;
    private String correctAnswer;

}
