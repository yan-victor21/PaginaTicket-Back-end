package com.yanvictor.HelpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yanvictor.HelpDesk.api.security.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

}
