package solutions.denev;

import java.util.Scanner;

public class Third
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		
		printNumberFromLeft(n);
		System.out.println(n);
		
		scan.close();
	}
	
	public static void printNumberFromLeft(int number)
	{
		printNumberFromLeft(Integer.toString(number), 0);
	}
	
	public static void printNumberFromLeft(String number, int index)
	{
		if(index == 0 && number.charAt(index) == '-')
		{
			printNumberFromLeft(number, index + 1);
			return;
		}
		
		if(number.length() == index)
		{
			System.out.println();
			return;
		}
		
		System.out.print(number.charAt(index) + ", ");
		printNumberFromLeft(number, index + 1);
	}
}
