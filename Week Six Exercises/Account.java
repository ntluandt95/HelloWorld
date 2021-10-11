package six;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Account {
	private long id;
	private String accountType;
	public Account() {
		
	}
	public Account(long id, String accountType) {
		super();
		this.id = id;
		this.accountType = accountType;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + "]";
	}
	
	public static List<Account> createAccounts(int numAccounts){
		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < numAccounts; i++) {
			Account acc = new Account(i,"Checking");
			accounts.add(acc);
		}
		return accounts;
	}
	
}
