package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekj5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = 0;
		char[] arr = new char[26];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (char)(65+i);
			for(int j = 0; j<str.length(); j++) {
				char c = str.charAt(j);
				if(arr[i]==c) {
					if(i==25) {
						num+=10;
					}
					else if(i>=18) {
						num += ((i-1)/3+3);

					}else {
						num +=(i/3+3);

					}
				}
			}
		}
		System.out.println(num);
	}
}