package com.day2;

public class PermanentEmployee extends Employee{

	private double basicPay;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		calculateSalary();
	}
	
	@Override
	public void calculateSalary() {
		double PF_Amount =  (double) (this.basicPay * 0.12); 
		this.setSalary(this.basicPay- PF_Amount);
		
	}


	
	
}
