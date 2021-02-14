package solutions.denev;

import java.util.Scanner;

public class Fifth
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		
		System.out.print("Enter k: ");
		int k = scan.nextInt();
		
		printSequence(n, 1, k, true);
		
		scan.close();
	}
	
	public static void printSequence(int number, int power, int greatestPower, boolean isIncreasing)
	{
		if(isIncreasing && power > greatestPower)
		{
			isIncreasing = false;
			printSequence(number, greatestPower, greatestPower, isIncreasing);
			return;
		}
		
		System.out.println((int)Math.pow(number, power));
		
		power = isIncreasing ? power + 1 : power - 1;
		
		if(!isIncreasing && power <= 0)
		{
			return;
		}
		
		printSequence(number, power, greatestPower, isIncreasing);
	}
}
