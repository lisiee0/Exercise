package baekjoon;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		int[] com= new int[42];
		int count= 0;
		
		for(int i= 0; i<10; i++) {
			int num= sc.nextInt();
			com[num%42]++;
		}
		
		for(int i= 0; i<com.length; i++) {
			if(com[i]!=0) {
				count++;
			}
		}			
		System.out.println(count);
		sc.close();
	}
}
