package com.learn.springsecurity.repository;

import com.learn.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUsername(Long username);
}
