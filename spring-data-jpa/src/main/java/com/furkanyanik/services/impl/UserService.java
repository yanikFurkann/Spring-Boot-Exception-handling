package com.furkanyanik.services.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furkanyanik.exception.BaseException;
import com.furkanyanik.exception.ErorMessage;
import com.furkanyanik.exception.MessageType;
import com.furkanyanik.model.Product;
import com.furkanyanik.model.User;
import com.furkanyanik.repository.ProductRepository;
import com.furkanyanik.repository.UserRepository;
import com.furkanyanik.services.IUserService;


@Service

public  class UserService implements IUserService{
@Autowired
	private UserRepository userRepository;



	

	@Override
	public User saveUser(User user) {
	return userRepository.save(user);
		
	}

	//////
	@Override
	public List<User> findAllUser() {
	return	userRepository.findAll();
		
	}
	
	
	
	/////
	
	@Override
	public User findById(Integer Id) {
	Optional<User> userOptional=userRepository.findById(Id);
	
	
	if (userOptional.isEmpty()) {

throw new BaseException(new ErorMessage(MessageType.NO_RECORD_EXİST,Id.toString()));
		
	
	}	
	
	
	return userOptional.get();
	
	}

	//////////////
	
	@Override
	public void deleteUser(Integer id) {
		
	
	Optional<User> userOptional=userRepository.findById(id);
	if (userOptional.isEmpty()) {
		throw new BaseException(new ErorMessage(MessageType.NO_RECORD_EXİST, id.toString()));
	}
		
	userRepository.deleteById(id);
	
	}

	
		
		
	}


	

		
	

	

	
		
		
		
		
	

		

	
	
	
	
	


	

	
	
	
	
	
	
	
	
	
	
	

