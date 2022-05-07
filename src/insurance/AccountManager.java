package insurance;

import java.util.Date;
import java.util.TreeSet;

public class AccountManager {
	
	private TreeSet<Account> accounts;
	
	public AccountManager() {
		accounts = new TreeSet<>();
		accounts.add(new Individual(new User("Kübra", "Özgan", "kubra@hotmail.com", "124768", "24", "Developer", new Date())));
		accounts.add(new Individual(new User("Ashley", "Ander", "ash@hotmail.com", "112233", "28", "Teacher", new Date())));
	}
	
	public Account login(String email, String password) {
		
		Account account = null;
		
		for(Account a : accounts) {
			if(a.getUser().getEmail().equals(email) && a.getUser().getPassword().equals(password)) {
				account = a;
			}
		}
		
		try {
			account.login(email, password);
		}
		catch(InvalidAuthenticationException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("User doesn't exists.");
		}
		
		return account;
	}
	
}
