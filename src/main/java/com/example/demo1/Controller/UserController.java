package com.example.demo1.Controller;

import com.example.demo1.pojo.Users;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page) {
        System.out.println(123456);
        return page;
    }

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        System.out.println(users.getAge() + ":" + users.getName());
        userService.addUser(users);
        return "ok";
    }

    @RequestMapping("/queryUser")
    public String queryUser(Model model) {
        System.out.println("12345");
        System.out.println("这是一段汉字");
        List<Users> list = userService.queryUser();
        model.addAttribute("list", list);
        return "queryUser";
    }

}
