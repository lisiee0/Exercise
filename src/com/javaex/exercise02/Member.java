package com.javaex.exercise02;

public class Member {
	
	// 필드
	private String name;
	private String id;
	private String password;
	private int age;
	
	// 생성자
	public Member() {
		
	}

	public Member(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	// 메소드 g/s	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	
	// 메소드 일반
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
}
