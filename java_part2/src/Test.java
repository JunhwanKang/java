
public class Test {
	public int a = 10;
	public double x = 1.23;
	
	public static void main(String[] args) {
		Test test  = new Test();
		Test test2 = new Test();
		
		test2.a = 5;
		test2.x = 1.23123;
		
		System.out.println(test.toString());
		
		System.out.println(test.a);
		
		Integer num1 = new Integer(10);
		Integer num2 = 20;
		int num3 = 30;
		
		Object k1 = num1;
		Object k2 = num2;
		Object k3 = num3;
		
		Object [] array = new Object[100];
		int i = 10;
		array[0] = i;
		
		System.out.println("k1= "+k1);
		System.out.println("k2= "+k2);
		System.out.println("k3= "+k3);
		System.out.println("[0]= "+ array[0] );
		
		int n = num1.intValue();
		
		int n2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(n);
		System.out.println(n2);
		
		
	}
}
