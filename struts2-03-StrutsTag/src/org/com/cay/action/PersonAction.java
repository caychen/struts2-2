package org.com.cay.action;

import org.com.cay.entity.Person;

public class PersonAction {

	private Person person;
	
	public void setPerson(Person person) {
		System.out.println(person);
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}

	public String save(){
		System.out.println(person);
		return "input";
	}
}
