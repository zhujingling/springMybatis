package com.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.UserDao;
import com.mybatis.entity.User;
import com.mybatis.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userDao;

	public List<User> getUser() {
		System.out.println("service");
		return this.userDao.getUser();
	}

}
