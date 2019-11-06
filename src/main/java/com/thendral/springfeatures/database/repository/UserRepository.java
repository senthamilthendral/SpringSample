package com.thendral.springfeatures.database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thendral.springfeatures.database.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
