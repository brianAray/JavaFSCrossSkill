package com.revature.SpringDataJPA.service;

import com.revature.SpringDataJPA.entity.User;
import com.revature.SpringDataJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    // crud

    // save user entity
    public User saveUser(User user){
        return userRepository.save(user);
    }

    // Get by id
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    // get all users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    // find by name
    public List<User> findByName(String name){
        return userRepository.findAllByName(name);
    }

    // delete user
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
