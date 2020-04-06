public class Paycheck {
	String position;
	String name;
	int id;
	int pay;
	int produce;
	int bonus;
	public Paycheck(){
		
	}


	public Paycheck(String position, String name,int id, int pay, int produce, int bonus) {
		this.position = position;
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.produce = produce;
	}

	public Paycheck(String position, String name, int id, int pay) {
		this.position = position;
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	public Paycheck(String position, String name, int id, int pay, int bonus) {
		this.position = position;
		this.id = id;
		this.name = name;
		this.pay = pay;
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
}