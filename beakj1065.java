package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println(isCheck(Integer.parseInt(br.readLine())));
	}
	
	public static int isCheck(int num) {
		
		int count = 0;
		
		if(num<100) {
			return num;	
		} else {
			if (num == 1000) { 
				num = 999;
			}
			for(int i=111; i<=num; i++) {
				int n1 = (i/100)%10;
				int n2 = (i/10)%10;
				int n3 = i%10;
				
				if(n1-n2== n2-n3) {
					count++;
				}
			}
			return count+99;
		}
	}
}
