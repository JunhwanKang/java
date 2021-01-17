package day34;

class Calculator{
	int plus(int x, int y) {
		return x+y;
	}
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
}

public class Example5 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}
