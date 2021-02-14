package solutions;

public class Seventh
{
	public static void main(String[] args)
	{
		System.out.println(gcd(34, 12));
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
