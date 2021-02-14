package solutions;

public class Eighth
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {12, 4, 2, 24};
		
		System.out.println(gcdOfArray(arr, arr[0], 1));
	}
	
	public static int gcdOfArray(int arr[], int currentGCD, int index)
	{
		if(index >= (arr.length - 1))
		{
			return gcd(currentGCD, arr[index]);
		}
		
		currentGCD = gcd(currentGCD, arr[index]);
		
		return gcdOfArray(arr, currentGCD, index + 1);
	}
	
	public static int gcd(int a, int b)
	{
		if(a == 0)
		{
			return b;
		}
		if(b == 0)
		{
			return a;
		}
		
		if(a > b)
		{
			return gcd(b, a % b);
		}
		else
		{
			return gcd(a, b % a);
		}
	}
}
