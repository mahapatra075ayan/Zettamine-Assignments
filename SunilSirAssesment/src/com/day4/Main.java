package com.day4;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		

	}
	
	public static Hosteller getHostellerDetails(){
		System.out.print("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int sId = sc.nextInt();
		System.out.print("Student Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Department Id: ");
		int deptId = sc.nextInt();
		System.out.println("Gender[M/F]: ");
		String gender = sc.next();
		System.out.print("Phone Number: ");
		String phone = sc.next();
		
	}

}
