package com.mikesh.Exam.Portal.Services.ServicesImpl;

import com.mikesh.Exam.Portal.Entities.User;
import com.mikesh.Exam.Portal.Repositories.UserRepo;
import com.mikesh.Exam.Portal.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
//        return userRepo.findBy(username);
        return null;
    }
}
