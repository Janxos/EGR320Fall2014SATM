//author Jason Alvarez , 10/20/14

package edu.cbu.egr320.satm.guiclasses;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class CreateModifyAccount extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPan;
	private JTextField txtPin;
	private JTextField txtBalance;

	/**
	 * Create the panel.
	 */
	public CreateModifyAccount() {
		setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setFont(new Font("Arial", Font.PLAIN, 15));
		txtFirstName.setBounds(25, 52, 61, 20);
		add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setFont(new Font("Arial", Font.PLAIN, 15));
		txtLastName.setBounds(93, 52, 61, 20);
		add(txtLastName);
		txtLastName.setColumns(10);
		
		txtPan = new JTextField();
		txtPan.setFont(new Font("Arial", Font.PLAIN, 15));
		txtPan.setText("PAN");
		txtPan.setBounds(25, 79, 129, 20);
		add(txtPan);
		txtPan.setColumns(10);
		
		txtPin = new JTextField();
		txtPin.setFont(new Font("Arial", Font.PLAIN, 15));
		txtPin.setText("PIN");
		txtPin.setBounds(25, 103, 129, 20);
		add(txtPin);
		txtPin.setColumns(10);
		
		JButton btnNewButton = new JButton("Find Account\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Scanner readPan = new Scanner (System.in); 
//				{
				//		if (accountFound = True)
				//		{
				//			getFirstName(txtFirstName)
				//			getLastName(txtLastName)
				//			getBalance(txtBalance)
				//			gsetPin(txtPin)
				//		}
				//		else
				//		{jpanel.setText "this account was not found}
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(169, 79, 107, 20);
		add(btnNewButton);
		
		JButton btnSaveAccount = new JButton("Save Account");
		btnSaveAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//txtPan
			//	findAccount(txtPan)
			//	{
			//		if (accountFound = True)
			//		{
			//			setFirstName(txtFirstName)
			//			setLastName(txtLastName)
			//			setBalance(txtBalance)
			//			setPin(txtPin)
			//      	lblNotification.setText "this account has now been modified"
			//		}
			//		Else
			//          	setFirstName(txtFirstName)
				//			setLastName(txtLastName)
				//			setBalance(txtBalance)
				//			setPin(txtPin)
				//			setPan (txtPan)
				//          lblNotification.setText "A new account was created"
			//	}
				
			}
		});
		btnSaveAccount.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSaveAccount.setBounds(169, 128, 107, 20);
		add(btnSaveAccount);
		
		JLabel lblCreateANew = new JLabel("Create a new account, or modify one.");
		lblCreateANew.setBounds(15, 16, 284, 20);
		add(lblCreateANew);
		
		txtBalance = new JTextField();
		txtBalance.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBalance.setText("Balance");
		txtBalance.setBounds(25, 128, 129, 20);
		add(txtBalance);
		txtBalance.setColumns(10);
		
		JLabel lblNotification = new JLabel("");
		lblNotification.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNotification.setBounds(169, 50, 141, 20);
		add(lblNotification);

	}
}
