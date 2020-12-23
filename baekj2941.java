package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekj2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		str = str.replace("c=" ,  "0");
		str = str.replace("c-" ,  "0");
		str = str.replace("dz=",  "0");
		str = str.replace("d-" ,  "0");
		str = str.replace("lj" ,  "0");
		str = str.replace("nj" ,  "0");
		str = str.replace("s=" ,  "0");
		str = str.replace("z=" ,  "0");
	
		System.out.println(str.length());
	}
}

