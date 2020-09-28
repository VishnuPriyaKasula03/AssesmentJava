package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.User;


public class UserDaoImpl implements UserDao
{
public Connection getConnection()
{
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	try 
	{
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/vishnu_priya"; //server
		Class.forName(driverName);
		con = DriverManager.getConnection(url, "root", "root");
		System.out.println(con != null ? "connection established": "connection failed");
	 }
	catch (ClassNotFoundException cnfe) 
	{
		System.out.println("There is no respective jars : "+ cnfe.getMessage());
	} 
	catch (SQLException se) 
	{
		// Catching SQL Exception
		System.out.println("SQL Exception :" + se.getMessage());
	} 
	catch (Exception e) 
	{
		System.out.println(e);
	}
	return con;
}
public User readUserById(int userId) 
{
// logic read --Get --DB
Statement statement = null; //declare
ResultSet resultSet = null;
User user = null;
Connection connection = getConnection();
try {
statement = connection.createStatement() ;
String query = "select * from user where userid = 10;" ;
resultSet = statement.executeQuery(query);
//iteration
user = new User();
while( resultSet.next())
{
user.setUserId(resultSet.getInt("userid"));
user.setUserName(resultSet.getString("username"));
user.setPassword(resultSet.getString("password"));
}
} catch (SQLException e) {
e.printStackTrace();
} //static query
return user;
}
public User createUser(User user) {
	// TODO Auto-generated method stub
	return null;
}
public User readUserByName(String username) {
	// TODO Auto-generated method stub
	return null;
}
public User readUserByUserIdAndPassword(int userId, String password) {
	// TODO Auto-generated method stub
	return null;
}
public User updateUser(User user) {
	// TODO Auto-generated method stub
	return null;
}
public User deleteUser(int userId) {
	// TODO Auto-generated method stub
	return null;
}
}
