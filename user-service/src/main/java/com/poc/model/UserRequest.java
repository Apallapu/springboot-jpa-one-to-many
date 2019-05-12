package com.poc.model;

import java.util.List;

public class UserRequest {
	private Long user_id;
	private String name;
	private int age;
	public List<AddressRequest> addressRequests;

	public UserRequest() {

	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<AddressRequest> getAddressRequests() {
		return addressRequests;
	}

	public void setAddressRequests(List<AddressRequest> addressRequests) {
		this.addressRequests = addressRequests;
	}

	
}
