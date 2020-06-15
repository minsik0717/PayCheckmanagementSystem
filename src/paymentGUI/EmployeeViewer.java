package paymentGUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.PaycheckManager;
import paycheck.PaycheckInput;

public class EmployeeViewer extends JPanel {

	WindowFrame frame;
	PaycheckManager paycheckManager;

	public EmployeeViewer(WindowFrame frame, PaycheckManager paycheckManager) {
		this.frame = frame;
		this.paycheckManager = paycheckManager;

		System.out.println("***" + paycheckManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Pay");
		model.addColumn("E-mail");

		for (int i=0; i<paycheckManager.size(); i++) {
			Vector row = new Vector();
			PaycheckInput pa = paycheckManager.get(i);
			row.add(pa.getId());
			row.add(pa.getName());
			row.add(pa.getPay());
			row.add(pa.getEmail());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

	}
}
