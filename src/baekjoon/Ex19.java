package baekjoon;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		int a, b;
		int count= 0;
		int oldn= num;
		
		while(true) {
			if(num>=0&&num<=99) {
				if(oldn<10) {
					a= 0;
				}
				else {
					a= oldn/10;
				}
				
				b= oldn%10;
				oldn= (b*10)+(a+b)%10;
				count++;
				if(oldn==num) {
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
