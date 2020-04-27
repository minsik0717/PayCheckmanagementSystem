import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PaycheckManager paycheckManager = new PaycheckManager(input);
		int num = -1;

		while (num != 5) {
			System.out.println("*** PayCheck Management System Menu ***");
			System.out.println(" 1.Add employees");
			System.out.println(" 2.Delete employees");
			System.out.println(" 3.Edit employees");
			System.out.println(" 4.View PayChecks");
			System.out.println(" 5.Exit");
			System.out.print("Select one number between 1 - 5:");
			
			num = input.nextInt();
			if (num == 1) {
				paycheckManager.addemployees();
			}
			else if (num == 2) {
				paycheckManager.deleteemployees();
			}
			else if (num == 3) {
				paycheckManager.editemployees();
			}
			else if(num == 4){
				paycheckManager.viewpaychecks();
			}
			else {
				continue;
			}


		}
	}
}
