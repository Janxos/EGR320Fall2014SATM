//author Jason Alvarez 10/20/14

package edu.cbu.egr320.satm.domainclasses;

import java.util.Scanner;


public class Card_Slot

{
		
	boolean cardIsInserted = false; //assume that there is no card inserted by default
	String PAN = "1234567864643201";
	Scanner scanCard = new Scanner (System.in);
			


public static boolean cardSlotButton (boolean a)
{
	if (a = false) //If the card is not in, then it is now inserted
	{
		a = true;
	}
	
	else           //If the card is in, then it is now ejected
	{
		a = false; 
	}
	return a; //Alert the system if there is a card inserted or not
}

public String readCard (String b)
{
	//String PAN = scanCard.nextLine(); //It is assumed that the card will have its PAN read by the scanner when inserted
	return PAN; //the PAN is returned to the system

}

}
	
