package solutions;

import java.util.Scanner;

public class Second
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		
		System.out.println("Sum of it's digits: " + sumOfDigits(n));
	}
	
	public static int sumOfDigits(int number)
	{
		//Makes the function works with negative numbers
		if(number < 0)
		{
			number *= -1;
		}
		
		if(number == 0)
		{
			return 0;
		}
		
		return (number % 10) + sumOfDigits(number / 10);
	}
}
