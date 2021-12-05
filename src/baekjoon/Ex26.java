package baekjoon;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		double M= 0;
		double avg= 0;
		
		Scanner sc= new Scanner(System.in);
		
		int sn= sc.nextInt();
		double[] subject= new double[sn];
		
		for(int i= 0; i<subject.length; i++) {
			subject[i]= sc.nextInt();
			if(subject[i]>M) {
				M= subject[i];			
			}	
		}
		
		for(int i= 0; i<subject.length; i++) {		
			subject[i]= (subject[i]/M)*100;
			avg+= subject[i];
		}		
		System.out.println(avg/subject.length);
		sc.close();
	}
}
