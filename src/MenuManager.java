import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PaycheckManager paycheckManager = new PaycheckManager(input);
		int num = -1;

		while (num != 6) {
			System.out.println("*** PayCheck Management System Menu ***");
			System.out.println(" 1.Producers");
			System.out.println(" 2.Employees");
			System.out.println(" 3.Executives");
			System.out.println(" 4.Edit");
			System.out.println(" 5.View PayChecks");
			System.out.println(" 6.Exit");
			System.out.print("Select one number between 1 - 6:");
			num = input.nextInt();
			if (num == 1) {
				paycheckManager.produer();
			}
			else if (num == 2) {
				paycheckManager.employee();
			}
			else if (num == 3) {
				paycheckManager.executive();
			}
			else if(num == 4){
				paycheckManager.edit();
			}
			else if(num == 5){
				paycheckManager.viewpaychecks();
			}
			else {
				continue;
			}


		}
	}
	
	
}
