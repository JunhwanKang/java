package day17;

public class Test03 {
	public static void main(String[] args) {
		// 타입 변경 => cast
		
		// 더 큰 타입으로 변환은 자동으로 수행
		int y = 100;
		long b = y;
		
		// 더 작은 타입으로 변환은 강제로
		long a = 100;
		int x = (int)a;
		
		// 같은 타입을 연산하면 결과도 그 타입
		int k = 10, j = 20;
		int c = k+j;
		
		int kor = 70, eng = 71;
		double avg = (kor+eng)/2; // 정수/정수 = 정수 
//		double avg = double(kor+eng)/2;
//		double avg = (kor+eng)/2.0;
		System.out.println(avg);
	}
}
