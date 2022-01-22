package entities;

import java.util.Locale;

public class AndreLSVieira {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Account myCheckingAccount;
		myCheckingAccount = new Account();
       
		myCheckingAccount.owner = "Duke";
		myCheckingAccount.balance = 1000.0;
		myCheckingAccount.deposit(500);
		myCheckingAccount.transfer(500);
		System.out.println("Current account holder: " + myCheckingAccount.owner);
		System.out.printf("Anonymous cashier: %.2f\n", myCheckingAccount.cashier2);
		System.out.printf("New balance: %.2f\n", myCheckingAccount.newBalance());

	}

}
