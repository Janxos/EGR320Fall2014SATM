package edu.cbu.egr320.satm.guiclasses;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class TakeCash extends JPanel {

	/**
	 * Create the panel.
	 */
	public TakeCash() {
		//setLayout(new MigLayout("", "[315.00px]", "[14px][14px][4.00][8.00][][]"));
		
		JLabel lblYourBalanceIs = new JLabel("Your balance is being updated. Please ");
		lblYourBalanceIs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblYourBalanceIs, "cell 0 4,alignx center,aligny top");
		
		JLabel lblTakeCashFrom = new JLabel("take cash from the dispenser.");
		lblTakeCashFrom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(lblTakeCashFrom, "cell 0 5,alignx center,aligny top");
	}

}
