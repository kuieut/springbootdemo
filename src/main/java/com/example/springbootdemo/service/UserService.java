package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
