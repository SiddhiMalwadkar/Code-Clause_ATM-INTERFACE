package com.beans;

import java.util.Scanner;

public class Test {
	//Code Clause Atm Interface.
	//By Siddhi Malwadkar.
	Register register = new Register();
	Withdraw withdraw = new Withdraw();
	Deposit deposit = new Deposit();
	Transfer transfer = new Transfer();
	Integer Balance = 80000;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer Balance = 80000;
		while (true) {
			System.out.println("ATM INTERFACE");
			System.out.println("\n1.Login:");
			System.out.println("\n2.Withdraw:");
			System.out.println("\n3.Balance:");
			System.out.println("\n4.Deposit:");
			System.out.println("\n5.Tranfer:");
			System.out.println("\n6.Exit:");
			System.out.println("\nEnter your choice:");
			int Choice = sc.nextInt();
			switch (Choice) {
			case 1:
				Register.login();
				break;
			case 2:
				Withdraw.withdraw();
				break;
			case 3:
				System.out.println("Balance : " + Balance);
				break;
			case 4:
				Deposit.deposit();
				break;
			case 5:
				Transfer.transfer();
				break;
			case 6:
				System.exit(0);

			}
		}
	}
}
