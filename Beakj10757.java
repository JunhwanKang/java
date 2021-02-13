package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakj10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken();
		int max = a.length()-b.length()>=0? a.length() : b.length();
		
		int[] arr = new int[max+1];
		int[] brr = new int[max+1];
			
		for(int i=0; i<a.length(); i++) {
			arr[i] = a.charAt(a.length()-1-i)-'0';
		}
		for(int i=0; i<b.length(); i++) {
			brr[i] = b.charAt(b.length()-1-i)-'0';
		}
		for(int i=0; i<max; i++) {
			if(arr[i]+brr[i]>=10) {
				arr[i+1] += (arr[i]+brr[i])/10; 
				arr[i] = (arr[i]+brr[i])%10; 
			}else {
				arr[i] = arr[i] + brr[i];
			}
		}
		if(arr[max]>0)
			System.out.print(arr[max]);
		for(int i=max-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
