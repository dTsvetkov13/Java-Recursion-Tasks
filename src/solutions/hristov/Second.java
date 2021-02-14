package solutions.hristov;

import java.util.Scanner;

public class Second
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = scan.nextInt();
		
		System.out.print("Enter last number: ");
		int lastNumber = scan.nextInt();
		
		printNumbers(firstNumber, lastNumber);
		
		scan.close();
	}
	
	public static void printNumbers(int currentNumber, int lastNumber)
	{
		if(currentNumber > lastNumber)
		{
			return;
		}
		
		System.out.print(currentNumber + " ");
		
		if(currentNumber % 3 == 0)
		{
			System.out.print("Fizz ");
		}
		
		if(currentNumber % 5 == 0)
		{
			System.out.print("Buzz ");
		}
		
		System.out.println();
		
		printNumbers(currentNumber + 1, lastNumber);
	}
}
