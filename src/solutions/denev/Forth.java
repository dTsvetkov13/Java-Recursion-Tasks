package solutions.denev;

import java.util.Scanner;

public class Forth
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		
		printNumberFromRight(n);
		System.out.println(n);
		
		scan.close();
	}
	
	public static void printNumberFromRight(int number)
	{
		String numberAsString = Integer.toString(number);
		
		printNumberFromRight(numberAsString, numberAsString.length() - 1);
	}
	
	public static void printNumberFromRight(String number, int index)
	{
		if(index == 0)
		{
			if(number.charAt(index) != '-')
			{
				System.out.print(number.charAt(index));
			}
			System.out.println();
			return;
		}
		
		System.out.print(number.charAt(index) + ", ");
		printNumberFromRight(number, index - 1);
	}
}
