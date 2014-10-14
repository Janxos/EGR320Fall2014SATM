package satm_interface_gui;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class TransactionMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public TransactionMenu() {
		setBounds(0, 0, 325, 175);
		setLayout(null);
		
		JLabel lblPleaseSelectA = new JLabel("Please select a transaction");
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblPleaseSelectA.setBounds(33, 23, 284, 51);
		add(lblPleaseSelectA);
		
		JLabel lblWithdraw = new JLabel("Withdrawal \u25BA");
		lblWithdraw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWithdraw.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblWithdraw.setBounds(57, 85, 164, 41);
		add(lblWithdraw);
		
		JLabel lblDeposit = new JLabel("Deposit \u25BA");
		lblDeposit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeposit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblDeposit.setBounds(101, 124, 119, 41);
		add(lblDeposit);
		
		JLabel lblBalanceInquiry = new JLabel("Balance Inquiry \u25BA");
		lblBalanceInquiry.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBalanceInquiry.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblBalanceInquiry.setBounds(74, 153, 211, 41);
		add(lblBalanceInquiry);

	}
}
