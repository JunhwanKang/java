package algorithm;

import java.util.ArrayList;

public class Student {
	
	private String name;  //이름
	private int no;    //학번
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

}
