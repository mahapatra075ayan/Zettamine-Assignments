package com.day2;

import java.util.Scanner;

public class TicketPriceCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket tc = new Ticket();
		
		System.out.print("Enter no of bookings: ");
		int noOfbook = sc.nextInt();
		System.out.println();
		System.out.print("Enter the available tickets: ");
		Ticket.setAvailableTickets(sc.nextInt());
		
		for(int i = 0; i < 2; i++) {
			System.out.print("Enter the ticketid: ");
			tc.setTicketid(sc.nextInt());
			
			System.out.print("Enter the price: ");
			tc.setPrice(sc.nextInt());
			
			System.out.print("Enter the no of tickets: ");
			int noOftickets = sc.nextInt();
			
			System.out.println();
			System.out.println("Available tickets: "+Ticket.getAvailableTickets());
			System.out.println("Total amount: "+tc.calculateTicketCost(noOftickets));
			System.out.println("Available ticket after booking: "+Ticket.getAvailableTickets());
			System.out.println();
		}
		

	}

}
