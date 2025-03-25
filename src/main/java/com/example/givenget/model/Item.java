package com.example.givenget.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "items")
public record Item(
        @Id
        String id,
        String title,
        String description,
        String category,
        List<String> imageUrls,
        String location,
        String donorId,
        String[] whoIntrest,
        String receiverId,
        LocalDateTime createdAt
) {}
