package insurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Email");
		String email = sc.next();
		System.out.println("Password");
		String password = sc.next();

		AccountManager accManager = new AccountManager();
		Account account = accManager.login(email, password);
		
		System.out.println("Welcome " + account.getUser().getFirstName() + " " + account.getUser().getLastName());
		
	}

}
