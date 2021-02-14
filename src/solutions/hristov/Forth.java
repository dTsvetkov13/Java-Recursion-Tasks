package solutions.hristov;

public class Forth
{
	public static void main(String[] args)
	{
		char firstLetter = 'A';
		char lastLetter = 'D';
		printTriangleOfLetters(firstLetter, lastLetter, 0, 0);
	}
	
	public static void printTriangleOfLetters(char firstLetter, char lastLetter, int row, int col)
	{
		if (row > lastLetter - 'A')
		{
			return;
		}
		
		System.out.print((char)('A' + col));
		col++;
		
		if (col > lastLetter - 'A' - row)
		{
			col = 0;
			row++;
			System.out.println();
		}
		
		printTriangleOfLetters(firstLetter, lastLetter, row, col);
	}
}
