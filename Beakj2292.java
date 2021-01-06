package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakj2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(check(num));
	}

	public static int check(int n) {
		int result = 1;
		if(n!=1) {
			n-=1;			
			int i = 1;
			while(true) {
				n-=6*i;
				if(n<=0)
					break;
				i++;
			}
			return i+1;
		}
		return result;
	}
}