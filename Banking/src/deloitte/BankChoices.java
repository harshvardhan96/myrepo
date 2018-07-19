package deloitte;

import java.util.Scanner;

public class BankChoices {
	
	private BankingService bService;
	
	public BankChoices()
	{
		bService = new BankingServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Login:");
		String login = sc.nextLine();
		System.out.println("Enter password: ");
		String pass = sc.nextLine();
		boolean val = bService.Validate(login,pass);
		if(!val)
		{
			System.out.println("Incorrect Login or Password!");
		}
		else
		{
		int choice = 0;
		while(true)
		{
			choice = getChoice(sc);
			switch(choice)
			{
			 case 1: System.out.println(" Enter amount to be deposited.");
			 		 double amount = sc.nextDouble();
			 		 bService.depositAmount(amount);
			 		 break;
			 case 2: System.out.println(" Enter amount to be withdrawn.");
	 		 		 amount = sc.nextDouble();
	 		 		 bService.withdrawAmount(amount);
	 		 		 break;
			 case 3: System.out.println("CHECK BALANCE");
					 double balance = bService.getBalance();
					 System.out.println("Balance: " + balance);
					 break;
			 case 4: System.out.println("Exiting... Thank you.");
			         System.exit(0);
			         break;
			 default : System.out.println("Enter the correct option!");
			 			break;
			}
			
		}
	}
}

	private int getChoice(Scanner sc) {
		
		int val =0;
		System.out.println("Banking System!");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4. Quit program");
		System.out.println("Enter a choice :");
		try {
		val = sc.nextInt();
		}
		catch(Exception e)
		{
			System.err.println("Please enter numbers only!");
			sc.nextLine();
		}
		return val;
	}

	public static void main(String[] args) {
		
		new BankChoices();
	}

}
