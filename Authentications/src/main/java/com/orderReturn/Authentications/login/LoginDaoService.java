package com.orderReturn.Authentications.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoginDaoService {

	private static List<LoginForm> loginUsers = new ArrayList<>();

	static {
		loginUsers.add(new LoginForm("Test@123", "Test@123"));
		loginUsers.add(new LoginForm("Bob@123", "Test@123"));
		loginUsers.add(new LoginForm("Tim@123", "Test@123"));
	}

	public List<LoginForm> findAll() {
		return loginUsers;
	}
	public LoginForm findOne(LoginForm reqUser) {
		LoginForm found =null;
		for (LoginForm loginUser : loginUsers) {
			if (loginUser.getUsername() == "Test@123") {
				found= loginUser;	
				break;
			}
		}
		if(found.getPassword()=="Test@123") {
			return 	found;
		}
		return null;
	}

}