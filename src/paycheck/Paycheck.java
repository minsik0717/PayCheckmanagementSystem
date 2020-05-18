package paycheck;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class Paycheck implements PaycheckInput{
	protected Paycheckkind kind = Paycheckkind.Employee;
	protected String name;
	protected int id;
	protected int pay;
	protected int produce;
	protected int bonus;
	protected String email;

	public Paycheck(){

	}

	public Paycheck(Paycheckkind kind){
		this.kind = kind;
	}

	public Paycheck(String name, int id, int pay, int produce, int bonus, String email) {	
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.produce = produce;
		this.bonus = bonus;
		this.email = email;
	}

	public Paycheck(Paycheckkind kind, String name, int id, int pay, int produce, int bonus, String email) {
		this.kind = kind;
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.produce = produce;
		this.bonus = bonus;
		this.email = email;
	}

	public Paycheckkind getKind() {
		return kind;
	}


	public void setKind(Paycheckkind kind) {
		this.kind = kind;
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

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}

		this.email = email;
	}


	public String getEmail() {
		return email;
	}


	public abstract void printInfo();

	public void setPaycheckID(Scanner input) {
		System.out.print("Enter Id:");
		int id = input.nextInt();
		this.setId(id);
	}

	public void setPaycheckName(Scanner input) {
		System.out.print("Enter Name:");
		String name = input.next();
		this.setName(name);
	}

	public void setPaycheckPay(Scanner input) {
		System.out.print("Enter pay:");
		int pay = input.nextInt();
		this.setPay(pay);
	}

	public void setPaycheckProduce(Scanner input) {
		System.out.print("How many produce:");
		int produce = input.nextInt();
		this.setProduce(produce);
	}

	public void setPaycheckBonus(Scanner input) {
		System.out.print("Bonus:");		
		int bonus = input.nextInt();
		this.setBonus(bonus);
	}

	public void setPaycheckEmail(Scanner input) {
		String email = ""; 
		while (!email.contains("@")) {
			System.out.print("Email address:");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public String getKindString() {
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
		return skind;
	}
}