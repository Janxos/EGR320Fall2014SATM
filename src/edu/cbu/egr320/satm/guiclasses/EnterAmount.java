package edu.cbu.egr320.satm.guiclasses;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;

public class EnterAmount extends JPanel {
	private JTextField myTextField;

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
		
		myTextField = new JTextField();
		myTextField.setBounds(58, 55, 200, 29);
		add(myTextField);
		myTextField.setColumns(10);
		
		JLabel lblEnterAmountIn = new JLabel("Enter amount in multiples of $10.");
		lblEnterAmountIn.setBounds(54, 88, 217, 50);
		add(lblEnterAmountIn);

	}
	public void setText(String myText){
		myTextField.setText(myText);
	}
	
	public String getText(){
		return myTextField.getText();
	}
	
	public void updateTextField(String numberValue){
		myTextField.setText(myTextField.getText() + numberValue);
	}

	public void clearTextField(){
		myTextField.setText("");
	}
}
