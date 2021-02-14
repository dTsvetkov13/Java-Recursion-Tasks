package solutions.hristov;

public class Third
{
	public static void main(String[] args)
	{
		int[] array = { -1, -7, 30, 4, 1, 5};
		boolean findMax = true;
		
		int result = findElement(array, 0, array[0], findMax);
		System.out.println(result);
	}
	
	public static int findElement(int[] array, int index, int currentResult, boolean findMax)
	{
		if (index >= array.length)
		{
			return currentResult;
		}
		
		if (findMax && currentResult < array[index]
			 || !findMax && currentResult > array[index])
		{
			currentResult = array[index];
		}
		
		return findElement(array, index + 1, currentResult, findMax);
	}
}
