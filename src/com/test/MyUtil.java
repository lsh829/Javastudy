package com.test;

public class MyUtil {
	public String name;
	protected String tel;
	int age;
	
	public MyUtil() {
		
	}
	public MyUtil(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	
	}
	
	public void print() {
		System.out.println(name+":"+tel+":"+age);
	}
	
	public void set(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	
	}
}

