package com.mikesh.Exam.Portal.Controllers;

import com.mikesh.Exam.Portal.Entities.User;
import com.mikesh.Exam.Portal.Repositories.UserRepo;
import com.mikesh.Exam.Portal.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepo repo;

    @PostMapping("/")
    public User registerUser(@RequestBody User user){
        User registeredUser = userService.createUser(user);
        return registeredUser;
    }

    @GetMapping("/")
    public List<User> getAllUser(){
        return repo.findAll();
    }
}
