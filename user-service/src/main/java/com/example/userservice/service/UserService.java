package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.dto.UserResponseDto;
import com.example.userservice.model.User;

public interface UserService {

    User create(UserDto userDto);

    UserResponseDto getUser(Integer id);


}
