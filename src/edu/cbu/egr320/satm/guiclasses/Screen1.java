package satm_interface_gui;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;


public class Screen1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Screen1() {
		setLayout(null);
						
		JLabel lblNewLabel = new JLabel("Rock Solid Federal Credit Union");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(42, 81, 240, 14);
		add(lblNewLabel);
		
		JLabel lblWelcome = new JLabel("Welcome to");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblWelcome.setBounds(0, 52, 325, 14);
		add(lblWelcome);
		
		JLabel lblNewLabel_1 = new JLabel("Please insert your ATM card");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(58, 110, 209, 14);
		add(lblNewLabel_1);
	}

}
