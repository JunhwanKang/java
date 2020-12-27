package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> cafe = new HashMap<>();
		
		cafe.put("아메리카노", 2000);
		cafe.put("믹스커피", 2000);
		cafe.put("카페라떼", 4000);
		cafe.put("과일주스", 5000);
		
		System.out.println(cafe);
		System.out.println(cafe.get("아메리카노"));
		
		cafe.put("아메리카노", 8000);
		System.out.println(cafe.get("아메리카노"));
		
		cafe.containsKey("아메리카노"); // 키값으로 포함되어 있느냐? 포함:true, 아니면 false
		
		System.out.println(cafe.containsValue(2000)); 
		
		cafe.remove("믹스커피");
		System.out.println(cafe);
		
		Set cafeMenu = cafe.entrySet();
		System.out.println(cafeMenu);
		
		Iterator i = cafeMenu.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
