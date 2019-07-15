package com.example.demo1.service.impl;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.pojo.Users;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(Users user) {
        userMapper.insertUser(user);

    }

    @Override
    public List<Users> queryUser() {

        return userMapper.queryUser();
    }
}
