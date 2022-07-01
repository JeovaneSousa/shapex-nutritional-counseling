package com.barbosa.nutrex.controller;

import com.barbosa.nutrex.entity.User;
import com.barbosa.nutrex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shapex-users")
public class Controller {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("/new-user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok().body("User saved.");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
        return ResponseEntity.ok().body("User Deleted.");
    }
}
