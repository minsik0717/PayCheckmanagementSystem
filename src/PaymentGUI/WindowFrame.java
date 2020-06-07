package PaymentGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	MenuSelection menuselection;
	EmployeeAdder employeeadder;
	EmployeeViewer employeeviewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.employeeadder = new EmployeeAdder(this);
		this.employeeviewer = new EmployeeViewer(this);
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		this.setupPanel(menuselection);
		
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
