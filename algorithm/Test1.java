package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
	Student st1 = new Student("홍길동",1);
	Student st2 = new Student("임꺽정",2);
	Student st3 = new Student("이몽룡",3);
	
	ArrayList <Student> list = new ArrayList<Student>();
	
	list.add(st1); 
	list.add(st2);
	list.add(st3);
	
	for(Student stu : list) {
		System.out.println(stu.getName());
		System.out.println(stu.getNo());
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	while(true){
		System.out.println("계속 검색 y, 종료 n");
		String input = sc.next();
		
		if(input.equals("y")) {
			System.out.println("검색을 시작합니다.");
			String name = sc.next();
			boolean flag = false;
			
			for(Student stu : list) {
				if(stu.getName().equals(name)) {
					System.out.println("해당 학생의 학번: "+stu.getNo());
					flag=true;
				}
			}
			if(!flag) {
				System.out.println("존재하지 않는 학생 이름입니다.");
			}
		}else if(input.equals("n")) {
			break;
		}else
			System.out.println("잘 못된 입력입니다.");
	}
	System.out.println("검색을 종료합니다.");
	
	}
}
