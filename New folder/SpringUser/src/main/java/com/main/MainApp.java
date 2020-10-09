package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;
import com.service.UserServiceImp;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/config/new-config.xml");
		UserService userservice=(UserService)context.getBean("hello");
		
		String str=userservice.display("Vishnu");
		System.out.println(str);

	}

}
