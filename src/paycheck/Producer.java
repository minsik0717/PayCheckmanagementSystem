package paycheck;

import java.util.Scanner;

import exception.EmailFormatException;

public class Producer extends Paycheck {

	public Producer(Paycheckkind kind){
		super(kind);
	}



	public void getUserInput(Scanner input) {
		setPaycheckID(input);
		setPaycheckName(input);
		setPaycheckPay(input);
		setPaycheckProduce(input);
		setPaycheckEmail(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("<" + skind	 + ">");
		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("pay:" + pay);
		System.out.println("porduce:" + produce);
		System.out.println("Email: " + email);
	}

//	public void setPaycheckEmailwithYN (Scanner input) {
//		char answer = 'x';
//		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
//		{
//			System.out.println("Do you have an email address? (Y/N)");
//			answer = input.next().charAt(0);
//			try {
//				if (answer == 'y' || answer == 'Y') {
//					System.out.println("Email address: ");
//					String email = input.next();
//					this.setEmail(email);
//					break;
//				}
//				else if (answer == 'n' || answer == 'N') {
//					this.setEmail("");
//					break;
//				}
//				else {
//				}
//			}
//			catch(EmailFormatException e) {
//				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
//			}
//		}
//	}
}
