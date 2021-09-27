package two;

public class Main {

	public static void main(String[] args) {
		PrivatePerson person = new PrivatePerson();
		person.setAge(10);
		person.setName("Person Name");
		System.out.println("Person age: "+person.getAge());
		System.out.println("Person name: "+person.getName());
	}

}
