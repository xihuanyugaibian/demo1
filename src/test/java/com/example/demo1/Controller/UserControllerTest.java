package com.example.demo1.Controller;

import com.example.demo1.Demo1Application;
import com.example.demo1.pojo.Users;
import com.example.demo1.service.UserService;
import com.example.demo1.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Demo1Application.class})
public class UserControllerTest {
    @Autowired
    private UserService userService = new UserServiceImpl();

    @Test
    public void addUser() {
        Users users = new Users();
        users.setAge(22);
        users.setName("江瑞连");
        userService.addUser(users);
    }
}