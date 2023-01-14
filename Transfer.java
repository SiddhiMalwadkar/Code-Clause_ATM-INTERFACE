package com.beans;

import java.util.Scanner;

public class Transfer {
public static void transfer() {
	Double Amount;
	String AccountHolderName;
	Integer Balance=80000;
	String TransactionHistory = null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter account holder's name:");
	AccountHolderName=sc.next();
	System.out.println("Enter the amount to be transferred:");
	 Amount = sc.nextDouble();
	try {
		if (Balance >= Amount) {
			if (Amount <= 80000.00) {
				Balance++;
				System.out.println("Amount successfully transferred to:" +AccountHolderName);
				String string = "Rs" + Amount + "transferred";
				TransactionHistory = TransactionHistory.concat(string);
			} else
				System.out.println("Sorry it has gone failed");
		} else
			System.out.println("Insufficient balance.");
	} catch (Exception e) {
	}





}}