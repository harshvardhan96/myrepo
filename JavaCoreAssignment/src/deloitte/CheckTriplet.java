package deloitte;

import java.util.Scanner;

public class CheckTriplet {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array followed by elements of array");
		int length=scan.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=scan.nextInt();
		}	
		System.out.println(checkTripplets(arr));
	}
	public static boolean checkTripplets(int arr[]) {
		int len=arr.length;
		for(int i=0;i<(len-2);i++)
		{
			if(arr[i]==arr[i+1]&&arr[i]==arr[i+2])
			{
				return true;
			}
		}
		return false;
	}

}
