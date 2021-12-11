package baekjoon;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		int result= 0;
		int index= 1;
		Scanner sc= new Scanner(System.in);
		
        int caseNum= sc.nextInt();
        
        for (int i= 0; i<caseNum; i++) {
            String c= sc.nextLine();
        }

        for (int j= 0; j<c.length(); j++) {
            if (c.equals("O")) {
                result+= index;
                index++;
            } 
            else if (c.equals("X")) {
                index= 1;
            } 
        }
    }	
        System.out.println(result);
        sc.close();
}