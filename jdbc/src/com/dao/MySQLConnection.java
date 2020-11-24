package com.dao;

import java.sql.Connection;//interface
import java.sql.DriverManager;//Class
import java.sql.ResultSet;//interface
import java.sql.SQLException;
import java.sql.Statement;//interface

public class MySQLConnection {
 public static void main(String[] args) {
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
try {
String driverName = "com.mysql.cj.jdbc.Driver";//newer version add .cj.
String url = "jdbc:mysql://localhost:3306/vishnu_priya?useSSL=false"; //server
Class.forName(driverName);
con = DriverManager.getConnection(url, "root", "root");
System.out.println(con != null ? "connection established": "connection failed");

 }
catch (ClassNotFoundException cnfe) 
{
System.out.println("There is no respective jars : "+ cnfe.getMessage());
} 
catch (SQLException se) 
{// Catching SQL Exception
	System.out.println("SQL Exception :" + se.getMessage());
} 
catch (Exception e) 
{
System.out.println(e);
}
finally 
{
try 
{
con.close();
} 
catch (SQLException e)
{
e.printStackTrace();
}
}
}
}