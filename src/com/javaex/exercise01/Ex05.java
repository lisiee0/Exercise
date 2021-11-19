package com.javaex.exercise01;

public class Ex05 {

	public static void main(String[] args) {
		
		int [] array= {95, 86, 83, 92, 96, 78, 83, 93, 87, 88};
		
		int sum= 0;
		double avg= 0;
		
		for(int i= 0; i<array.length; i++) {
			sum= sum+array[i];	
		}
		avg= (double)sum/array.length;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}
}

// 주어진 배열의 전체 합과 평균값 구하기.