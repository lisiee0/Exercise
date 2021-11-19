package com.javaex.exercise01;

public class Ex04 {

	public static void main(String[] args) {
		
		int max= 0;
		int [] array= {1, 5, 3, 8, 2};
		
		for(int i= 0; i<array.length; i++) {
			if(array[i]>max) {
				max= array[i];	
			}
		}
		System.out.println("Max: "+max);
	}
}


// 주어진 배열의 항목에서 최대값 구하기.