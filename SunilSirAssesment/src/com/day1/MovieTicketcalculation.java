package com.day1;

import java.util.Scanner;

public class MovieTicketcalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int noOfTickets = 0;
		float totalCost = 0;
		//String circleChoice=" ";
		System.out.print("Enter the no of ticket: ");
		int noOfTickets = sc.nextInt();
		if((noOfTickets < 5 || noOfTickets > 40)) {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			System.exit(0);
		}
		
		System.out.print("Do you want refreshment: ");
		String refChoice = sc.next();
		System.out.print("Do you have coupon code: ");
		String couponChoice = sc.next();
		System.out.print("Enter the circle: ");
		String circleChoice = sc.next();
		if(!(circleChoice.equalsIgnoreCase("K") || circleChoice.equalsIgnoreCase("Q"))) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		if(circleChoice.equalsIgnoreCase("k")) {
			totalCost = noOfTickets*75; 
		}else if(circleChoice.equalsIgnoreCase("Q")) {
			totalCost = noOfTickets*150;
		}
		
		
		if(noOfTickets>20) {
			totalCost -= totalCost/100*10;
		}
		
		
		if(couponChoice.equalsIgnoreCase("Y")) {
			totalCost -= totalCost/100*2;
		}
		
		if(refChoice.equalsIgnoreCase("Y")) {
			totalCost = totalCost+(noOfTickets*50);
		}
		
		System.out.printf("Ticket cost: %.2f",totalCost);

	}

}
