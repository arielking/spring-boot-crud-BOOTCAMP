package com.unilever.developer.controller;

import com.unilever.developer.domain.User;
import com.unilever.developer.repository.UserRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @GetMapping("user/{id}")
    public User getUser(@PathVariable Long id) {

        Optional<User> optUser = userRepository.findById(id); // returns java8 optional
        if (optUser.isPresent()) {
            return optUser.get();
        } else {
            // handle not found, return null or throw
            return null;
        }


    }
    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable Long id) { userRepository.deleteById(id);
        return true;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }


}
