package org.com.cay.entity;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private int age;
	private boolean married;
	private String gender;
	private List<String> favor;
	private String city;
	
	
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getFavor() {
		return favor;
	}

	public void setFavor(List<String> favor) {
		this.favor = favor;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person(int id, String username, int age) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + ", married="
				+ married + ", gender=" + gender + ", favor=" + favor + ", city=" + city + "]";
	}

}
