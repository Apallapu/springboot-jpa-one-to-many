package com.poc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	private String name;
	private int age;

	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user")
	public List<Address> address;
	public User() {
	}
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public User(Long user_id, String name, int age) {
		this.user_id = user_id;
		this.name = name;
		this.age = age;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	// standard setters and getters
	@Override
	public String toString() {
		return "User{" + "id=" +user_id + ", name='" + name + '\'' + ", age=" + age + '}';
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
}
