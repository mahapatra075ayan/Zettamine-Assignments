package com.day2;

public class TemporaryEmployee extends Employee{
	private int  hoursWorked;
    private int hourlyWages;
    
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		calculateSalary();
	}
	@Override
	public void calculateSalary() {
		salary = this.hoursWorked * this.hourlyWages;
		this.setSalary(salary);
		
	}
    
    

}
