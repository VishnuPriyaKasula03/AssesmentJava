package services;

import dao.RegistrationDetails;
import dao.RegistrationDetailsImplementation;
import model.UserDetails;

public class RegistrationServiceImplementation implements RegistrationService{

	RegistrationDetails registrationDetails = new RegistrationDetailsImplementation();
	@Override
	public boolean getNewUserDetails(UserDetails userDetails) {
		if(registrationDetails.insertNewUserDetails(userDetails)!=0) {
			return true;
		}
		return false;
	}

}
