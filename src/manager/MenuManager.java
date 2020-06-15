package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;
import paymentGUI.WindowFrame;

public class MenuManager {
	static EventLogger logger = new EventLogger ("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PaycheckManager paycheckManager = getObject("paycheckmanager.ser");
		if (paycheckManager == null) { 
			paycheckManager = new PaycheckManager(input);
		}
		else {
			paycheckManager.setScanner(input);
		}

		WindowFrame frame = new WindowFrame(paycheckManager);
		selectMenu(input, paycheckManager);
		putObject(paycheckManager, "paycheckmanager.ser");
	}

	public static void selectMenu(Scanner input, PaycheckManager paycheckManager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();

				switch(num) {
				case 1:
					paycheckManager.addemployees();
					logger.log("add a employee");
					break;
				case 2:
					paycheckManager.deleteemployees();
					logger.log("delete a employee");
					break;
				case 3:
					paycheckManager.editemployees();
					logger.log("edit a employee");
					break;
				case 4:
					paycheckManager.viewpaychecks();
					logger.log("edit a list of employee");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
				System.out.println(num);
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** PayCheck Management System Menu ***");
		System.out.println(" 1.Add employees");
		System.out.println(" 2.Delete employees");
		System.out.println(" 3.Edit employees");
		System.out.println(" 4.View PayChecks");
		System.out.println(" 5.Exit");
		System.out.print("Select one number between 1 - 5:");
	}

	public static PaycheckManager getObject(String filename) {
		PaycheckManager paycheckManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			paycheckManager = (PaycheckManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return paycheckManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return paycheckManager;
	}

	public static void putObject(PaycheckManager paycheckManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(paycheckManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block.
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
