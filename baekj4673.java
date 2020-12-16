
public class baekj4673 {
	public static void main(String[] args) {
		
		boolean[] arr = new boolean[10000];
		for(int i=0; i<10000; i++) {
			int num = checkSelf(i);
			if(num < 10000) {
				arr[checkSelf(i)] = true; 
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==false) {				
				System.out.println(i);
			}
		}
	}
	public static int checkSelf(int i) {
		int count = 0;
		int sum = i;
		String str = String.valueOf(i);
		
		for(int j=0; j<str.length(); j++) {
			
			sum += str.charAt(count)-48;
			count++;
		}
		return sum;
	}
}
