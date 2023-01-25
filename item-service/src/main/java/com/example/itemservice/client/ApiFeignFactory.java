package com.example.itemservice.client;

import com.example.itemservice.domain.UserResponseDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.webjars.NotFoundException;

@Component
public class ApiFeignFactory implements ApiFeignClient {




    final ApiFeignClient apiFeignClient;

    public ApiFeignFactory(    @Qualifier("com.example.itemservice.client.ApiFeignClient") ApiFeignClient apiFeignClient) {
        this.apiFeignClient = apiFeignClient;
    }

    @Override
    @CircuitBreaker(name ="user-service",fallbackMethod = "orderFallBack")
    public UserResponseDto getUser(Integer id) {
        return apiFeignClient.getUser(id);
    }

    public UserResponseDto orderFallBack(Exception e) throws NotFoundException {

        return new UserResponseDto();

    }
}
