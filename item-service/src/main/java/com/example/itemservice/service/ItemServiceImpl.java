package com.example.itemservice.service;

import com.example.itemservice.client.ApiFeignClient;
import com.example.itemservice.domain.ItemDto;
import com.example.itemservice.domain.ItemResponseDto;
import com.example.itemservice.domain.User;
import com.example.itemservice.domain.UserResponseDto;
import com.example.itemservice.model.Item;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
public class ItemServiceImpl implements ItemService{

  final  ApiFeignClient apiFeignClient;


    public ItemServiceImpl(@Qualifier("apiFeignFactory") ApiFeignClient apiFeignClient) {
        this.apiFeignClient = apiFeignClient;
    }

    @Override
    public ItemResponseDto create(ItemDto itemDto, Integer userId) {
        ItemResponseDto itemResponseDto= new ItemResponseDto();

        Item item = new Item(itemDto.getId(),itemDto.getItemName());
        itemResponseDto.setItem(item);
        itemResponseDto.setUserResponseDto(apiFeignClient.getUser(userId));
        return itemResponseDto;
    }

}
