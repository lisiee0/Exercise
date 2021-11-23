package baekjoon;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		int min, max;
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		int[] case1= new int[num];
		
		for(int i= 0; i<case1.length; i++) {
			case1[i]= sc.nextInt();
		}
		min= case1[0];
		max= case1[0];
		
		for(int i= 0; i<case1.length; i++) {
			if(case1[i]<min) {
				min= case1[i];
			}
		}
		for(int i= 0; i<case1.length; i++) {
			if(case1[i]>max) {
				max= case1[i];
			}
		}
		
		System.out.println(min+" "+max);
		sc.close();
	}
}
