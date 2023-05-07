package com.mikesh.Exam.Portal.Services;

import com.mikesh.Exam.Portal.Entities.User;

public interface UserService {
    User createUser(User user);
    User getUserByUsername(String username);


}
