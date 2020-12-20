package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekj2908_2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String b = "";
		String a = "";
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String str = st.nextToken();
		String str2 = st.nextToken();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			a += str.charAt(i)-48;	
		}
		for(int i=str2.length()-1; i>=0; i--) {
			
			b += str2.charAt(i)-48;		
		}
		
		System.out.println(Integer.parseInt(a) > Integer.parseInt(b) ? a:b);
//		if(Integer.parseInt(a) > Integer.parseInt(b)) {
//			System.out.println(a);
//		}else {
//			System.out.println(b);
//		}
	}
}
