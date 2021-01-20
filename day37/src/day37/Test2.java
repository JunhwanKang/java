package day37;

interface TVRemocon{
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	public void channelUp();
	public void channelDown();
	public void volumeUp();
	public void volumeDown();
}
abstract class BasicTVRemocon implements TVRemocon{
	private int volume = 5;
	@Override
	public void volumeUp() {
		volume++;
	}
	@Override
	public void volumeDown() {
		volume--;
	}
}

public class Test2 {

}
