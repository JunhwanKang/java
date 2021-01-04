package day25;

import java.util.ArrayList;

class 삼각형{}
class 사각형{}
class 원{}

public class OverrideTest4 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new 삼각형());
		list.add(new 사각형());
		list.add(new 원());
		System.out.println(list);
	}
}
