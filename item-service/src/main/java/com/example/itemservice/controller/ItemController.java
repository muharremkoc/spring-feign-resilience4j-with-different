package com.example.itemservice.controller;

import com.example.itemservice.domain.ItemDto;
import com.example.itemservice.domain.ItemResponseDto;
import com.example.itemservice.domain.User;
import com.example.itemservice.model.Item;
import com.example.itemservice.service.ItemService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;


@RestController
@RequestMapping("/item-service")
public class ItemController {

    final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/item")
    public ItemResponseDto create(@RequestParam Integer userId, @RequestBody ItemDto itemDto){
        return itemService.create(itemDto,userId);
    }

}
