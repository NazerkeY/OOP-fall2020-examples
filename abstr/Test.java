package abstr;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector<Animal> animals = new Vector<Animal>();
		animals.add(new Cat("Milo", 2));
		animals.add(new Fish("Nemo", 1));
		
		for(Animal animal: animals) {
			if(animal instanceof Cat) {
				Cat cat = (Cat)animal;
				cat.sound(5);
				cat.walk();
			}
			else if(animal instanceof Fish) {
				Fish fish = (Fish)animal;
//				fish.sound();
//				fish.swim();
//				fish.sleep();
			}
		}
	}
}
