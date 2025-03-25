package com.example.givenget.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public record user(
		@Id
		String userId,
		String email,
		String address,
		String password,
		String phoneNum,
		String selfIntro,
		Date registDate,
		Item[] postItems,
		Item[] likedItems,
		Item[] receivedItems
) {}
