package com.javaex.exercise01;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum= 0;
		for(int i= 1; i<=100; i++) {
			if(i%3==0) {
				sum= sum+i;
			}
		}
		System.out.println("3의 배수의 합: "+sum);
	}
}


// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합 구하기.