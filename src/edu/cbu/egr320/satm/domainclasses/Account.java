package edu.cbu.egr320.satm.domainclasses;


public class Account {
	
	private String firstName;
	private String lastName;
	private String PAN;
	private int PIN;
	private double balance;
	
	//Constructors
	public Account() {
		firstName = "";
		lastName = "";
		PAN = "";
		PIN = 0;
		balance = 0;
	}
	
	public Account(String aFirstName, String aLastName, String aPAN, int aPIN, double aBalance) {		
		firstName = aFirstName;
		lastName = aLastName;
		PAN = aPAN;
		PIN = aPIN;
		balance = aBalance;		
	}
	
	//Get Methods
	public String getFirstName()
	{	return firstName;	}
	
	public String getLastName()
	{	return lastName;	}
	
	public String getPAN()
	{	return PAN;	}
	
	public int getPIN()
	{	return PIN;	}
	
	public double getBalance()
	{	return balance;	}
	
	//Set Methods
	public void setFirstName(String aFirstName)
	{	firstName = aFirstName;	}
	
	public void setLastname(String aLastName)
	{	lastName = aLastName;	}
	
	public void	setPAN(String aPAN)
	{	PAN = aPAN;	}
	
	public void setPIN(int aPIN)
	{	PIN = aPIN;	}
	
	public void setBalance(double aBalance)
	{	balance = aBalance;	}
	
	//Action Methods
	public void withdraw(double anAmount)
	{	
		if (isSufficientFunds(anAmount))
			balance -= anAmount;
	}
	
	public void deposit(double anAmount)
	{	balance +=	anAmount;	}
	
	public Boolean isSufficientFunds(double anAmount)
	{	return (balance >= anAmount);	}
	
	public String printAccount()	{
		return(this.firstName + "\t" + this.lastName + "\t" + this.PAN + "\t" + Integer.toString(this.PIN) + "\t" + Double.toString(this.balance));
	}
	
}
