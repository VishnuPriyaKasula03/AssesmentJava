package com.dao;

import org.springframework.stereotype.Repository;

@Repository(value="UserDao")
public class UserDaoImp implements UserDao {

	@Override
	public String readByName(String arg) 
	{
		 
		return "From dao layer"+arg;
	}

}
