package com.poc.maper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.poc.model.Address;
import com.poc.model.AddressRequest;
import com.poc.model.User;
import com.poc.model.UserRequest;

@Component
public class Mapper {

	public User createUser(UserRequest userRequest) {
		User user = new User();
		user.setAge(userRequest.getAge());
		user.setName(userRequest.getName());
		user.setAddress(createAddressList(userRequest, user));
		return user;
	}

	private List<Address> createAddressList(UserRequest userRequest, User user) {
		List<Address> addresses = new ArrayList<>();
		userRequest.getAddressRequests().stream().forEach(adress -> addresses.add(createAddress(adress, user)));

		return addresses;
	}

	private Address createAddress(AddressRequest addresses, User user) {
		Address address = new Address();
		address.setName(addresses.getName());
		address.setUser(user);

		return address;
	}

}
