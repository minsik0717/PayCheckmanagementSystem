package paymentGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.PaycheckManager;

public class WindowFrame extends JFrame {
	
	PaycheckManager paycheckManager;
	
	MenuSelection menuselection;
	EmployeeAdder employeeadder;
	EmployeeViewer employeeviewer;
	
	public WindowFrame(PaycheckManager paycheckManager) {
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frmae");
		
		this.paycheckManager = paycheckManager;
		menuselection = new MenuSelection(this);
		employeeadder = new EmployeeAdder(this);
		employeeviewer = new EmployeeViewer(this, this.paycheckManager);
					

		this.add(menuselection);

		this.setVisible(true);
	}

	public void setupPanel (JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public EmployeeAdder getEmployeeadder() {
		return employeeadder;
	}

	public void setEmployeeadder(EmployeeAdder employeeadder) {
		this.employeeadder = employeeadder;
	}

	public EmployeeViewer getEmployeeviewer() {
		return employeeviewer;
	}

	public void setEmployeeviewer(EmployeeViewer employeeviewer) {
		this.employeeviewer = employeeviewer;
	}
}
