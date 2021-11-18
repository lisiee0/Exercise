package com.javaex.exercise01;

public class Ex02 {
	public static void main(String[] args) {
		
		int num1, num2;
		do {
			num1= (int)(Math.random()*6)+1;
			num2= (int)(Math.random()*6)+1;
			
			System.out.println("("+num1+", "+num2+")");

		}
		while ((num1+num2)!=5);
	}
}

/* while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
   눈의 합이 5가 아니면 주사위를 계속 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성.  */
