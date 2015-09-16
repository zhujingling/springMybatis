package com.mybatis.dao;

import java.util.List;


import com.mybatis.entity.User;


public interface UserDao {
	/**
	 * 根据id获取用户
	 * 
	 * @param id
	 * @return User
	 */
	List<User> getUser();

}
