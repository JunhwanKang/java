package day34;

public class Car {
	private String model;
	private String color;
	private int maxSpeed;
	
//	public Car() {
//		this.model = "K5";
//		this.color = "검정";
//		this.maxSpeed = 200;
//	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car() {
		this("K5", "검정",200);
	}
	public Car(String model) {
		this(model, "검정",200);
	}
}
