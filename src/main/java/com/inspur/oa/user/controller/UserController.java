package com.inspur.oa.user.controller;

import com.inspur.oa.user.domain.User;
import com.inspur.oa.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangpengwei
 * Date: 13-11-27
 * Time: 下午2:39
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("all")
    public String queryAllUser(){

        List<User> users =  userService.getAllUsers();

        for (User user:users)
            System.out.println(user.getPassword());
        return "index";
    }
}
