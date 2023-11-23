package com.springbootrestful.restfulwebservices.service;

import com.springbootrestful.restfulwebservices.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();
    User updateUser(User user);

    void deleteUser(Long userId);




}
