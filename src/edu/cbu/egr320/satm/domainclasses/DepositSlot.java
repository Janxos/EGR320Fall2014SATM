package edu.cbu.egr320.satm.domainclasses;


public class DepositSlot {
	private Account someAccount;
	private double amount;
	
	public DepositSlot(Account a){
		someAccount.equals(a);
	}
	
	public void makeDeposit(double amount){
		if (amount >= 0) {
			someAccount.deposit(amount);
		}
	}
	
	public double getDepositAmount() {
		return amount;
	}
}
