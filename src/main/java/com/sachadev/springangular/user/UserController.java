package com.sachadev.springangular.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://ng-code-source.s3-website-eu-west-1.amazonaws.com")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody UserEntity user) {
        userRepository.save(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userRepository.deleteById((long) userId);
    }
}
