package com.day4;

import java.util.Scanner;

public class AccountManipulationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter A/C number: ");
		int acNo = sc.nextInt();
		System.out.print("enter customer id: ");
		int cusId = sc.nextInt();
		System.out.print("enter customer name: ");
		sc.nextLine();
		String custName = sc.nextLine();
		System.out.print("enter customer email: ");
		String custEmail = sc.next();
		System.out.print("enter balance: ");
		double balance = sc.nextDouble();
		System.out.print("enter minimum balance: ");
		double minBal = sc.nextDouble();
		
		Customer c = new Customer(cusId, custName, custEmail);
		SavingsAccount sv = new SavingsAccount(acNo, c, balance, minBal);
		System.out.println();
		
		System.out.print("enter amount to withdraw: ");
		double withdrawAmmount = sc.nextDouble();
		sc.close();
		
		if(sv.withdraw(withdrawAmmount)) {
			System.out.println("Rs."+withdrawAmmount+" debited"+" | "+"Balance: "+sv.getBalance());
		}

		

	}

}
