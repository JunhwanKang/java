package str;

public class ValueOf1 {
	public static void main(String[] args) {
		Integer a = 10;
		String str = String.valueOf(a);
		System.out.println(str.getClass().getName());
		System.out.println(a.getClass().getName());
		
		Float b = 10f;
		System.out.println(b.getClass().getName());
		
		float c = Float.valueOf(b);
		System.out.println(c);
		
		Integer num = new Integer(10);
		Integer num2 = 20;
		int num3 = 30;
		
		Object k1 = num;
		Object k2 = num2;
		Object k3 = num3;
		
		Object [] array = new Object[100];
		int i = 10;
		array[0] = i;
		
		System.out.println("k1= "+k1);
		System.out.println("k2= "+k2);
		System.out.println("k3= "+k3);
		System.out.println("[0]= "+ array[0] );
		
		int n = num.intValue();
		
		int n2 = num;
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(n);
		System.out.println(n2);
	}
}
