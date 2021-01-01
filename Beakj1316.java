package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakj1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cycle = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<cycle; i++) {
			if(check(br.readLine()))
				count++;
		}
		System.out.println(count);
	}
	public static boolean check(String str) {
		boolean[] arr = new boolean[26];
		char temp = 0;
		for(int i=0; i<str.length(); i++) {
			temp = str.charAt(i);
			if(arr[temp-'a']) {
				return false;
			}
			if(i<str.length()-1 && temp!=str.charAt(i+1)) {
				arr[temp-'a']= !arr[temp-'a'];
			}
		}
		return true;
	}
}
