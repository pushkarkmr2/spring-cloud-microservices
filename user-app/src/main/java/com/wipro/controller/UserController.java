package com.wipro.controller;

import com.wipro.dto.UserVO;
import com.wipro.model.User;
import com.wipro.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    void save(@RequestBody UserVO userVO) {
        userService.save(userVO);
    }

    @PutMapping("/user")
    void update(@RequestBody UserVO userVO) {
        userService.save(userVO);
    }

    @GetMapping("/user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }


}


