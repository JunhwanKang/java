package day25;

import java.io.PrintWriter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//상속
@AllArgsConstructor
@NoArgsConstructor
class 날짜{
	int year;
	int month;
	int day;
}
class 도시락{
	날짜 productDay = new 날짜(2020,12,1);
	날짜 validDay = new 날짜(2020,12,31);
}

public class OOPTest2 {
	public static void main(String[] args) {
//		PrintWriter out;
//		out.println("hello");
	}
}





