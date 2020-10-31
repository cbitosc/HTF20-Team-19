package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;



public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select s from User s  where s.Email = :Email ")
    List<User> findByUserEmail(String Email);
	

	@Query("select s from User s where s.Pincode = :pincode")
	List<User> findBypincode(String pincode);
	//List<User> findByEmail(String Email);
	
	
}	
