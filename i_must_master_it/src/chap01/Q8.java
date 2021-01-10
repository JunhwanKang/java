//package chap01;
//
//import java.util.Scanner;
//
//public class Q8 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int sum = (1+n)*(n/2);
//		
//		if(n/2!=0) {
//			sum += ((1+n)/2);
//		}
//		System.out.println(sum);
//	}
//}
package chap01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = (1+n)*(n/2);
		
		if(n/2!=0) {
			sum += ((1+n)/2);
		}
		System.out.println(sum);
// 소스 실행후 시간 취득
long end = System.currentTimeMillis();

// 측정 시간 출력
System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
	}
}