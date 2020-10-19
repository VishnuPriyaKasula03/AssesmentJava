
package com.hcl.pp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.pp.model.User;


@Repository
public class UserDAOImpl implements UserDAO {
	
	//private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addUser(User user) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET")
	public List fetchAll() 
	{
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createQuery("from PETS").list();
		return list;
	}
/*
	@Override
	public void updateUser(User p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("User updated successfully, User Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> UsersList = session.createQuery("from User").list();
		for(User p : UsersList){
			logger.info("User List::"+p);
		}
		return UsersList;
	}

	@Override
	public User getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		User p = (User) session.load(User.class, new Integer(id));
		logger.info("User loaded successfully, User details="+p);
		return p;
	}

	@Override
	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = (User) session.load(User.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("User deleted successfully, User details="+p);
	}*/

}
