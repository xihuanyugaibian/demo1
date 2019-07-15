package com.example.demo1.mapper;

import com.example.demo1.pojo.Users;

import java.util.List;

public interface UserMapper {
    void insertUser(Users user);

    List<Users> queryUser();
}
