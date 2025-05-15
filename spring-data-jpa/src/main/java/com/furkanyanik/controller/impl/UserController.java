package com.furkanyanik.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.controller.IUserController;
import com.furkanyanik.model.Product;
import com.furkanyanik.model.User;
import com.furkanyanik.services.IUserService;

@RestController
@RequestMapping("/rest/api/user")
public class UserController implements IUserController {
@Autowired
private	IUserService userService;
	
	
	
	
	@PostMapping(path = "/save")
	@Override
	public User saveUser(@RequestBody User user) {
	return	userService.saveUser(user);
		
	}



@GetMapping(path = "/list")
	@Override
	public List<User> findAllUser() {
	return	userService.findAllUser();
	
	}


@GetMapping(path = "/list/{id}")
@Override
public User findById(@PathVariable(name = "id") Integer Id) {
return	 userService.findById(Id);

}


@DeleteMapping(path = "/delete/{id}")
@Override
public void deleteUser(@PathVariable(name ="id" ) Integer id) {
	 userService.deleteUser(id);
	
}


	
	
}








	
	
	
	


