package abstr;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void sound() {
		System.out.println("meow");
	}
	
	public void walk() {
		System.out.println("four steps goes");
	}
	
}
