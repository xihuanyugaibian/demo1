package com.example.demo1.service;

import com.example.demo1.pojo.Users;

import java.util.List;

public interface UserService {
    void addUser(Users user);

    List<Users> queryUser();
}
