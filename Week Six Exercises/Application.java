package six;

public class Application {

	public static void main(String[] args) {
		for (Account account : Account.createAccounts(5)) {
			System.out.println(account);
		}
	}

}
