package satm_interface_gui;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsufficientFunds extends JPanel {

	/**
	 * Create the panel.
	 */
	public InsufficientFunds() {
		setLayout(null);
		
		JLabel lblInsufficientFunds = new JLabel("Insufficient Funds");
		lblInsufficientFunds.setBounds(102, 35, 149, 50);
		add(lblInsufficientFunds);
		
		JButton button = new JButton("Cancel");
		button.setBounds(109, 115, 100, 29);
		add(button);

	}

}
