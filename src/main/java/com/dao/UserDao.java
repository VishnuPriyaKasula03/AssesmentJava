package com.dao;

import com.model.User;

public interface UserDao 
{
	//CRUD(POJO --->user)
	public abstract User createUser(User user);

	public abstract User readUserById(int userId);

	public abstract User readUserByName(String username);

	public abstract User readUserByUserIdAndPassword(int userId, String password);

	public abstract User updateUser(User user);

	public abstract User deleteUser(int userId);
	
}
