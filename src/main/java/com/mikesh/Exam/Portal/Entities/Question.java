package com.mikesh.Exam.Portal.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Document(collection = "Question")
public class Question {
    private String question;
    private Map<String, Boolean> options;
    private String explaination; // TODO : optimise

}
