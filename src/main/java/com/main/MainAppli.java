package com.main;
import java.sql.Connection;
import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class MainAppli {

	public static void main(String[] args) 
	{
		UserDao daoImpl=new UserDaoImpl();
		User obj = daoImpl.readUserById(10);
		if(obj!=null)
		{
			System.out.println("Main user id:"+obj.getUserId());
			System.out.println("Main user name:"+obj.getUserName());
		}
		else
		{
			System.out.println("No match");
		}
	}

}
