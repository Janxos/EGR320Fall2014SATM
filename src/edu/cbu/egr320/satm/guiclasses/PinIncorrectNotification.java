package satm_interface_gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PinIncorrectNotification extends JPanel {

	/**
	 * Create the panel.
	 */
	public PinIncorrectNotification() {
		setLayout(null);
		
		JLabel lblIncorrectPin = new JLabel("Your PIN is incorrect.");
		lblIncorrectPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIncorrectPin.setBounds(98, 63, 128, 14);
		add(lblIncorrectPin);
		
		JLabel lblPleaseTryAgain = new JLabel("Please try again.");
		lblPleaseTryAgain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseTryAgain.setBounds(113, 78, 99, 22);
		add(lblPleaseTryAgain);

	}
}
