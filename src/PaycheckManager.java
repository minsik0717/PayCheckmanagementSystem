import java.util.ArrayList;
import java.util.Scanner;

import paycheck.Executive;
import paycheck.Paycheck;
import paycheck.Producer;

public class PaycheckManager {
	ArrayList<Paycheck> paychecks = new ArrayList<Paycheck>();
	Scanner input;
	PaycheckManager(Scanner input) {
		this.input = input;
	}
	
	public void addemployees() {
		int kind = 0;
		Paycheck paycheck;
		while(kind != 1 && kind != 2 && kind != 3) {
			System.out.print("1 for Producer");
			System.out.print("2 for Employee");
			System.out.print("3 for Executive");
			System.out.print("Select num for Employee kind between 1 and 3:");
			kind = input.nextInt();
			if(kind == 1) {
				paycheck = new Producer();
				paycheck.getUserInput(input);
				paychecks.add(paycheck);
				break;
			}
			else if (kind == 2) {
				paycheck = new Paycheck();
				paycheck.getUserInput(input);
				paychecks.add(paycheck);
				break;
			}
			else if (kind == 3) {
				paycheck = new Executive();
				paycheck.getUserInput(input);
				paychecks.add(paycheck);
				break;
			}
			else {
				System.out.print("Select num for Employee kind between 1 and 3:");
			}
		}
	}
	
		public void deleteemployees() {
			System.out.print("Enter Id:");
			int id = input.nextInt();
			int index = -1;
			for (int i = 0; i<paychecks.size(); i++) {
				Paycheck paycheck = paychecks.get(i);
				if(paychecks.get(i).getId() == id) {
					index = i;
					break;
				}
			}
			if (index >= 0) {
				paychecks.remove(index);
				System.out.println("the employee" + id + "is deleted");
			}
		}
		
	public void editemployees() {
		System.out.print("Enter Id:");
		int id = input.nextInt();
		for (int i = 0; i<paychecks.size(); i++) {
			Paycheck paycheck = paychecks.get(i);
			if(paycheck.getId() == id) {
				int num = -1;
				while (num != 5) {
					System.out.println("*** PayCheck Info Edit Menu ***");
					System.out.println(" 1.Edit Position");
					System.out.println(" 2.Edit Id");
					System.out.println(" 3.Edit Name");
					System.out.println(" 4.Edit Pay");
					System.out.println(" 5.Exit");
					System.out.print("Select one number between 1 - 5:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Enter Position:");
						String position = input.next();
						paycheck.setPosition(position);
					}
					else if (num == 2) {
						System.out.print("Enter Id:");
						int Id = input.nextInt();
						paycheck.setId(id);
					}
					else if (num == 3) {
						System.out.print("Enter Name:");
						String name = input.next();
						paycheck.setName(name);
					}
					else if(num == 4){
						System.out.print("Enter pay:");
						int pay = input.nextInt();
						paycheck.setPay(pay);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	
	public void viewpaychecks() {
//		System.out.print("Id:");
//		int paycheckId = input.nextInt();
		System.out.println("# of registered paychecks:" + paychecks.size());
		for (int i = 0; i<paychecks.size(); i++) {
			paychecks.get(i).printInfo();
		}
	}

}
