package edu.cbu.egr320.satm.guiclasses;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.SwingConstants;

import edu.cbu.egr320.satm.libraryclasses.SATMLibrary;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ATMInterface extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMInterface frame = new ATMInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ATMInterface() {		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 500, 500);
		getContentPane().setLayout(null);
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 15));
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setBounds(180, 222, 42, 30);
		getContentPane().add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setBounds(228, 222, 42, 30);
		getContentPane().add(btnNum2);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setBounds(180, 264, 42, 30);
		getContentPane().add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setBounds(228, 264, 42, 30);
		getContentPane().add(btnNum5);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setBounds(180, 306, 42, 30);
		getContentPane().add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setBounds(228, 306, 42, 30);
		getContentPane().add(btnNum8);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setBounds(228, 348, 42, 30);
		getContentPane().add(btnNum0);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setBounds(276, 222, 42, 30);
		getContentPane().add(btnNum3);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setBounds(276, 264, 42, 30);
		getContentPane().add(btnNum6);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setBounds(276, 306, 42, 30);
		getContentPane().add(btnNum9);
		
		JButton receiptBtn = new JButton("Printed Receipt");
		receiptBtn.setBounds(35, 222, 122, 25);
		getContentPane().add(receiptBtn);
		
		JButton cashDispenserBtn = new JButton("Cash Dispenser");
		cashDispenserBtn.setBounds(35, 402, 213, 25);
		getContentPane().add(cashDispenserBtn);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.setBounds(388, 306, 75, 30);
		getContentPane().add(clearBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(388, 348, 75, 30);
		getContentPane().add(cancelBtn);
		
		JButton depositSlipBtn = new JButton("Deposit Slip");
		depositSlipBtn.setBounds(307, 402, 156, 25);
		getContentPane().add(depositSlipBtn);
		
		JButton enterBtn = new JButton("Enter");
		enterBtn.setBounds(388, 264, 75, 30);
		getContentPane().add(enterBtn);
		
		JButton cardSlotBtn = new JButton("Card Slot");
		cardSlotBtn.setBounds(354, 222, 109, 25);
		getContentPane().add(cardSlotBtn);
		
		JButton leftSideButton4 = new JButton("");
		leftSideButton4.setBounds(35, 118, 30, 30);
		getContentPane().add(leftSideButton4);
		
		JButton leftSideButton3 = new JButton("");
		leftSideButton3.setBounds(35, 159, 30, 30);
		getContentPane().add(leftSideButton3);
		
		JButton leftSideButton2 = new JButton("");
		leftSideButton2.setBounds(35, 77, 30, 30);
		getContentPane().add(leftSideButton2);
		
		JButton leftSideButton1 = new JButton("");
		leftSideButton1.setBounds(35, 36, 30, 30);
		getContentPane().add(leftSideButton1);
		
		JButton rightSideButton4 = new JButton("");
		rightSideButton4.setBounds(434, 159, 30, 30);
		getContentPane().add(rightSideButton4);
		
		JButton rightSideButton3 = new JButton("");
		rightSideButton3.setBounds(434, 118, 30, 30);
		getContentPane().add(rightSideButton3);
		
		JButton rightSideButton2 = new JButton("");
		rightSideButton2.setBounds(434, 77, 30, 30);
		getContentPane().add(rightSideButton2);
		
		JButton rightSideButton1 = new JButton("");
		rightSideButton1.setBounds(434, 36, 30, 30);
		getContentPane().add(rightSideButton1);
		
		final JPanel screenContainer = new JPanel();
		final CardLayout screenLayout = new CardLayout();
		screenContainer.setBounds(87, 25, 325, 175);
		getContentPane().add(screenContainer);
		screenContainer.setLayout(screenLayout);
		
		JButton btnCycleScreens = new JButton("Cycle Screens");
		btnCycleScreens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				screenLayout.next(screenContainer);
			}
		});
		btnCycleScreens.setBounds(35, 306, 122, 30);
		getContentPane().add(btnCycleScreens);
		
		final Screen1 screen1 = new Screen1();
		screenContainer.add(screen1);
		screen1.setName("Welcome Screen");
	
		final PinEntry screen2 = new PinEntry();
		screenContainer.add(screen2);
		screen2.setName("PIN Entry");
		
		JPanel screen3 = new PinIncorrectNotification();
		screenContainer.add(screen3);
		screen3.setName("Pin Incorrect Notification");
		
		final InvalidATMCard screen4 = new InvalidATMCard();
		screenContainer.add(screen4);
		screen4.setName("Invalid ATM Card");
		
		JPanel screen5 = new Screen5();
		screenContainer.add(screen5);
		screen5.setName("Transaction Menu");
		
		JPanel screen6 = new Screen6();
		screenContainer.add(screen6);
		screen6.setName("Balance Display");
		
		final EnterAmount screen7 = new EnterAmount();
		screenContainer.add(screen7);
		screen7.setName("Enter Amount");
		
		JPanel screen8 = new InsufficientFunds();
		screenContainer.add(screen8);
		screen8.setName("Insufficient Funds");
		
		final ATMcashPanel screen9 = new ATMcashPanel();
		screenContainer.add(screen9);
		screen9.setName("ATM Cash Panel");
		
		JPanel screen10 = new NoWithdraw();
		screenContainer.add(screen10);
		screen10.setName("No Withdrawal");
		
		JPanel screen11 = new TakeCash();
		screenContainer.add(screen11);
		screen11.setName("Take Cash");
		
		JPanel screen12 = new UnableToProcessDeposits();
		screenContainer.add(screen12);
		screen12.setName("Deposit Error");
		
		JPanel screen13 = new insertDepositGUI();
		screenContainer.add(screen13);
		screen13.setName("Insert Deposit GUI");
		
		JPanel screen14 = new balancePrint();
		screenContainer.add(screen14);
		screen14.setName("Balance Print");
		
		JPanel screen15 = new TakeReceipt();
		screenContainer.add(screen15);
		screen15.setName("Take Receipt");
		
		//Jacob Frey 10/14/2014
		//Custom action listener to take the buttons when they are pressed and append them into the screen on the
		//appropriate one
		ActionListener numberListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton thisButton = (JButton)e.getSource();
				String currentScreenName = SATMLibrary.getCurrentCardString(screenContainer);
				String buttonValue = thisButton.getText();
				
				//Create a method in each panel that appends a string into the panels text field, then call that 
				//method in this method
				switch(currentScreenName){
				case "PIN Entry":
					screen2.updateTextField(buttonValue);
					break;
				case "Enter Amount":
					screen7.updateTextField(buttonValue);
					break;
				case "ATM Cash Panel":
					screen9.updateTextField(buttonValue);
					break;
				}
			}
		};
		
		btnNum1.addActionListener(numberListener);
		btnNum2.addActionListener(numberListener);
		btnNum3.addActionListener(numberListener);
		btnNum4.addActionListener(numberListener);
		btnNum5.addActionListener(numberListener);
		btnNum6.addActionListener(numberListener);
		btnNum7.addActionListener(numberListener);
		btnNum8.addActionListener(numberListener);
		btnNum9.addActionListener(numberListener);
		btnNum0.addActionListener(numberListener);
		
		//Jacob Frey 10/15/2014
		//Action listener clear the entry in the text field when the clear button is pressed
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentScreenName = SATMLibrary.getCurrentCardString(screenContainer);
				
				switch(currentScreenName){
				case "PIN Entry":
					screen2.clearTextField();
					break;
				case "Enter Amount":
					screen7.clearTextField();
					break;
				case "ATM Cash Panel":
					screen9.clearTextField();
					break;
				}	
			}
		});
		
		//Jacob Frey 10/16/2014
		//The start of a listener for the enter button that will have various commands on different screens
		//Most of the time, it will call methods that will check the current text field value against the value
		//that is a part of a class
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String currentScreenName = SATMLibrary.getCurrentCardString(screenContainer);
				
				switch(currentScreenName){
				case "PIN Entry":
					//Call method to check number against account class
					break;
				case "Enter Amount":
					
					break;
				case "ATM Cash Panel":
					
					break;
				
				}					
			}
		});
		
		//Jacob Frey 10/02/214
		//A helpful button that will not be in the final project
		//Allows us to cycle through the screens in the gui
		cashDispenserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String currentScreen = SATM_Library.getCurrentCard(screenContainer);

			}
		});
	}
}