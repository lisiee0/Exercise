package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		int i= 0;
		HashSet<Integer> hSet= new HashSet<Integer>();
		
		Scanner sc= new Scanner(System.in);
		
		do {
			hSet.add(sc.nextInt()%42);
			i++;
		}
		while (i<10);	
		
		sc.close();
		System.out.println(hSet.size());
	}
}
