package baekjoon;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		int casenum= sc.nextInt();
		int num= sc.nextInt();
		
		int[] case1= new int[casenum];
		
		for(int i= 0; i<case1.length; i++) {
			case1[i]= sc.nextInt();
		}
		for(int i= 0; i<case1.length; i++) {
			if(num>case1[i]) {
				System.out.print(case1[i]+" ");
			}
		}				
		sc.close();
	}
}
