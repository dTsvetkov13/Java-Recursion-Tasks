package solutions.denev;

import java.util.Scanner;

public class First
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		
		System.out.println("Sum: " + sumInRange(0, n));
	}
	
	public static int sumInRange(int currentNum, int lastNum)
	{
		if(currentNum == lastNum)
		{
			return lastNum;
		}
		
		return currentNum + sumInRange(currentNum + 1, lastNum);
	}
}
