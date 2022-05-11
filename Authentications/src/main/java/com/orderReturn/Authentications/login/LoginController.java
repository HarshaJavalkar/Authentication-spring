package com.orderReturn.Authentications.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class LoginController {

	@Autowired
	private LoginDaoService service;

	@RequestMapping(method=RequestMethod.POST ,path = "authentications/login")
	public UserResLogin login( @RequestBody LoginForm reqLoginForm) {
		LoginForm res = service.findOne(reqLoginForm);
		return new UserResLogin("success");
	} 

	@RequestMapping(method=RequestMethod.GET ,path = "authentications/users")
	public List<LoginForm> getUsers() {
		return service.findAll();
	} 
}
