import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 4;

		while (num != 5) {
			System.out.println("*** PayCheck Management System Menu ***");
			System.out.println(" 1.Producer");
			System.out.println(" 2.Employee");
			System.out.println(" 3.Executive");
			System.out.println(" 4.View PayCheck");
			System.out.println(" 5.Exit");
			System.out.print("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num == 1) {
				produer();
			}
			else if (num == 2) {
				employee();
			}
			else if (num == 3) {
				executive();
			}
			else {
				continue;
			}

		}
	}
	
	public static void produer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Produer name:");
		String producername = input.next();
		
		System.out.print("Produer pay:");
		int producerpay = input.nextInt();
		
		System.out.print("How many produce:");
		int howmanyproduce = input.nextInt();
		
		System.out.println(producername);
		System.out.println(producerpay);
		System.out.println(howmanyproduce);
	}
	
	public static void employee() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee name:");
		String employeename = input.next();
		
		System.out.print("Employee pay:");
		int employeepay = input.nextInt();
				
		System.out.println(employeename);
		System.out.println(employeepay);
		}
	
	public static void executive() {
		Scanner input = new Scanner(System.in);
		System.out.print("Executive name:");
		String executivename = input.next();
		
		System.out.print("Executive pay:");
		int executivepay = input.nextInt();
		
		System.out.print("Bonus:");
		int bonus = input.nextInt();
		
		System.out.println(executivename);
		System.out.println(executivepay);
		System.out.println(bonus);
	}
	

	public static void viewpaycheck() {

	}
}
