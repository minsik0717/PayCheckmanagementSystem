import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import paycheck.Employee;
import paycheck.Executive;
import paycheck.Paycheck;
import paycheck.PaycheckInput;
import paycheck.Paycheckkind;
import paycheck.Producer;

public class PaycheckManager {
	ArrayList<PaycheckInput> paychecks = new ArrayList<PaycheckInput>();
	Scanner input;
	PaycheckManager(Scanner input) {
		this.input = input;
	}

	public void addemployees() {
		int kind = 0;
		PaycheckInput paycheckInput;
		while(kind < 1 || kind > 3) {
			try {
				showaddEmployee();
				kind = input.nextInt();
				switch(kind) {
				case 1:
					paycheckInput = new Producer(Paycheckkind.Producer);
					paycheckInput.getUserInput(input);
					paychecks.add(paycheckInput);
					break;
				case 2:
					paycheckInput = new Employee(Paycheckkind.Employee);
					paycheckInput.getUserInput(input);
					paychecks.add(paycheckInput);
					break;
				case 3:
					paycheckInput = new Executive(Paycheckkind.Executive);
					paycheckInput.getUserInput(input);
					paychecks.add(paycheckInput);
					break;
				default:
					System.out.println("Select num for Employee kind between 1 and 3:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void showaddEmployee() {
		System.out.println("1 for Producer");
		System.out.println("2 for Employee");
		System.out.println("3 for Executive");
		System.out.println("Select num for Employee kind between 1 and 3:");
	}

	public void deleteemployees() {
		System.out.print("Enter Id:");
		int id = input.nextInt();
		int index = findIndex(id);
		removefromEmployees(index, id);
	}

	public int findIndex(int id) {
		int index = -1;
		for (int i = 0; i<paychecks.size(); i++) { 
			if(paychecks.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromEmployees(int index, int id) {
		if (index >= 0) {
			paychecks.remove(index);
			System.out.println("the employee" + id + "is deleted");
			return 1;
		}
		else {
			System.out.println("the employee has not been registered");
			return -1;
		}
	}

	public void editemployees() {
		System.out.print("Enter Id:");
		int id = input.nextInt();
		for (int i = 0; i<paychecks.size(); i++) {
			PaycheckInput paycheck = paychecks.get(i);
			if(paycheck.getId() == id) {
				int num = -1;
				while (num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num){
					case 1:
						paycheck.setPaycheckID(input);
						break;
					case 2:
						paycheck.setPaycheckName(input);
						break;
					case 3:	
						paycheck.setPaycheckPay(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewpaychecks() {
		System.out.println("# of registered paychecks:" + paychecks.size());
		for (int i = 0; i<paychecks.size(); i++) {
			paychecks.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("*** PayCheck Info Edit Menu ***");
		System.out.println(" 1.Edit Id");
		System.out.println(" 2.Edit Name");
		System.out.println(" 3.Edit Pay");
		System.out.println(" 4.Exit");
		System.out.print("Select one number between 1 - 4:");
	}
}
