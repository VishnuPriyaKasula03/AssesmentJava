package com.service;

import org.springframework.stereotype.Service;

@Service("seecond")
public class UserServiceImp2 implements UserService {

	@Override
	public String display() {
		return "From second user service implementation";			
	}

}
