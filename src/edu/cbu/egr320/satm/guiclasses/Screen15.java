
//author Jason Alvarez , 10/20/14

package edu.cbu.egr320.satm.guiclasses;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;


public class Screen15 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Screen15() {
		setLayout(null);
		
		JLabel lblPleaseTakeYour = new JLabel("Please Take your receipt and card");
		lblPleaseTakeYour.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPleaseTakeYour.setBounds(40, 31, 370, 48);
		add(lblPleaseTakeYour);
		
		JLabel lblHaveARock = new JLabel("Have a Rock Solid day!");
		lblHaveARock.setFont(new Font("Arial", Font.PLAIN, 15));
		lblHaveARock.setBounds(89, 176, 272, 32);
		add(lblHaveARock);

	}

}
