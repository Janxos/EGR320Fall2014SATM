package edu.cbu.egr320.satm.guiclasses;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class TakeReceipt extends JPanel {

	/**
	 * Create the panel.
	 */
	public TakeReceipt() {
		setLayout(null);
		
		JLabel lblPleaseTakeYour = new JLabel("Please Take your receipt and card");
		lblPleaseTakeYour.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPleaseTakeYour.setBounds(40, 31, 370, 48);
		add(lblPleaseTakeYour);
		
		JLabel lblHaveARock = new JLabel("Have a Rock Solid day!");
		lblHaveARock.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblHaveARock.setBounds(89, 176, 272, 32);
		add(lblHaveARock);
	}

}
