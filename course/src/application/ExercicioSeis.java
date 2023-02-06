package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ExercicioSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount BankAccount;
		
		System.out.print("Enter a account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter a account holder: ");
		sc.nextLine();
		String holder = sc.next();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			BankAccount = new BankAccount(number, holder, initialDeposit);
		}
		else {
			BankAccount = new BankAccount(number, holder);
		}
		
		
		System.out.println();
		System.out.println("Account Data: " + BankAccount);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		BankAccount.deposit(depositValue);
		System.out.println("Updated data: " + BankAccount);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		BankAccount.withdraw(withdrawValue);
		System.out.println("Updated data: " + BankAccount);
		
		sc.close();

	}

}
