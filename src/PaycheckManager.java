import java.util.Scanner;

public class PaycheckManager {
	Paycheck paycheck;
	Scanner input;
	PaycheckManager(Scanner input) {
		this.input = input;
	}
	
	public void produer() {
		paycheck = new Paycheck();
		
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
		
	}
	
	public void employee() {
		System.out.print("Employee position:");
		paycheck.position = input.next();
		
		System.out.print("Produer Id:");
		paycheck.id = input.nextInt();
		
		System.out.print("Employee name:");
		String employeename = input.next();
		
		System.out.print("Employee pay:");
		int employeepay = input.nextInt();
				
		}
	
	public void executive() {
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
			}
	

	public void viewpaycheck() {
		System.out.print("Id:");
		int paycheckId = input.nextInt();
		if(paycheck.id == paycheckId) {
			paycheck.printInfo();
		}
	}

}
