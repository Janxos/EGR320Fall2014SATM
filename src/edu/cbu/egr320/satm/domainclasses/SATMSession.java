/*
 * Author: Daniel Worthington 
 */

package edu.cbu.egr320.satm.domainclasses;

import java.util.LinkedList;
import java.util.ListIterator;
import java.io.*;


public class SATMSession {
	
	private LinkedList<Account> accountList = new LinkedList<Account>();

	
	//Constructor creates a new session and fills the accountList with the accounts from the text file.
	public SATMSession(){
		
		accountList.clear();
		
		BufferedReader inFile;
		
		
		try{
			inFile = new BufferedReader(new FileReader("accounts.txt"));
			
			String fileLine = inFile.readLine();
			
			while (fileLine != null) {
				
				String[] lineElement = fileLine.split("\t");
				
				Account newAccount = new Account(lineElement[0], lineElement[1], lineElement[2], Integer.parseInt(lineElement[3]), Double.parseDouble(lineElement[4]));
				accountList.add(newAccount);
				fileLine = inFile.readLine();
			}
			
			inFile.close();
		}catch(IOException e){
			System.out.println("There was a problem: " + e);
		}
	}
	
	//Checks to see if an account exists from a PAN
	public Boolean accountExists(String aPAN)	{
		
		ListIterator<Account> current = accountList.listIterator(0);
		boolean found = false;
		
		while (current.hasNext() && !found)	{
			
			if (current.next().getPAN().equals(aPAN))
				found = true;
			else
				found = false;
		}		
		return found;
	}
	
	//Retrieves an account from the accountList based on a PAN
	public Account retrieveAccount(String aPAN)	{
		
		ListIterator<Account> current = accountList.listIterator(0);
		Account account = new Account();
		boolean found = false;
		
		if (accountExists(aPAN) ) {
			
			while (current.hasNext() && !found)	{
				
				if (current.next().getPAN().equals(aPAN)) {
					found = true;
					account = current.previous();
					current.remove();
				}
			}	
			return account;
		}
		else
			return account;		
	}
	
	//If an account with the same PAN already exists, then the other attributes of the account are updated.
	//If the account does not exist, then it is simply added.
	public void addChangeAccount(Account anAccount)	{
		
		if (!accountExists(anAccount.getPAN()))
			accountList.add(anAccount);
		else	{
			Account newAccount = new Account();
			newAccount = retrieveAccount(anAccount.getPAN());
			
			newAccount.setFirstName(anAccount.getFirstName());
			newAccount.setLastname(anAccount.getLastName());
			newAccount.setPIN(anAccount.getPIN());
			newAccount.setBalance(anAccount.getBalance());
			
			accountList.add(newAccount);
		}
			
	}
	
	//Saves any changes made to the retrieved account and recreates the text file.
	public void closeSession(Account anAccount)	{
		
		addChangeAccount(anAccount);
		
		BufferedWriter out;
		
		try{
			out = new BufferedWriter(new FileWriter("accounts.txt"));
			
			while (accountList.size() != 0) {
				out.write(accountList.remove().printAccount());
				out.newLine();
			}
			
			out.close();
		}catch(IOException e){
			System.out.println("There was a problem: " + e);
		}	
		
	}	
	
}
