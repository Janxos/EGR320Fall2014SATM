/*
 * Author: Daniel Worthington
 */

package edu.cbu.egr320.satm.guiclasses;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;


public class Screen6 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Screen6() {
		setBounds(0, 0, 325, 175);
		setLayout(null);
		
		JLabel lblYourCurrentBalance = new JLabel("Your current balance is:");
		lblYourCurrentBalance.setFont(new Font("Arial", Font.PLAIN, 15));
		lblYourCurrentBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCurrentBalance.setBounds(24, 31, 278, 55);
		add(lblYourCurrentBalance);
		
		JLabel lbl_balance = new JLabel("$dd,ddd.dd");
		lbl_balance.setFont(new Font("Arial", Font.PLAIN, 15));
		lbl_balance.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_balance.setBounds(104, 86, 122, 42);
		add(lbl_balance);

	}

}
