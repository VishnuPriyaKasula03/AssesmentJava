package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.UserDetails;

public class LoginDetailsImplementation implements LoginDetails{

	ResultSet resultSet = null;
	UserDetails userDetailsDb = new UserDetails();
	public UserDetails getDetails(UserDetails userDetails) {
		try(Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection.prepareStatement("select * from user where userName = ?");
				){
			statement.setString(1, userDetails.getUserName());
			resultSet = statement.executeQuery();
			if(resultSet.next()) {
				userDetailsDb.setUserName(resultSet.getString("userName"));
				userDetailsDb.setPassword(resultSet.getString("password"));
				userDetailsDb.setAge(resultSet.getInt("age"));
				userDetailsDb.setFirstName(resultSet.getString("firstName"));
				userDetailsDb.setLastName(resultSet.getString("lastName"));
				userDetailsDb.setGender(resultSet.getString("gender"));
				return userDetailsDb;
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
