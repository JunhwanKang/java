package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekj2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = "";
		String b = "";

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int k=0; k<2; k++) {
			ArrayList list1 = new ArrayList();
			String str = st.nextToken();

			for(int i=0; i<str.length(); i++) {
				int index = str.charAt(i)-48;
				list1.add(index);
			}
			Collections.reverse(list1);
			
			for(int i=0; i<list1.size(); i++) {
				if(k==0) {
				a += list1.get(i);
				}
				else {
					b += list1.get(i);
				}
			}
		}
		if(Integer.parseInt(a)>Integer.parseInt(b)) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
}
