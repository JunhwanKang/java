package day24;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter //전부 다 만듬
@Setter
@AllArgsConstructor
class Person{
//	@Getter 이름에만 만듬
	private String irum;
	private String tel;
	
}
@Getter
@Setter
class Student extends Person{
//	String irum;
//	String tel;
	private int bunho;
	private String dept;
	public Student(String irum, String tel, int bunho, String dept) {
		super(irum, tel);
		this.bunho = bunho;
		this.dept = dept;
	}
}
@Getter
@Setter

class Teacher extends Person{
//	String irum;
//	String tel;
	private String email;
	private String dept;
	public Teacher(String irum, String tel, String email, String dept) {
		super(irum, tel);
		this.email = email;
		this.dept = dept;
	}
}
public class InheritanceTest2 {
	public static void main(String[] args) {
		
	}
}
