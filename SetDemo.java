package algorithm;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		
		HashSet<Integer> set2 = new HashSet<>();
		
		HashSet<Integer> set3 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		set3.add(1);
		set3.add(2);

//		System.out.println(set1.containsAll(set2));  // false
//		System.out.println(set1.containsAll(set3));  // true
		
//		set1.addAll(set2);     // 합집합
//		set1.retainAll(set2);  // 교집합
		set1.removeAll(set2);  // 차집합
		
		Iterator hi = (Iterator)set1.iterator();
		while(hi.hasNext()) {
			System.out.printf("%d ",hi.next());
		}
		
	}
}
