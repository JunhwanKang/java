package day38;

public class Test3 {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "aaaa";
		
		try {
			int val1 = Integer.parseInt(data1);
			int val2= Integer.parseInt(data2);
			System.out.println(val1+val2);
		} catch(NumberFormatException e1) {
			System.out.println("숫자만 입력하세요");
		} catch(Exception e2) {
			System.out.println("에러 발생");
		} finally {
			System.out.println("무조건 실행");
		}
	}
}
