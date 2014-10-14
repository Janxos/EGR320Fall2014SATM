package satm_interface_gui;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;


public class BalanceDisplay extends JPanel {

	/**
	 * Create the panel.
	 */
	public BalanceDisplay() {
		setBounds(0, 0, 325, 175);
		setLayout(null);
		
		JLabel lblYourCurrentBalance = new JLabel("Your current balance is:");
		lblYourCurrentBalance.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblYourCurrentBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCurrentBalance.setBounds(26, 21, 278, 55);
		add(lblYourCurrentBalance);
		
		JLabel lbl_balance = new JLabel("$dd,ddd.dd");
		lbl_balance.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lbl_balance.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_balance.setBounds(85, 97, 161, 55);
		add(lbl_balance);

	}

}
