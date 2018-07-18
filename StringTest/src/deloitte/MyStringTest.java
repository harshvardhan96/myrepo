package deloitte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringTest {
	
	Pattern pattern;
	Matcher matcher;
	public String regex = "^\\d{3}--\\d{2}--\\d{4}$";
	
	public MyStringTest()
	{
		pattern = Pattern.compile(regex);
	}
	
	public boolean validate(String str)
	{
		boolean valid = false;
		matcher = pattern.matcher(str);
		valid = matcher.matches();
		return valid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<7;i++)
		{
			if(i==4)
			{
				System.out.print("    ");
				for(int j=0;j<5;j++)
				{
					System.out.print(" *");
				}
			}
			else if(i==5)
			{
				System.out.print("  ");
				for(int j=0;j<7;j++)
				{
					System.out.print(" *");
				}
			}
			else if(i==6)
			{
				
				for(int j=0;j<9;j++)
				{
					System.out.print(" *");
				}
			}
			else
			{
				System.out.print("  ");
				if(i==1)
				{
					System.out.print("      ");
				}
				if(i==3)
				{
					System.out.print("    ");
				}
				if(i==2)
				{
					System.out.print("     ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
