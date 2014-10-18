/*
 * Author: Daniel Worthington 
 */

package edu.cbu.egr320.satm.guiclasses;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Screen5 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Screen5() {
		setBounds(0, 0, 325, 175);
		setLayout(null);
		
		JLabel lblPleaseSelectA = new JLabel("Please select a transaction");
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPleaseSelectA.setBounds(42, 11, 241, 41);
		add(lblPleaseSelectA);
		
		JLabel lblWithdraw = new JLabel("Withdrawal \u25BA");
		lblWithdraw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWithdraw.setFont(new Font("Arial", Font.PLAIN, 15));
		lblWithdraw.setBounds(151, 51, 164, 32);
		add(lblWithdraw);
		
		JLabel lblDeposit = new JLabel("Deposit \u25BA");
		lblDeposit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeposit.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDeposit.setBounds(196, 94, 119, 32);
		add(lblDeposit);
		
		JLabel lblBalanceInquiry = new JLabel("Balance Inquiry \u25BA");
		lblBalanceInquiry.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBalanceInquiry.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBalanceInquiry.setBounds(104, 132, 211, 32);
		add(lblBalanceInquiry);

	}
}
