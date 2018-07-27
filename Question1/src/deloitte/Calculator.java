package deloitte;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("0. Addition 1. Substraction 2. Multiplication 3. Division");
			System.out.println("Enter option :");
			int option = sc.nextInt();
			Arithmetic[] arr = {new Addition(),new Substraction(),new Multiplication(),new Division()};
			arr[option].read();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}



}
