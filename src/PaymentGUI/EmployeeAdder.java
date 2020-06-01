package PaymentGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class EmployeeAdder extends JFrame {
	
	public EmployeeAdder () {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPay = new JLabel("Pay: ", JLabel.TRAILING);
		JTextField fieldPay = new JTextField(10);
		labelPay.setLabelFor(fieldPay);
		panel.add(labelPay);
		panel.add(fieldPay);
		
		JLabel labelEmail = new JLabel("Email: ", JLabel.TRAILING);
		JTextField fieldEmail  = new JTextField(10);
		labelEmail .setLabelFor(fieldEmail );
		panel.add(labelEmail );
		panel.add(fieldEmail );
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
