package edu.cbu.egr320.satm.guiclasses;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Screen4 extends JPanel {

	/**
	 * Author: Gunnar Bates
	 */
	public Screen4() {
		setLayout(null);
		
		JLabel lblInvalidAtmCard = new JLabel("Invalid ATM card.");
		lblInvalidAtmCard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInvalidAtmCard.setBounds(108, 65, 104, 14);
		add(lblInvalidAtmCard);
		
		JLabel lblItWillBe = new JLabel("It will be retained.");
		lblItWillBe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblItWillBe.setBounds(108, 89, 110, 14);
		add(lblItWillBe);

	}

}
