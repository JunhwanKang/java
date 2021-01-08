package day29_2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Accessors(chain = true)
class Product{
	private int pno;
	private String name;
	private int price;
	private int stock;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product == false)
			return false;
		Product product = (Product)obj;
		if(this.pno == product.pno)
			return true;
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		
		Product p1 = new Product(1, "노트북", 1000000, 11);
		Product p2 = new Product(2, "노트북", 1200000, 7);

		System.out.println(p1.equals(p2));
		
		System.out.println(p1.toString());
		//Bulider : 객체 생성을 쉽게 해주는 패턴 , 실수를 줄일 수 있다.
		Product p3 = Product.builder().pno(3).name("삼성노트북").stock(0).build();
		
		// Accessors (chain=true) 세터 체이닝
		Product p4 = new Product();
		p4.setPno(4).setName("LG 그램").setPrice(1500000).setStock(5);
	}
}
