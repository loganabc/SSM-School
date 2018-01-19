package com.cn.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.school.dao.UserMapper;
import com.cn.school.pojo.User;
import com.cn.school.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

}
