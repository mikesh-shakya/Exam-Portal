package com.mikesh.Exam.Portal.Services;

import com.mikesh.Exam.Portal.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserByUsername(String username);

}
