package chap02;

public class IntArrayInit {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		// 이렇게도 사용 가능
//		int[] a = new int[] {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}
