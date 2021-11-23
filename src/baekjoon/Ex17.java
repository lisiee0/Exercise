package baekjoon;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		while(true) {
			num1= sc.nextInt();
			num2= sc.nextInt();
			sum= num1+num2;

			if(num1==0&&num2==0) {
				break;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
