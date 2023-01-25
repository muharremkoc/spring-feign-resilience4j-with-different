package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.dto.UserResponseDto;
import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserDto userDto) {

        User user = new User(userDto.getName());
        return userRepository.save(user);
    }

    @Override
    public UserResponseDto getUser(Integer id) {

        User user = userRepository.findById(id).orElseThrow();

        UserResponseDto userResponseDto= new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());

        return userResponseDto;
    }
}
