package baekjoon;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int casenum= sc.nextInt();
		
		int[] case1= new int[casenum];
		int[] case2= new int[casenum];
		
		for(int i= 0; i<case1.length; i++) {
			case1[i]= sc.nextInt();
			case2[i]= sc.nextInt();
		}
		for(int i= 0; i<case1.length; i++) {
			System.out.println("Case #"+(i+1)+": "+(case1[i]+case2[i]));
		}
		sc.close();
	}
}
