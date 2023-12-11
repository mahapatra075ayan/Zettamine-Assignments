package com.day1;

import java.util.Scanner;

public class BillGenerate1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter the no of pizzas bought: ");
		int noOfPizza = sc.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		int noOfPuffs = sc.nextInt();
		System.out.print("Enter the no of cold drinks bought: ");
		int noOfColdDrinks = sc.nextInt(); 
		System.out.println();
		System.out.println();
		generateBill(noOfPizza,noOfPuffs,noOfColdDrinks);
	}
	
	
	public static void generateBill(int noOfPizzas,int noOfPuffs,int noOfColdDrinks) {
		System.out.println("Bill Details");
		System.out.printf("No of Pizzas:\t\t%d\tCost:%d\n",noOfPizzas,100*noOfPizzas);
		System.out.printf("No of Puffs:\t\t%d\tCost:%d\n",noOfPuffs,20*noOfPuffs);
		System.out.printf("No of Cold Drinks:\t%d\tCost:%d\n",noOfColdDrinks,10*noOfColdDrinks);
		System.out.println();
		System.out.println();
		System.out.println("Total Price="+(100*noOfPizzas+20*noOfPuffs+10*noOfColdDrinks));
		System.out.println("ENJOY THE SHOW!");
	}
	


}
