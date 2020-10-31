package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Model.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	public UserRepository userrep;	
	
	public void savemyuser(User user) {
		System.out.println(user.getEmail());
		userrep.save(user);
	}
	
	
	public String Login(User user) {
		
		String mail = user.getEmail();
		String pass = user.getPassword();
	    List<User> user1 = userrep.findByUserEmail(mail);
	    if(user1.isEmpty())
	    	return "/notsuccess";
	   	String pass1=user1.get(0).getPassword();
	   	if(pass1.equals(pass))
	   	   return "/success";
	   	else
	   		return "/";
		
	}
	
	public List<User> DonarsList(User user) {
		String pincode = user.getPincode();
		List<User> donars = userrep.findBypincode(pincode);
		return donars;
	}
	
}
