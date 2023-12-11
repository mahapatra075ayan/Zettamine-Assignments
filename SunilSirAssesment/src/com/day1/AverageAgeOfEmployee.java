package com.day1;

import java.util.Scanner;

public class AverageAgeOfEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total no. of employees: ");
		int noOfEmployees = sc.nextInt();
		int[] age = new int[noOfEmployees];
		
		if(noOfEmployees >= 2)
		{
			System.out.printf("Enter the age for %d employees: ",noOfEmployees);
			System.out.println();
			for (int i = 0; i < age.length; i++) {
					age[i] = sc.nextInt();
			}
			for (int i = 0; i < age.length; i++) {
				if(age[i]<28 || age[i]>40) {
					System.out.println("Invalid Age Encountered");
					System.exit(0);
				}
			}
			System.out.printf("The average age is %.2f",calculateAverage(age));
		}else {
			System.out.println("Please enter a valid employee count");
		}
		
	
		
		
		

	}
	
	public static float calculateAverage(int[] age) {
		int sum =0;
		for(int i = 0; i < age.length; i++) {
			sum = sum + age[i];	
		}
		return (float) sum/age.length;
		
	}

}
