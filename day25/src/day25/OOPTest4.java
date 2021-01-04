package day25;

import java.io.File;
import java.time.LocalDate;

class HandPhone{}
class S21 extends HandPhone{}
class I12 extends HandPhone{}
class Velvet extends HandPhone{}

class Student{
//	S21 hp = new S21();
	HandPhone hp = new S21();
	String name;
	LocalDate birthday = LocalDate.now();
	File profile;
}
public class OOPTest4 {

}
