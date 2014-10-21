package edu.cbu.egr320.satm.domainclasses;

public class InvalidATMCard {

	public void invalidPAN(String pan){
		SATMSession account = new SATMSession();
		if(account.accountExists(pan)==true){
			
		}
		
	}
}
