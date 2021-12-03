package baekjoon;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n01= sc.nextInt();
		int n02= sc.nextInt();
		int n03= sc.nextInt();
		
		sc.close();
		
		int result= n01*n02*n03;
		int[] count= {0,0,0,0,0,0,0,0,0,0};
		int[] tool= new int[9];
		
		tool[0]= (result%10);  // 1의자리
		tool[1]= (result%100)/10; //10의자리
		tool[2]= (result%1000)/100; // 100의자리
		tool[3]= (result%10000)/1000;  // 1000의자리
		tool[4]= (result%100000)/10000; // 10000의자리
		tool[5]= (result%1000000)/100000; // 100000의자리
		tool[6]= (result%10000000)/1000000; // 1000000의자리
		tool[7]= (result%100000000)/10000000; // 10000000의자리
		tool[8]= result/100000000; // 100000000의자리
		
		for(int i= 0; i<count.length; i++) {
			if(result<10000000) {
				for(int a= 0; a<7; a++) {
					if(tool[a]==i) {
						count[i]++;
					}
				}				
			}
			else if(result<100000000) {
				for(int a= 0; a<8; a++) {
					if(tool[a]==i) {
						count[i]++;
					}
				}
			}
			else {
				for(int a= 0; a<tool.length; a++) {
					if(tool[a]==i) {
						count[i]++;
					}
				}
			}
		}
		for(int i= 0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
