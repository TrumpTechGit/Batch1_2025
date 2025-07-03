package in.trump.exceptionhandling;

public class ThrowEx {

	static void withdraw(int amount) {
		int balance = 5000;

		if (amount > balance) {
			throw new ArithmeticException("Insufficient balance for withdrawl");
		} else {
			balance -= amount;
			System.out.println("Withdrawl successful. Remaining balance : " + balance);
		}
	}

	public static void main(String[] args) {
		//withdraw(6000);
		try {
			withdraw(6000);
		} catch (ArithmeticException e) {
			// System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}
	}

}
