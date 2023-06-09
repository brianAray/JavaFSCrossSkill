package com.revature.SpringDataJPA.controller;

import com.revature.SpringDataJPA.dto.UserDTO;
import com.revature.SpringDataJPA.entity.User;
import com.revature.SpringDataJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getUserList(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        Optional<User> optionalUser = userService.getUserById(Long.parseLong(id));
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }else{
            return null;
        }
    }

    @PostMapping()
    public User postUser(@RequestBody UserDTO user){
        return userService.saveUser(user);
    }

}
