package interface1;

//인터페이스 : 추상 메소드만 가진다
interface TVRemocon{
	public final static int MAX_VOLUME = 10;
	public final static int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void volumUp();
	public void volumDown();
}

public class InterfaceTest {
	
}
