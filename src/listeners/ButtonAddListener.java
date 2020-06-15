package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import paymentGUI.EmployeeAdder;
import paymentGUI.EmployeeViewer;
import paymentGUI.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		EmployeeAdder adder = frame.getEmployeeadder();
		frame.setupPanel(adder);
	}
}
