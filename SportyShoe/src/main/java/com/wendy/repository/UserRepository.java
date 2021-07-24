package com.wendy.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}