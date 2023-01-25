package com.example.itemservice.domain;

import com.example.itemservice.model.Item;

public class ItemResponseDto {

    Item item;

    UserResponseDto userResponseDto;


    public ItemResponseDto() {
    }

    public ItemResponseDto(Item item, UserResponseDto userResponseDto) {
        this.item = item;
        this.userResponseDto = userResponseDto;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public UserResponseDto getUserResponseDto() {
        return userResponseDto;
    }

    public void setUserResponseDto(UserResponseDto userResponseDto) {
        this.userResponseDto = userResponseDto;
    }
}
