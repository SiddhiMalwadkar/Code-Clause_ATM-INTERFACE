package com.beans;

import java.util.Scanner;

public class Deposit {
public static void deposit() {
	Integer Deposit;
	Integer Balance=80000;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the money to be deposited:");
	Deposit=sc.nextInt();	
	Balance=Balance+Deposit;
    System.out.println("Your money has been successfully deposited!!");
    System.out.println("");
    
	
}
}
