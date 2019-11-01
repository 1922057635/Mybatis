package com.dao;

import java.util.List;

import com.pojo.User;

public interface UserDao {
	public User getUserById(int id);
	public void insertUser(User user);
	public void updateUser(User user);
	public int deleteUser(int Id);
	public List<User> getUserByNameAndNumber(User user);
}
