package paycheck;

import java.util.Scanner;

public class Executive extends Paycheck {

	public Executive(Paycheckkind kind){
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setPaycheckID(input);
		setPaycheckName(input);
		setPaycheckPay(input);	
		setPaycheckBonus(input);
		setPaycheckEmail(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("<" + skind	 + ">");
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("pay:" + pay);
		System.out.println("bonus:" + bonus);
		System.out.println("Email: " + email);
	}
}
