package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

public class ConnectionManager {
	
	static Connection connection = null;
	static String url = "jdbc:mysql://localhost/loginapplication";
	public static Connection getConnection() {
		//Properties properties = new Properties();
		try/*(FileInputStream fileInputStream = new FileInputStream("../Database1.prop"))*/ {
			
			  Class.forName("com.mysql.jdbc.Driver"); 
			  connection =DriverManager.getConnection(url,"root", "");
			 
			//properties.load(fileInputStream);
			//Class.forName(properties.getProperty("driver"));
			//connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("userName"),properties.getProperty("password"));
//			connection = DriverManager.getConnection(url,"root","");
		}
		catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
