package satm_interface_gui;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;


public class balancePrint extends JPanel {
	private JTextField balancePrinting;
	private JTextField newTransaction;
	private JTextField yes;
	private JTextField no;

	/**
	 * Create the panel.
	 */
	public balancePrint() {
		setLayout(null);
		
		balancePrinting = new JTextField();
		balancePrinting.setBackground(Color.WHITE);
		balancePrinting.setEditable(false);
		balancePrinting.setHorizontalAlignment(SwingConstants.CENTER);
		balancePrinting.setText("Your new balance is being printed.");
		balancePrinting.setBounds(62, 25, 200, 50);
		add(balancePrinting);
		balancePrinting.setColumns(10);
		
		newTransaction = new JTextField();
		newTransaction.setBackground(Color.WHITE);
		newTransaction.setEditable(false);
		newTransaction.setText("New transaction?");
		newTransaction.setHorizontalAlignment(SwingConstants.CENTER);
		newTransaction.setColumns(10);
		newTransaction.setBounds(62, 93, 200, 71);
		add(newTransaction);
		
		yes = new JTextField();
		yes.setBackground(Color.WHITE);
		yes.setEditable(false);
		yes.setText("YES\r\n");
		yes.setBounds(278, 93, 30, 30);
		yes.setHorizontalAlignment(SwingConstants.CENTER);
		add(yes);
		yes.setColumns(10);
		
		no = new JTextField();
		no.setBackground(Color.WHITE);
		no.setEditable(false);
		no.setText("NO");
		no.setColumns(10);
		no.setBounds(278, 134, 30, 30);
		no.setHorizontalAlignment(SwingConstants.CENTER);
		add(no);

	}
}
