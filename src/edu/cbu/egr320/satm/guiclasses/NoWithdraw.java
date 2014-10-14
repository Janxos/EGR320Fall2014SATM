package satm_interface_gui;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.UIManager;


public class NoWithdraw extends JPanel {

	/**
	 * Create the panel.
	 */
	public NoWithdraw() {
		setLayout(null);
		
		JTextPane txtpnError = new JTextPane();
		txtpnError.setEditable(false);
		txtpnError.setBackground(UIManager.getColor("Button.background"));
		txtpnError.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtpnError.setText("ERROR");
		txtpnError.setBounds(133, 43, 74, 31);
		add(txtpnError);
		
		JTextPane txtpnUnableToProcess = new JTextPane();
		txtpnUnableToProcess.setEditable(false);
		txtpnUnableToProcess.setBackground(UIManager.getColor("Button.background"));
		txtpnUnableToProcess.setText("Unable to process withdrawls");
		txtpnUnableToProcess.setBounds(90, 85, 180, 20);
		add(txtpnUnableToProcess);

	}

}
