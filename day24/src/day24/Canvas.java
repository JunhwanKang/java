package day24;

// 디자인 패턴 : 상황에 따라 필요한 패턴 사용
public class Canvas {
	private Canvas() {
		// TODO Auto-generated constructor stub
	}
	private static Canvas canvas = new Canvas();
	
	public static Canvas getInstance() {
		return canvas;
	}
}
