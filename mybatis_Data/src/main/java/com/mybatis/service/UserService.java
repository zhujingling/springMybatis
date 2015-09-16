package com.mybatis.service;

import java.util.List;

import com.mybatis.entity.User;


public interface UserService {
	  /**
     * @param id
     * @return
     */
    List<User> getUser();
}
