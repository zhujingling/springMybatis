package com.mybatis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;

public class UserController {
	 /**
     * 注入service
     */
    @Resource(name = "userServiceImpl")
    public UserService userService;
    
    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping(value = "/list", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<User> list()
    {
        List<User> users=userService.getUser();
        for(User user:users)
        {
            System.out.println(user);
        }
        return users;
    }
}
