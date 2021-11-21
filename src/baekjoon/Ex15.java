package baekjoon;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		for(int y= 0; y<num; y++) {
			for(int x= 1; x<=num; x++) {
				if(x>=num-y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
		sc.close();
	}
}
