package com.demo.learn.DTO;

public record ProductRecord(
        long id,
        String title,
        double price,
        String description,
        String category,
        String image,
        Rating rating){}
