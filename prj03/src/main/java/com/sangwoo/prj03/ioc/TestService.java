package com.sangwoo.prj03.ioc;

public class TestService {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Test Name is " + name);
	}
}
