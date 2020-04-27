package paycheck;

import java.util.Scanner;

public class Executive extends Paycheck {
	
	public Executive(Paycheckkind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
//		System.out.print("Executive position:");
//		String position = input.next();
//		this.setPosition(position);
		
		System.out.print("Executive Id:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Executive name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Executive pay:");
		int pay = input.nextInt();
		this.setPay(pay);
		
//		System.out.print("How many produce:");
//		int produce = input.nextInt();
//		this.setProduce(produce);
		
		System.out.print("Bonus:");		
		int bonus = input.nextInt();
		this.setBonus(bonus);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Producer:
			skind = "Producer";
			break;
		case Employee:
			skind = "Employee";
			break;
		case Executive:
			skind = "Executive";
			break;
		default:
		}
		System.out.println("<" + skind	 + ">");
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("pay:" + pay);
		//System.out.println("porduce:" + produce);
		System.out.println("bonus:" + bonus);
	}
}
