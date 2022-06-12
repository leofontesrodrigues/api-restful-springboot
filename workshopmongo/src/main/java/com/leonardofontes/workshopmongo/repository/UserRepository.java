package com.leonardofontes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardofontes.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
