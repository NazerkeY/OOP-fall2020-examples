package inheritance;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Vector<Person> people = new Vector<Person>();
		people.add(new Person("Damir", 20));
		people.add(new Employee("Zhanna", 25, 10000));
		
		for(Person p: people) {
			System.out.println(p.toString());
		}
		
	}

}
