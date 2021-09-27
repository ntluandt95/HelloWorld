package one;

public class Application {
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 10;
		person.name = "Person Name";
		System.out.println("Person age: "+person.age);
		System.out.println("Person name: "+person.name);
	}

}
