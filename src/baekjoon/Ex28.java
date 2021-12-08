package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet= new HashSet<Integer>();
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		int hash= num%42;
		
		hSet.add(hash);
		
		sc.close();

	}

}
