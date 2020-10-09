package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.dao.UserDao;

@Service("hello")
public class UserServiceImp implements UserService 
{
	
	@Override
	public String display(String str) 
	{
		String ret="";
		if(str.length()>3)
		{
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/config/dao-config.xml");
		UserDao userdao=(UserDao)context.getBean("UserDao");
		ret=userdao.readByName(str);
		}
		return ret;
	}
}
