package baekjoon;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double num1= sc.nextInt();
		double num2= sc.nextInt();
		
		double result= num1/num2;
		
		System.out.println(result);
		
		sc.close();
	}
}
