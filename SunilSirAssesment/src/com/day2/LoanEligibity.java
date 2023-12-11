package com.day2;

import java.util.Scanner;

public class LoanEligibity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id of employee: ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name of employee: ");
		String name = sc.nextLine();
		
		System.out.print("Choose type of Employee: [1.Permanent Employee 2. Temporary Employee] :");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter the basic pay: ");
			double basicPay = sc.nextDouble();
			Employee pm = new PermanentEmployee(empId, name, basicPay);
			System.out.println("Salary of the "+pm.getEmployeeName()+" is "+pm.getSalary());
			System.out.println("Loan Ammount is: "+new Loan().calculateLoanAmount(pm));
		}else if(choice == 2) {
			System.out.print("Enter the hours Worked: ");
			int hoursOfWork = sc.nextInt();
			System.out.print("Enter the hourly wages: ");
			int hourlyWages = sc.nextInt();
			Employee te = new TemporaryEmployee(empId, name, hoursOfWork, hourlyWages);
			System.out.println("Salary of the "+te.getEmployeeName()+" is "+te.getSalary());
			System.out.println("Loan Ammount is: "+new Loan().calculateLoanAmount(te));
		}
		
		

	}

}
