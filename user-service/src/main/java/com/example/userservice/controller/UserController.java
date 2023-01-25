package com.example.userservice.controller;

import com.example.userservice.dto.UserDto;
import com.example.userservice.dto.UserResponseDto;
import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User create(@RequestBody UserDto userDto){
        return userService.create(userDto);
    }

    @GetMapping(value = "/user/{id}")
    public UserResponseDto getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}
