package com.day1;

import java.util.Scanner;

public class ResidentNameConcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inmate's name: ");
		String name = sc.nextLine();
		System.out.print("Inmate's father's name: ");
		String fname = sc.nextLine();
		
		System.out.println();
		if(isValid(name)) {
			String fullName = name.concat(" "+fname);
			System.out.println(fullName.toUpperCase());
		}else {
			System.out.println("\u001B[31mInvalid Name");
		}
	}
	
	public static boolean isValid(String name) {
		if(name.matches("[a-zA-Z ]+")) {
			return true;
		}
		return false;
	}
}
