package edu.cbu.egr320.satm.domainclasses;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RecieptPrinter {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		public void PrintReciept(Account anAccount) {
			System.out.println(dateFormat.format(date));
			System.out.println("Rock Solid Bank");
			System.out.println(anAccount.getFirstName() + anAccount.getLastName());
			System.out.println("Your new balance");
			System.out.println(anAccount.getBalance());
			System.out.println("Thank you for using our SATM");
			System.out.println("Have a Rock Solid Day!");
		}
}