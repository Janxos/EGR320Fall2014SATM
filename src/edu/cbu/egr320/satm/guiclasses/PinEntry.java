package satm_interface_gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PinEntry extends JPanel {
	private JTextField enterPIN;
	
	String pin;
	/**
	 * Create the panel.
	 */
	public PinEntry() {
		GridBagLayout pnlEnterPIN = new GridBagLayout();
		pnlEnterPIN.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		pnlEnterPIN.rowHeights = new int[]{0, 20, 0, 0, 0, 0, 0};
		pnlEnterPIN.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlEnterPIN.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(pnlEnterPIN);
		
		JLabel lblPleaseEnterYour = new JLabel("Please Enter Your PIN");
		lblPleaseEnterYour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblPleaseEnterYour = new GridBagConstraints();
		gbc_lblPleaseEnterYour.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleaseEnterYour.gridx = 3;
		gbc_lblPleaseEnterYour.gridy = 2;
		add(lblPleaseEnterYour, gbc_lblPleaseEnterYour);
		
		enterPIN = new JTextField();
		enterPIN.setEnabled(false);
		enterPIN.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_enterPIN = new GridBagConstraints();
		gbc_enterPIN.insets = new Insets(0, 0, 5, 5);
		gbc_enterPIN.gridx = 3;
		gbc_enterPIN.gridy = 3;
		add(enterPIN, gbc_enterPIN);
		enterPIN.setColumns(10);
	}
	
	public void setText(String myText){
		enterPIN.setText(myText);
	}
	
	public String getText(){
		return enterPIN.getText();
	}

}
