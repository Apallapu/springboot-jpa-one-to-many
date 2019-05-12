package com.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.maper.Mapper;
import com.poc.model.User;
import com.poc.model.UserRequest;
import com.poc.model.UserResponse;
import com.poc.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	Mapper mapper;

	public UserResponse createUser(UserRequest userRequest) {
		UserResponse response = new UserResponse();
		User users = mapper.createUser(userRequest);

		User user = userRepository.save(users);
		response.setId(user.getUser_id());

		return response;
	}

	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
