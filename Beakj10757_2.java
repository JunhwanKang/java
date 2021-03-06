package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Beakj10757_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		BigInteger bignum1 = new BigInteger(st.nextToken());
		BigInteger bignum2 = new BigInteger(st.nextToken());
		
		bignum1 = bignum1.add(bignum2);
		
		System.out.println(bignum1);
		
	}
}
