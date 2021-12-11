package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex29 {

	public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int caseNum= Integer.parseInt(br.readLine());

            for (int i= 0; i<caseNum; i++) {
                String c= br.readLine();
                int result= 0;
                int index= 1;

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
            br.close();
	}
}