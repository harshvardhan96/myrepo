package deloitte;

import java.util.Scanner;

public abstract class Arithmetic {
		int var1,var2;		
		public abstract void calculate(int a, int b);		
		public  void read()
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 2 numbers: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				this.calculate(a, b);
			}
			catch(Exception e)
			{
				System.out.println("Enter a valid expression.");
			}
		
		}
		public  void display(int res)
		{
			System.out.println("Result :" + res);
		}

}