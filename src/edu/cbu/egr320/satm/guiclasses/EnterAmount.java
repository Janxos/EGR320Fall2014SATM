package satm_interface_gui;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;

public class EnterAmount extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public EnterAmount() {
		setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(6, 140, 100, 29);
		add(btnCancel);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.setBounds(219, 140, 100, 29);
		add(btnAccept);
		
		JLabel lblEnterAmmount = new JLabel("Enter Amount");
		lblEnterAmmount.setBounds(115, 6, 100, 50);
		add(lblEnterAmmount);
		
		textField = new JTextField();
		textField.setBounds(58, 55, 200, 29);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterAmountIn = new JLabel("Enter amount in multiples of $10.");
		lblEnterAmountIn.setBounds(54, 88, 217, 50);
		add(lblEnterAmountIn);

	}
}
