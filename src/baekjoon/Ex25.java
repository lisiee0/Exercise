package baekjoon;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[] nArray= new int[10];
		int[] com= new int[10];
		int count= 0;
		
		for(int i= 0; i<nArray.length; i++) {
			nArray[i]= sc.nextInt();
		}
		
		for(int i= 0; i<com.length; i++) {
			com[i]=nArray[i]%42;
			if(i==0) {
				count= 1;
			}
			else {
				if(com[i]!=com[i-1]) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
