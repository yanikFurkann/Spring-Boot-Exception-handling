package com.furkanyanik.controller;

import java.util.List;

import com.furkanyanik.model.Product;
import com.furkanyanik.model.User;

public interface IUserController {
	public User saveUser(User user);
	public List<User> findAllUser();

	public User findById(Integer Id);
	
	public void deleteUser(Integer id);
}
