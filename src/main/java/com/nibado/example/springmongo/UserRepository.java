package com.nibado.example.springmongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nibado.example.springmongo.pojo.User;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByEmail(String email);
}
