package deloitte;

import java.util.Scanner;

public class Division extends Arithmetic {

	@Override
	public void calculate(int var1, int var2) {
		try
		{
			int res = var1/ var2;
			this.display(res);
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid expression.");
		}
	
	}
}
