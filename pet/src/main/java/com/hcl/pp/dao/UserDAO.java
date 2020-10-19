package com.hcl.pp.dao;

import java.util.List;

import com.hcl.pp.model.User;

public interface UserDAO 
{
	public void addUser(User user);

	public List fetchAll();
}
