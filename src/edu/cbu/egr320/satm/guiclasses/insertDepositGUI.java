package satm_interface_gui;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;


public class insertDepositGUI extends JPanel {
	private JTextField txtPleaseInsertYour;

	/**
	 * Create the panel.
	 */
	public insertDepositGUI() {
		setLayout(null);
		
		txtPleaseInsertYour = new JTextField();
		txtPleaseInsertYour.setBackground(Color.WHITE);
		txtPleaseInsertYour.setEditable(false);
		txtPleaseInsertYour.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseInsertYour.setText("Please insert your deposit");
		txtPleaseInsertYour.setBounds(62, 55, 201, 65);
		add(txtPleaseInsertYour);
		txtPleaseInsertYour.setColumns(10);

	}
}
