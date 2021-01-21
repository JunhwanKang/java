package day38;

public class Test2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int a = 10/0;
	}
}
