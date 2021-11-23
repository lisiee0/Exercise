package baekjoon;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		while(sc.hasNextInt()) {
			num1= sc.nextInt();
			num2= sc.nextInt();
			sum= num1+num2;
			
		System.out.println(sum);	
		}
		
		sc.close();
	}
}
/* hasNextInt() 는 다음번에 호출할 nextInt() 가 정상적으로 수행될 수 있으면 true, 그렇지 않으면 false 를 반환합니다.

이 문제의 입력 데이터는 총 데이터의 개수가 명시되어 있지 않으므로 "입력 데이터가 더 이상 없는 상태", 즉 End of File 상태를 판단할 수 있어야 합니다.

입력 데이터가 더 이상 없으면 nextInt() 를 호출하면 EOF 예외가 발생하겠지만, 그럴 때 hasNextInt() 를 호출하면 false 를 반환하므로

더 이상 nextInt() 를 호출하지 않고 프로그램을 안전하게 종료할 수 있습니다. */