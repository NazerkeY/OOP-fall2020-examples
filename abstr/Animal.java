package abstr;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void swim() {
		System.out.println("swimming...");
	}
	
	public abstract void sound();
	
	public void sound(int cnt) {
		for(int index = 0; index < cnt; index++) {
			sound();
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
