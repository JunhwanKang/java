package d.lang;

public class JavaLangNumber {
	public static void main(String[] args) {
		JavaLangNumber sample = new JavaLangNumber();
		sample.numberTypeCheck();	
		sample.numberMinMaxCheck();
	}
	public void numberTypeCheck() {
		String value1 = "3";
		String value2 = "5";
		byte byte1 = Byte.parseByte(value1);
		byte byte2 = Byte.parseByte(value2);
		System.out.println(byte1+byte2);
		
		Integer refInt1 = Integer.valueOf(value1);
		Integer refInt2 = Integer.valueOf(value2);
		System.out.println(refInt1+refInt2+"7");
	}
	public void numberMinMaxCheck() {
		System.out.println("byte min= " +Byte.MIN_VALUE+" max= "+ Byte.MAX_VALUE);
		System.out.println("short min= "+Short.MIN_VALUE+" max= "+ Short.MAX_VALUE);
		System.out.println("Integer min= "+Integer.MIN_VALUE+" max= "+Integer.MAX_VALUE);
		
		System.out.println("Integer Binary min= "+Integer.toBinaryString(Integer.MIN_VALUE)+" Binary max= "+Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println("Integer Hex min= "+Integer.toHexString(Integer.MIN_VALUE)+" Hex max= "+Integer.toHexString(Integer.MAX_VALUE));
		
		System.out.println("Long min= "+Long.MIN_VALUE+" max= "+ Long.MAX_VALUE);
		System.out.println("Float min= "+Float.MIN_VALUE+" max= "+Float.MAX_VALUE);
		System.out.println("Double min= "+Double.MIN_VALUE+" max= "+Double.MAX_VALUE);
		System.out.println("Character min= "+(int)Character.MIN_VALUE+" max= "+(int)Character.MAX_VALUE);
	}
	public void numberMinMaxElapsedCheck() {
		JavaLangNumber numberSample = new JavaLangNumber();
		long startTime = System.currentTimeMillis();
		long startNanoTime = System.nanoTime();
		numberSample.numberMinMaxCheck();
		System.out.println("Milli second= "+(System.currentTimeMillis()-startTime));
		System.out.println("Nano second= "+(System.nanoTime()-startNanoTime));
	}
}
