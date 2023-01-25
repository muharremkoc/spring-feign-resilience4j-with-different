package com.example.itemservice.client;

import com.example.itemservice.domain.User;
import com.example.itemservice.domain.UserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service", url = "http://localhost:1327/user-service")
public interface ApiFeignClient {


    @GetMapping("/user/{id}")
    UserResponseDto getUser(@PathVariable("id") Integer id);
}
