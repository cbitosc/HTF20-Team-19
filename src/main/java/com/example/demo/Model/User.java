package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String Email;
	private String firstname;
	private String Lastname;
	private String place;
	private String password;
	private String DonarorAcceptor;
	private String Pincode;
	private String BloodType;
	
	
	
	
	public String getDonarorAcceptor() {
		return DonarorAcceptor;
	}



	public void setDonarorAcceptor(String donarorAcceptor) {
		DonarorAcceptor = donarorAcceptor;
	}



	public String getPincode() {
		return Pincode;
	}



	public void setPincode(String pincode) {
		Pincode = pincode;
	}



	public String getBloodType() {
		return BloodType;
	}



	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}



	public User(String Email, String firstname, String lastname, String place, String password,String donaroracceptor,
	 String pincode ,String bloodtype) {
		
		this.Email = Email;
		this.firstname = firstname;
		this.Lastname = lastname;
		this.place = place;
		this.password = password;
		this.DonarorAcceptor = donaroracceptor;
		this.Pincode = pincode;
		this.BloodType= bloodtype;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return Lastname;
	}



	public void setLastname(String lastname) {
		Lastname = lastname;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}
}