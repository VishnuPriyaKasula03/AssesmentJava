package services;

import dao.LoginDetails;
import dao.LoginDetailsImplementation;
import model.UserDetails;

public class LoginValidationImplementation implements LoginValidation{
	
	LoginDetails loginDetails = new LoginDetailsImplementation();
	public UserDetails validation(UserDetails userDetails) {
		UserDetails userDetailsDb = loginDetails.getDetails(userDetails);
		if(userDetailsDb!=null) {
			if((userDetailsDb.getUserName().equals(userDetails.getUserName()))&&(userDetailsDb.getPassword().equals(userDetails.getPassword()))) {
				return userDetailsDb;
			}
		}
		return null;
	}

}
