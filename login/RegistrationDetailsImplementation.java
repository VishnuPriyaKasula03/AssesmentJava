package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.UserDetails;

public class RegistrationDetailsImplementation implements RegistrationDetails{

	@Override
	public int insertNewUserDetails(UserDetails userDetails) {
		try (Connection connection = ConnectionManager.getConnection();
				PreparedStatement statement = connection
						.prepareStatement("insert into user values(?,?,?,?,?,?)");) {

			statement.setString(1, userDetails.getUserName());
			statement.setString(2, userDetails.getPassword());
			statement.setString(3, userDetails.getFirstName());
			statement.setString(4, userDetails.getLastName());
			statement.setInt(5, userDetails.getAge());
			statement.setString(6, userDetails.getGender());
			return statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
