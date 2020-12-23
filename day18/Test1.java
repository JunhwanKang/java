package day18;

//증감 연산자
public class Test1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		++a; // 전위(prefix)
		b++; // 후위(postfix)
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(b++);
		
		int x = ++a;
		int y = b++;
		System.out.println(x);
		System.out.println(y);
		
		for(int i=0; i<5; i++) {
			System.out.println(x--);
			System.out.println(--y);
		}
	}
}
