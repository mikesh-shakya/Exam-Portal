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

    @GetMapping("/")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }


}
