package com.mikesh.Exam.Portal.Entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "User")
public class User {
    private String firstName;
    private String lastName;
    private String email; // TODO : email constrains
    private String username; // TODO : username unique constraint
    private String password; // TODO : password constrains
}
