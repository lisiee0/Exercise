package baekjoon;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		int[] array= new int[9];
		
		Scanner sc= new Scanner(System.in);
		
		int max= 0;
		int count= 0;
		for(int i= 0; i<array.length; i++) {
			array[i]= sc.nextInt();
			if(array[i]>max) {
				max=array[i];
				count= i;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
		
		sc.close();
	}
}
