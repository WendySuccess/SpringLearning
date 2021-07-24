package com.wendy.service;

import com.wendy.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}