package com.beans;

import java.util.Scanner;

public class Withdraw {
public static void withdraw() {
	Double Amount;
	float Balance=80000;
	Integer Transaction=0;
	String TransactionHistory = null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount to be withdrawn:");
	Amount=sc.nextDouble();
	try {
		if (Balance >= Amount) {
			System.out.println("Withdrawal Successfully done");
			String remove = "Rs" + Amount + "Withdrawn";
			TransactionHistory = TransactionHistory.concat(remove);
		} else {
			System.out.println("Insufficient Balance.");
		}
	} catch (Exception e) {
	}
}
}