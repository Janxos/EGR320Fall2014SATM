package satm_interface_gui;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class ATMcashPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField MoneyInput;

	/**
	 * Create the panel.
	 */
	public ATMcashPanel() {
		setLayout(null);
		
		JTextPane txtpnPrompt = new JTextPane();
		txtpnPrompt.setEditable(false);
		txtpnPrompt.setBackground(UIManager.getColor("Button.background"));
		txtpnPrompt.setText("Please choose one of the options or enter a multiple of $10.");
		txtpnPrompt.setBounds(74, 36, 196, 51);
		add(txtpnPrompt);
		
		MoneyInput = new JTextField();
		MoneyInput.setBackground(UIManager.getColor("Button.disabledShadow"));
		MoneyInput.setEditable(false);
		MoneyInput.requestFocus();
		MoneyInput.setBounds(141, 91, 57, 20);
		add(MoneyInput);
		MoneyInput.setColumns(10);
		
		JTextPane $10 = new JTextPane();
		$10.setEditable(false);
		$10.setBackground(UIManager.getColor("Button.background"));
		$10.setText("$10");
		$10.setBounds(10, 11, 24, 20);
		add($10);
		
		JTextPane $20 = new JTextPane();
		$20.setEditable(false);
		$20.setBackground(UIManager.getColor("Button.background"));
		$20.setText("$20");
		$20.setBounds(10, 54, 24, 20);
		add($20);
		
		JTextPane $30 = new JTextPane();
		$30.setEditable(false);
		$30.setBackground(UIManager.getColor("Button.background"));
		$30.setText("$30");
		$30.setBounds(10, 96, 24, 20);
		add($30);
		
		JTextPane $40 = new JTextPane();
		$40.setEditable(false);
		$40.setBackground(UIManager.getColor("Button.background"));
		$40.setText("$40");
		$40.setBounds(10, 139, 24, 20);
		
		add($40);
		
		JTextPane cents = new JTextPane();
		cents.setEditable(false);
		cents.setBackground(UIManager.getColor("Button.background"));
		cents.setText(".00");
		cents.setBounds(197, 91, 24, 20);
		add(cents);
		
		JTextPane unit = new JTextPane();
		unit.setEditable(false);
		unit.setBackground(UIManager.getColor("Button.background"));
		unit.setText("$");
		unit.setBounds(129, 91, 12, 20);
		add(unit);
		
		JTextPane $50 = new JTextPane();
		$50.setEditable(false);
		$50.setBackground(UIManager.getColor("Button.background"));
		$50.setText("$50");
		$50.setBounds(291, 11, 24, 20);
		add($50);
		
		JTextPane $60 = new JTextPane();
		$60.setEditable(false);
		$60.setBackground(UIManager.getColor("Button.background"));
		$60.setText("$60");
		$60.setBounds(291, 54, 24, 20);
		add($60);
		
		JTextPane $70 = new JTextPane();
		$70.setEditable(false);
		$70.setBackground(UIManager.getColor("Button.background"));
		$70.setText("$70");
		$70.setBounds(291, 96, 24, 20);
		add($70);
		
		JTextPane $80 = new JTextPane();
		$80.setEditable(false);
		$80.setBackground(UIManager.getColor("Button.background"));
		$80.setText("$80");
		$80.setBounds(291, 139, 24, 20);
		add($80);

	}
}
