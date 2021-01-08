package day29_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Apple {
	private String production;
	private int weight;
	private int price;
	@Override
	public boolean equals(Object obj) {
		// instanceof : 참조변수가 가리키는 객체의 실제 타입 확인
		if(obj instanceof Apple==false)
			return false;
		Apple apple = (Apple)obj;
		if(this.price == apple.price)
			return true;
		return false;
	}
	@Override
	public String toString() {
		return production+":"+price;
	}
}
