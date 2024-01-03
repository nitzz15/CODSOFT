package codSoftTasks;


import java.util.Scanner;

public class ATM {

	static Account acc1 = new Account(001, 10000);

	public static void showBalance() {
		System.out.println(acc1.getBalance());
	}

	public static void deposite(double amount) {
		acc1.deposit(amount);
		System.out.println("transaction successful");
	}

	public static void withdraw(double amount) {
		if (acc1.getBalance() < amount) {
			System.out.println("sorry insufficiant account balance");
			return;
		} else {
			acc1.withdraw(amount);

		}

		System.out.println("transaction successful");

	}

	public static void main(String[] args) {

		System.out.println("WELCOME TO ATM ...\r\n" + "PLEASE SELECT ANY SERVICE FROM BELOW(enter a number) \r\n"
				+ "1.Show Balance\r\n" + "2.Withdraw \r\n" + "3.Deposite\r\n" + "");

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		if (i == 1) {
			showBalance();
		} else if (i == 2) {
			System.out.println("Enter the amount to withdraw");
			double amount = sc.nextDouble();
			withdraw(amount);
			System.out.println("do u want to view your account balance?(1.yes/2.no)\n select number");
			int j = sc.nextInt();
			if (j == 1)
				showBalance();
			else if (j == 2)
				System.out.println("Transaction ends");

		} else if (i == 3) {
			System.out.println("Enter the amount to deposite");
			double amount = sc.nextDouble();
			deposite(amount);
			System.out.println("do u want to view your account balance?(1.yes/2.no)\n select number");
			int j = sc.nextInt();
			if (j == 1)
				showBalance();
			else if (j == 2)
				System.out.println("Transaction ends");

		} else
			System.out.println("please choose correct number");

	}
}

class Account {
	private int accountNo;
	private double balance;

	public Account(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		balance = balance - amount;

	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

}
