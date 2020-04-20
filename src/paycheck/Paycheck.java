package paycheck;

import java.util.Scanner;

public class Paycheck {
	protected Paycheckkind kind = Paycheckkind.Employee;
	protected String position;
	protected String name;
	protected int id;
	protected int pay;
	protected int produce;
	protected int bonus;
	
	public Paycheck(){
		
	}


//	public Paycheck(String position, String name,int id, int pay, int produce, int bonus) {
//		this.position = position;
//		this.id = id;
//		this.name = name;
//		this.pay = pay;
//		this.produce = produce;
//	}

	public Paycheck(String position, String name, int id, int pay, int produce, int bonus) {
		this.position = position;
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.produce = produce;
		this.bonus = bonus;
	}

//	public Paycheck(String position, String name, int id, int pay, int bonus) {
//		this.position = position;
//		this.id = id;
//		this.name = name;
//		this.pay = pay;
//		this.bonus = bonus;
//	}
	
	public Paycheckkind getKind() {
		return kind;
	}


	public void setKind(Paycheckkind kind) {
		this.kind = kind;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPay() {
		return pay;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}


	public int getProduce() {
		return produce;
	}


	public void setProduce(int produce) {
		this.produce = produce;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void printInfo() {
		System.out.println("<" + position + ">");
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("pay:" + pay);
		System.out.println("porduce:" + produce);
		System.out.println("bonus:" + bonus);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Employee position:");
		String position = input.next();
		this.setPosition(position);
		
		System.out.print("Employee Id:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Employee name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Employee pay:");
		int pay = input.nextInt();
		this.setPay(pay);
		
//		System.out.print("How many produce:");
//		int produce = input.nextInt();
//		this.setProduce(produce);
//		
//		System.out.print("Bonus:");		
//		int bonus = input.nextInt();
//		this.setBonus(bonus);
	}
}