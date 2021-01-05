
package day26;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class 정직원{
	int salary;
	public int getSalary(){
		return this.salary; 
	}
}
@AllArgsConstructor
class 알바{
	int minimumWage = 8720;
	int hour;
	public int getMoney(){
		return this.minimumWage * this.hour; 
	}
}
public class InheritanceTest3 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new 정직원(3000000));
		list.add(new 알바(8720,48));
		list.add(new 정직원(3500000));
		
		for(Object obj:list) {
			if(obj instanceof 정직원) {
				System.out.println(((정직원)obj).getSalary());
			}else if(obj instanceof 알바) {
				System.out.println(((알바)obj).getMoney());
			}
		}
	}
}