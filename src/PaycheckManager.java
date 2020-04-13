import java.util.ArrayList;
import java.util.Scanner;

public class PaycheckManager {
	ArrayList<Paycheck> paychecks = new ArrayList<Paycheck>();
	Scanner input;
	PaycheckManager(Scanner input) {
		this.input = input;
	}
	
	public void produer() {
		Paycheck paycheck = new Paycheck();
		
		System.out.print("Produer position:");
		paycheck.position = input.next();
		
		System.out.print("Produer Id:");
		paycheck.id = input.nextInt();
		
		System.out.print("Produer name:");
		paycheck.name = input.next();
		
		System.out.print("Produer pay:");
		paycheck.pay = input.nextInt();
		
		System.out.print("How many produce:");
		paycheck.produce = input.nextInt();
		
		paychecks.add(paycheck);
	}
	
	public void employee() {
		Paycheck paycheck = new Paycheck();
		
		System.out.print("Employee position:");
		paycheck.position = input.next();
		
		System.out.print("Produer Id:");
		paycheck.id = input.nextInt();
		
		System.out.print("Employee name:");
		String employeename = input.next();
		
		System.out.print("Employee pay:");
		int employeepay = input.nextInt();
				
		paychecks.add(paycheck);
		}
	
	public void executive() {
		Paycheck paycheck = new Paycheck();
		
		System.out.print("Executive position:");
		paycheck.position = input.next();
		
		System.out.print("Produer Id:");
		paycheck.id = input.nextInt();
		
		System.out.print("Executive name:");
		String executivename = input.next();
		
		System.out.print("Executive pay:");
		int executivepay = input.nextInt();
		
		System.out.print("Bonus:");
		int bonus = input.nextInt();
		
		paychecks.add(paycheck);
			}
	
	public void edit() {
		System.out.print("Enter Id:");
		int id = input.nextInt();
		for (int i = 0; i<paychecks.size(); i++) {
			Paycheck paycheck = paychecks.get(i);
			if(paycheck.id == id) {
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
						paycheck.position = input.next();
					}
					else if (num == 2) {
						System.out.print("Enter Id:");
						paycheck.id = input.nextInt();
					}
					else if (num == 3) {
						System.out.print("Enter Name:");
						paycheck.name = input.next();
					}
					else if(num == 4){
						System.out.print("Enter pay:");
						paycheck.pay = input.nextInt();
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
		for (int i = 0; i<paychecks.size(); i++) {
			paychecks.get(i).printInfo();
		}
	}

}
