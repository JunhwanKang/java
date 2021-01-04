package day25;

//프로그래밍 개발 방법론의 목표 - 생산성
// 1. 절차적 프로그래밍 : 함수, 기능 중심
// 2. 객체 지향 프로그래밍 : 데이터 +메소드 -> 클래스
//     캡슐화 : 클래스를 만들어라
//     정보유닉 : 모니터 케이스
//     상속 
//     다형성

class TV {
	private int channel;
	private int volume;
	public TV() {
		this.channel = 11;
		this.volume = 8;
	}
	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}
	public void volumeUp() {
		this.volume++;
	}
	public void volumeDown() {
		this.volume--;
	}
}

public class OOPTest {

}
