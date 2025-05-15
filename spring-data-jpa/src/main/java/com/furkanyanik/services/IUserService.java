package com.furkanyanik.services;

import java.util.List;

import com.furkanyanik.model.Product;
import com.furkanyanik.model.User;



public interface IUserService {
	
	
	public User saveUser(User user);
	public List<User> findAllUser();
	
	
	public User findById(Integer Id);

	public void deleteUser(Integer id);


}
