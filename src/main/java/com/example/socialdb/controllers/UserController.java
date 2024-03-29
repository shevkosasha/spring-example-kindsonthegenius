package com.example.socialdb.controllers;

import com.example.socialdb.services.UserService;
import com.example.socialdb.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id).get();
    }

    @RequestMapping(value="/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
    public void getUser(@PathVariable String id, @RequestBody User user) {
        userService.updateUser(id, user);
    }
}
