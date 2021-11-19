package com.javaex.exercise01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		boolean action= true;
		int[] scores= null;
		
		Scanner sc= new Scanner(System.in);
		
		while(action) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>> ");
			int select= sc.nextInt();	

			if(select==1) {
				System.out.print("학생수: ");
				int num= sc.nextInt();
				scores= new int[num];
				continue;
			}
			else if(select==2) {
				for(int i= 0; i<scores.length; i++) {
				System.out.print("scores["+i+"]  ");
				scores[i]= sc.nextInt();
				continue;
				}
			}
			else if(select==3) {
				for(int i= 0; i<scores.length; i++) {
					System.out.println("scores["+i+"]  "+scores[i]);
				}
				continue;
			}
			else if(select==4) {
				int sum= 0;
				int high= 0;
				for(int i= 0; i<scores.length; i++) {
					
					if(scores[i]>high) {
						high= scores[i];
					}
					sum= sum+scores[i];
				}
				System.out.println("최고 점수: "+high);
				System.out.println("평균 점수: "+(double)sum/(double)scores.length);
				continue;
			}			
			else if(select==5) {
				System.out.println("프로그램 종료");
				action= false;
				break;
			}
		}
		sc.close();
	}
}
// 학생수와 각 학생들의 점수를 받아서, 최고 점수 및 평균 점수를 구하기.
