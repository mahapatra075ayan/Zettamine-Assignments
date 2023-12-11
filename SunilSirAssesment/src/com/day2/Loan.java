package com.day2;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			double loanAmmount = employeeObj.getSalary()*0.15;
			return loanAmmount;
		}else if(employeeObj instanceof TemporaryEmployee) {
			double loanAmmount = employeeObj.getSalary()*0.1;
			return loanAmmount;
		}
		return -1;
		
	}
}
