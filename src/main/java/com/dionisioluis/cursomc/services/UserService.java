package com.dionisioluis.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.dionisioluis.cursomc.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		//try and catch exceptions
		try {
			//* return user login in system 
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} 
		
		catch (Exception e) {
			return null;

		}
	}

}
