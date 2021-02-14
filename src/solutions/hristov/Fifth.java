package solutions.hristov;

public class Fifth
{
	public static void main(String[] args)
	{
		printTriangleOfNumbers(1, 3, 9);
	}
	
	public static void printTriangleOfNumbers(int currentCol, int cols, int rows)
	{
		if(currentCol > rows)
		{
			return;
		}
		
		if(currentCol > cols)
		{
			System.out.println();
			printTriangleOfNumbers(1, cols + 1, rows);
			return;
		}
		
		System.out.print(currentCol + " ");
		
		printTriangleOfNumbers(currentCol + 1, cols, rows);
	}
}
