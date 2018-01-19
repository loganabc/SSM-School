package com.cn.school.dao;

import com.cn.school.pojo.User;

public interface UserMapper {
	
	public User selectByPrimaryKey(int userId);

}
