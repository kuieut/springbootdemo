package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.User;

import java.util.List;

public interface UserDao {

    List<User> selectUsers();

}
