package sb;

public class StringBuffer_ex {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("abcd");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		StringBuffer sb2 = new StringBuffer(5);
		
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("cat");
		
		System.out.println(sb3.capacity());
		
		sb.append("efg").append("hijk");
		
		System.out.println(sb);
		
		sb.delete(3, 7);
		
		System.out.println(sb);
		
		sb.deleteCharAt(5);
		
		System.out.println(sb);
	}
}

