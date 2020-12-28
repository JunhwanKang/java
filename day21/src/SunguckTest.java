
class Sungjuck{
	private int kor;
	private int eng;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
public class SunguckTest {
	public static void main(String[] args) {
		// 객체를 생성할 때 초기화를 담당하는 메소드 : 생성자 (constructor)
		Sungjuck s = new Sungjuck();
		System.out.println(s.getKor());
		s.setKor(75);
		System.out.println(s.getKor());
	}
}
