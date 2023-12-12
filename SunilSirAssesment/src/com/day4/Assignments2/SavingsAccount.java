package com.day4.Assignments2;

public class SavingsAccount extends Account{
	
	private double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}
	
	

	@Override
	public boolean withdraw(double amount) {
		if(this.balance - amount>minimumBalance) {
			this.balance = this.balance-amount;
			return true;
		}
		return false;
	}
}
