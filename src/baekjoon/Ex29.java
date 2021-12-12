package baekjoon;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		int result= 0;
		int score= 1;
		Scanner sc= new Scanner(System.in);
		
        String[] strArray= new String[sc.nextInt()];
        
        for(int i= 0; i<strArray.length; i++) {
        	strArray[i]= sc.nextLine();
        }
        
        for (int i= 0; i<strArray.length; i++) {
            for(int j=0; j<strArray[i].length(); j++) {
            	if(strArray[i].charAt(j)=='O') {
            		result+= score;
            		score++;
            	}
            	else if(strArray[i].charAt(j)=='X') {
            		score= 1;
            	}	
            }   
        }
        sc.close();
	}
}