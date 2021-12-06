package baekjoon;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		String[] q= new String[79];
		Scanner sc= new Scanner(System.in);
		
		int an= sc.nextInt();
		
		for(int i= 0; i<an; i++) {
			q[i]= sc.nextLine();
		}


		
		sc.close();
	}
}
