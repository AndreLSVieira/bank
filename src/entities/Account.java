package entities;

public class Account {

	public int number;
	public String owner;
	public double balance;
	public double maneuver;
	public double cashier2;
	public double deposit;

	public double transfer(double maneuver) {
		if (maneuver <= deposit) {
			double cash = (deposit - maneuver) / 2;
			cashier2 = cash;
		}
		return cashier2;
	}

	public double deposit(double value) {
		deposit = balance + value;
		return deposit;
	}

	public double newBalance() {
		double withdraw = deposit - cashier2;
		return withdraw;

	}

}
