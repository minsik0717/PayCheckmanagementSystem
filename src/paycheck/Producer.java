package paycheck;

import java.util.Scanner;

public class Producer extends Paycheck {
	
	public Producer(Paycheckkind kind){
		super(kind);
	}
	

	
	public void getUserInput(Scanner input) {
		setPaycheckID(input);
		setPaycheckName(input);
		setPaycheckPay(input);
		setPaycheckProduce(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("<" + skind	 + ">");
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("pay:" + pay);
		System.out.println("porduce:" + produce);
	}
	

}
