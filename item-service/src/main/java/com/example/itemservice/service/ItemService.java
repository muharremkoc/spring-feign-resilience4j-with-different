package com.example.itemservice.service;

import com.example.itemservice.domain.ItemDto;
import com.example.itemservice.domain.ItemResponseDto;
import com.example.itemservice.domain.User;
import com.example.itemservice.domain.UserResponseDto;
import com.example.itemservice.model.Item;

public interface ItemService {

    ItemResponseDto create(ItemDto itemDto, Integer userId);

}
