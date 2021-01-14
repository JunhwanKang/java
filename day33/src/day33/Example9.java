package day33;

public class Example9 {
	public static void main(String[] args) {
		int val = 15;
		for (int i = 1; i <= 15; i++) {
			if (val % i == 0)
				System.out.print(i + " ");
		}
	}
}
