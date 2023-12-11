package com.day2;

import java.util.Scanner;

public class BankApplication {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		do {
			menuPrint();
			System.out.print("Enter an option: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("---BYE BYE---");
				System.out.println("terminate the Application");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Operation...Please try again...");
				break;
			}
		}while(choice!=0);

	}
	
	public static void menuPrint() {
		System.out.println("1.Create Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Details");
		System.out.println("5.Exit");
	}
}
