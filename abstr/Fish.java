package abstr;

public class Fish extends Animal{

	public Fish(String name, int age) {
		super(name, age);
	}

	@Override
	public void sound() {
		System.out.println("Bulb");
	}
	
	public void swim() {
		System.out.println("two dives");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}

}
