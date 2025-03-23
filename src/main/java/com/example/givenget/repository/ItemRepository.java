package com.example.givenget.repository;

import com.example.givenget.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ItemRepository extends MongoRepository<Item, String> {
    List<Item> findByDonorId(String donorId);
}
