package org.com.cay.entity;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}
	
	
}
