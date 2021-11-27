package com.javaex.exercise02;

public class MemberApp {

	public static void main(String[] args) {
		
		Member m01= new Member("홍길동", "Hong", 30);
		
		m01.setPassword("12345");
		
		System.out.println(m01.toString());
		
	}
}
