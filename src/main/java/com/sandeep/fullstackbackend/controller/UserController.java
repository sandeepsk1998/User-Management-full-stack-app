package com.sandeep.fullstackbackend.controller;


import com.sandeep.fullstackbackend.exception.UserNotFoundException;
import com.sandeep.fullstackbackend.model.User;
import com.sandeep.fullstackbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepo;

    @PostMapping("/user" )
    User addUser(@RequestBody User newuser){
        return userRepo.save(newuser);
    }


    @GetMapping ("/users")
    List<User> getAllUser(){
        return userRepo.findAll();
    }

    @GetMapping ("/users/{id}")
    User getAllUser(@PathVariable Long id){
        return userRepo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @PutMapping("/users/{id}")
    User updateUser(@RequestBody User newuser, @PathVariable Long id){
     return userRepo.findById(id).map( user ->{
         user.setUsername(newuser.getUsername());
         user.setName(newuser.getName());
         user.setEmail(newuser.getEmail());
         return userRepo.save(user);
     }).orElseThrow(()-> new UserNotFoundException(id));
    }

    @DeleteMapping("/users/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepo.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepo.deleteById(id);
        return "User with id" +id+"has been removed";
    }


}
