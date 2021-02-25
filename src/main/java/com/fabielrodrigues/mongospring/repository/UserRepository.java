package com.fabielrodrigues.mongospring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fabielrodrigues.mongospring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
