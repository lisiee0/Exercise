package baekjoon;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		int a= num2/100;
		int b= (num2%100)/10;
		int c= ((num2%100)%10);
		
		System.out.println(c*num1);
		System.out.println(b*num1);
		System.out.println(a*num1);
		System.out.println(num1*num2);
		
		sc.close();		
	}
}
