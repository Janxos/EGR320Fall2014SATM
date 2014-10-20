package edu.cbu.egr320.satm.guiclasses;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Screen2 extends JPanel {
	private JTextField enterPIN;
	
	String pin;
	/**
	 * Author: Gunnar Bates
	 */
	public Screen2() {
		GridBagLayout pnlEnterPIN = new GridBagLayout();
		pnlEnterPIN.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		pnlEnterPIN.rowHeights = new int[]{0, 20, 0, 0, 0, 0, 0};
		pnlEnterPIN.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlEnterPIN.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(pnlEnterPIN);
		
		JLabel lblPleaseEnterYour = new JLabel("Please Enter Your PIN");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblPleaseEnterYour = new GridBagConstraints();
		gbc_lblPleaseEnterYour.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleaseEnterYour.gridx = 3;
		gbc_lblPleaseEnterYour.gridy = 2;
		add(lblPleaseEnterYour, gbc_lblPleaseEnterYour);
		
		enterPIN = new JTextField();
		enterPIN.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_enterPIN = new GridBagConstraints();
		gbc_enterPIN.insets = new Insets(0, 0, 5, 5);
		gbc_enterPIN.gridx = 3;
		gbc_enterPIN.gridy = 3;
		add(enterPIN, gbc_enterPIN);
		enterPIN.setColumns(10);
	}

}
