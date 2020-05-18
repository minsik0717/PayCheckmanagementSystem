import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PaycheckManager paycheckManager = new PaycheckManager(input);

		selectMenu(input, paycheckManager);
	}

	public static void selectMenu(Scanner input, PaycheckManager paycheckManager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();

				switch(num) {
				case 1:
					paycheckManager.addemployees();
					break;
				case 2:
					paycheckManager.deleteemployees();
					break;
				case 3:
					paycheckManager.editemployees();
					break;
				case 4:
					paycheckManager.viewpaychecks();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
				System.out.println(num);
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** PayCheck Management System Menu ***");
		System.out.println(" 1.Add employees");
		System.out.println(" 2.Delete employees");
		System.out.println(" 3.Edit employees");
		System.out.println(" 4.View PayChecks");
		System.out.println(" 5.Exit");
		System.out.print("Select one number between 1 - 5:");
	}
}
