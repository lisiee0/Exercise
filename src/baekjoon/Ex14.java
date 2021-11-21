package baekjoon;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		for(int y= 1; y<=num; y++) {
			for(int x= 1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		sc.close();
	}
}
