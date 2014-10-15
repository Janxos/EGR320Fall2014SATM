package edu.cbu.egr320.satm.libraryclasses;

import javax.swing.*;
import java.awt.*;

public class SATMLibrary {

	//Jacob Frey 10/15/2014
	//A dummy method that is helpful in testing to see if the library is working properly
	public static int add(int x, int y){
		return x + y;
	}
	
	//Jacob Frey 10/14/2014
	//Returns the string name representation of the panel that is at the top of the atm
	public static String getCurrentCardString(JPanel container)
	{
	    JPanel card = null;
	    for (Component comp : container.getComponents() ) {
	        if (comp.isVisible() == true) {
	            card = (JPanel)comp;
	        }
	    }
	    return card.getName();
	}
	
	//Jacob Frey 10/14/2014
	//Returns a reference to the actual panel that is at the top
	public static JPanel getCurrentCard(JPanel container)
	{
	    JPanel card = null;
	    for (Component comp : container.getComponents() ) {
	        if (comp.isVisible() == true) {
	            card = (JPanel)comp;
	        }
	    }
	    return card;
	}
	
	//Jacob Frey 10/2/14
	//This method may not be needed due to other developments in the program.  Will keep for now but may 
	//end up deleting
	public static String numberPressed(String buttonValue, String currentPanel){
		switch(currentPanel){
		case "PIN Entry":
		case "Enter Amount":
		case "ATM Cash Panel":
			System.out.println(Integer.parseInt(buttonValue));
			//Pass the text value to the screen as an int
			break;
		}
		return "";
	}
}
