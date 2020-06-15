package paycheck;

import java.util.Scanner;

import exception.EmailFormatException;

public interface PaycheckInput {

	public int getId();

	public void setId(int id);

	public String getName();
	
	public void setName(String name);

	public int getPay();
	
	public void setPay(int pay);
	
	public String getEmail();
	
	public void setEmail(String email) throws EmailFormatException;

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setPaycheckID(Scanner input);

	public void setPaycheckName(Scanner input);

	public void setPaycheckPay(Scanner input);

	public void setPaycheckProduce(Scanner input);

	public void setPaycheckBonus(Scanner input);
	
	public void setPaycheckEmail(Scanner input);
}
