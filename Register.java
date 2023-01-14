package com.beans;

import java.util.Scanner;

public class Register {
	
    public static void login() {
    Scanner sc=new Scanner(System.in);
	String AccountHolderName;
	Double Password;
	Double AccountNumber;
	System.out.println("Enter AccountHolderName:");
	AccountHolderName=sc.next();
	System.out.println("Enter Password:");
	Password=sc.nextDouble();
	System.out.println("Enter AccountNumber only last 4 digits:");
	AccountNumber=sc.nextDouble();
	System.out.println("Login Completed!!");
	
}
   
}
