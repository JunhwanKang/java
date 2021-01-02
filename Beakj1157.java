package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakj1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		int[] arr = new int[26];
		int max = 0;
		int idx = 0;
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-'A']++;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0 && max<arr[i]) {
				max=arr[i];
				idx = i;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("?");
		}else {
			System.out.println((char)(idx+'A'));
		}
	}
}