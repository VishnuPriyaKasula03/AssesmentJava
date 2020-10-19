
package com.hcl.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.pp.dao.UserDAO;
import com.hcl.pp.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO UserDAO;

	@Transactional
	public void addUser(User user) 
	{
		UserDAO.addUser(user);
		
	}

	

	/*@Override
	@Transactional
	public void updateUser(User p) {
		this.UserDAO.updateUser(p);
	}

	@Override
	@Transactional
	public List<User> listUsers() {
		return this.UserDAO.listUsers();
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return this.UserDAO.getUserById(id);
	}

	@Override
	@Transactional
	public void removeUser(int id) {
		this.UserDAO.removeUser(id);
	}
*/
}
